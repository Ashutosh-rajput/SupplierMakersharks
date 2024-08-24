package AshutoshRajput.Makersharks.Repository;

import AshutoshRajput.Makersharks.Entity.Supplier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class SupplierRepoTest {
    @Autowired
    private SupplierRepo supplierRepo;

    @BeforeEach
    void setUp() {
        supplierRepo.deleteAll();
    }

    @Test
    void findByLocationAndNatureOfBusinessAndManufacturingProcesses() {
        Supplier supplier = new Supplier(null, "Orbis", "http://orbis.com", "Gwalior", "small_scale", "moulding");
        Supplier savedSupplier = supplierRepo.save(supplier);

        Pageable pageable = PageRequest.of(1, 1);
        Page<Supplier> result = supplierRepo.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                "Gwalior", "small_scale", "moulding",pageable);
        assertThat(result).isNotEmpty();
        assertThat(result.toList().get(0).getCompanyName()).isEqualTo("Orbis");
    }

    @Test
    void findByCompanyName() {
        Supplier supplier = new Supplier(null, "Orbis", "http://Orbis.org", "Gwalior", "medium_scale", "casting");
        Supplier savedSupplier = supplierRepo.save(supplier);

        Optional<Supplier> result = supplierRepo.findByCompanyName("Orbis");

        assertThat(result).isPresent();
        assertThat(result.get().getCompanyName()).isEqualTo("Orbis");
    }
}
