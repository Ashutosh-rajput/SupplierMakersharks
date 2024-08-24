//package AshutoshRajput.Makersharks.Service;
//
//import AshutoshRajput.Makersharks.Entity.Supplier;
//import AshutoshRajput.Makersharks.Mapper.SupplierMapper;
//import AshutoshRajput.Makersharks.Repository.SupplierRepo;
//import AshutoshRajput.Makersharks.Service.ServiceImpl.SupplierServiceImpl;
//import AshutoshRajput.Makersharks.DTO.SupplierDTO;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//
//import java.util.Collections;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class SupplierServiceImplTest {
//
//    @Mock
//    private SupplierRepo supplierRepo;
//
//    @Mock
//    private SupplierMapper supplierMapper;
//
//    private SupplierServiceImpl supplierService;
//
//    @BeforeEach
//    void setUp() {
//        this.supplierService = new SupplierServiceImpl(this.supplierRepo, this.supplierMapper);
//    }
//
//    @Test
//    void listOfSupplier() {
//        Pageable pageable = PageRequest.of(0, 1); // Only 1 supplier
//        Supplier supplier = new Supplier(1L, "Supplier 1", "http://supplier1.com", "Gwalior", "small_scale", "moulding");
//        SupplierDTO supplierDTO = new SupplierDTO();
//        List<Supplier> suppliers = Collections.singletonList(supplier);
//        Page<Supplier> supplierPage = new PageImpl<>(suppliers, pageable, suppliers.size());
//
//        when(supplierRepo.findByLocationAndNatureOfBusinessAndManufacturingProcesses("Gwalior", "small_scale", "moulding", pageable))
//                .thenReturn(supplierPage);
//        when(supplierMapper.SuppliertoSupplierDTO(supplier)).thenReturn(supplierDTO);
//
//        Page<SupplierDTO> result = supplierService.ListOfSupplier("Gwalior", "small_scale", "moulding", 0, 1);
//
//        verify(supplierRepo).findByLocationAndNatureOfBusinessAndManufacturingProcesses("Gwalior", "small_scale", "moulding", pageable);
//
//        assertFalse(result.isEmpty());
//        assertEquals(1, result.getTotalElements());
//        assertEquals(supplierDTO, result.getContent().get(0));
//    }
//}
