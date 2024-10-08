package AshutoshRajput.Makersharks.Service.ServiceImpl;

import AshutoshRajput.Makersharks.DTO.SupplierDTO;
import AshutoshRajput.Makersharks.Entity.Supplier;
import AshutoshRajput.Makersharks.ExceptionHandling.ResourceAlreadyExistsException;
import AshutoshRajput.Makersharks.ExceptionHandling.ResourceNotFoundException;
import AshutoshRajput.Makersharks.Mapper.SupplierMapper;
import AshutoshRajput.Makersharks.Repository.SupplierRepo;
import AshutoshRajput.Makersharks.Service.ServiceInterface.SupplierServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Service
public class SupplierServiceImpl implements SupplierServiceInterface {

    private static final Logger logger = LoggerFactory.getLogger(SupplierServiceImpl.class);

    @Autowired
    private SupplierRepo supplierRepo;

    @Autowired
    private SupplierMapper supplierMapper;


    @Override
    public SupplierDTO createSupplier(SupplierDTO supplierDTO) {
        if (supplierRepo.findByCompanyName(supplierDTO.getCompanyName()).isPresent()) {
            logger.error("Supplier creation failed: Supplier already exists with company name: {}", supplierDTO.getCompanyName());
            throw new ResourceAlreadyExistsException("Supplier already exists with this company name.");
        }
        Supplier supplier = supplierMapper.SupplierDTOtoSupplier(supplierDTO);
        Supplier savedSupplier = supplierRepo.save(supplier);
        logger.info("Supplier created successfully with ID: {}", savedSupplier.getSupplier_id());
        return supplierMapper.SuppliertoSupplierDTO(savedSupplier);
    }

    @Override
    public SupplierDTO getSupplierByid(Long id) {
        Supplier supplier = supplierRepo.findById(id).orElseThrow(() -> {
            logger.error("Supplier not found with ID: {}", id);
            return new ResourceNotFoundException("Supplier not found with this ID.");
        });
        logger.info("Supplier found with ID: {}", id);
        return supplierMapper.SuppliertoSupplierDTO(supplier);
    }

    @Override
    public SupplierDTO deleteSupplier(Long id) {
        Supplier supplier = supplierRepo.findById(id).orElseThrow(() -> {
            logger.error("Supplier deletion failed: Supplier not found with ID: {}", id);
            return new ResourceNotFoundException("Supplier not found with this ID.");
        });
        supplierRepo.delete(supplier);
        logger.info("Supplier deleted successfully with ID: {}", id);
        return supplierMapper.SuppliertoSupplierDTO(supplier);
    }

    @Override
    public Page<SupplierDTO> ListOfSupplier(String location, String nature_of_business, String manufacturing_processes,int page,int size) {
        logger.info("Fetching list of suppliers by location: {}, nature of business: {}, manufacturing processes: {}",
                location, nature_of_business, manufacturing_processes);
        Pageable pageable = PageRequest.of(page, size);
        Page<Supplier> suppliers = supplierRepo.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                location, nature_of_business, manufacturing_processes, pageable);
        if (suppliers.isEmpty()) {
            logger.warn("No suppliers found for the given criteria.");
        } else {
            logger.info("Number of suppliers found: {}", suppliers.toList().size());
        }

//        return suppliers.stream().map(supplier -> supplierMapper.SuppliertoSupplierDTO(supplier)).toList();
        return suppliers.map(supplier -> supplierMapper.SuppliertoSupplierDTO(supplier));
    }

//    For testing purpose
//    public SupplierServiceImpl(SupplierRepo supplierRepo){
//        this.supplierRepo=supplierRepo;
//    }
}
