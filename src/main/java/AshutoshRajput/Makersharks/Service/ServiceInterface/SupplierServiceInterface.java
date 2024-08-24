package AshutoshRajput.Makersharks.Service.ServiceInterface;

import AshutoshRajput.Makersharks.DTO.SupplierDTO;
import AshutoshRajput.Makersharks.Entity.Supplier;
import AshutoshRajput.Makersharks.Repository.SupplierRepo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SupplierServiceInterface {
    SupplierDTO createSupplier(SupplierDTO supplierDTO);
    SupplierDTO getSupplierByid(Long id);
    SupplierDTO deleteSupplier(Long id);
    List<SupplierDTO> ListOfSupplier(String location, String nature_of_business, String manufacturing_processes, int page, int size);

}
