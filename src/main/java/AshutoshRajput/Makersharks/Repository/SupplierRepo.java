package AshutoshRajput.Makersharks.Repository;

import AshutoshRajput.Makersharks.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier,Long> {
    List<Supplier> findbylocationAndnature_of_businessAndmanufacturing_processes(
            String location, String nature_of_business, String manufacturing_processes);
    Optional<Supplier> findbycompany_name(String company_name);

}
