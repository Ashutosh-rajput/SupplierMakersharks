package AshutoshRajput.Makersharks.Service;

import AshutoshRajput.Makersharks.Repository.SupplierRepo;
import AshutoshRajput.Makersharks.Service.ServiceImpl.SupplierServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SupplierServiceImplTest {
    @Mock
    private SupplierRepo supplierRepo;

    private SupplierServiceImpl supplierService;

    @BeforeEach
    void setUp(){
        this.supplierService=new SupplierServiceImpl(this.supplierRepo);
    }

    @Test
    void listOfSupplier() {
        Pageable pageable = PageRequest.of(1, 1);
        supplierService.ListOfSupplier("Gwalior","small_scale","moudling",1,1);
        verify(supplierRepo).findByLocationAndNatureOfBusinessAndManufacturingProcesses("Gwalior","small_scale","moudling",pageable);

    }
}