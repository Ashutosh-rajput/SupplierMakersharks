package AshutoshRajput.Makersharks.Mapper;

import AshutoshRajput.Makersharks.DTO.SupplierDTO;
import AshutoshRajput.Makersharks.Entity.Supplier;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class SupplierMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Supplier SupplierDTOtoSupplier(SupplierDTO supplierDTO){
        return modelMapper.map(supplierDTO,Supplier.class);
    }
    public SupplierDTO SuppliertoSupplierDTO(Supplier supplier){
        return modelMapper.map(supplier,SupplierDTO.class);
    }


}
