package AshutoshRajput.Makersharks.Repository;

import AshutoshRajput.Makersharks.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {

    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            String location, String natureOfBusiness, String manufacturingProcesses);

    Optional<Supplier> findByCompanyName(String companyName);

}

