package AshutoshRajput.Makersharks.Controller;

import AshutoshRajput.Makersharks.DTO.SupplierDTO;
import AshutoshRajput.Makersharks.Service.ServiceImpl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SupplierController {
    @Autowired
    private SupplierServiceImpl supplierService;

    @PostMapping("/supplier")
    public SupplierDTO createSupplier(@RequestBody SupplierDTO supplierDTO){
        return supplierService.createSupplier(supplierDTO);
    }
    @GetMapping("/supplier/{id}")
    public ResponseEntity<SupplierDTO> getSupplierbyid(@PathVariable Long id){
        return ResponseEntity.ok(supplierService.getSupplierByid(id));
    }
    @DeleteMapping("/supplier/{id}")
    public ResponseEntity<String> deleteSupplierbyid(@PathVariable Long id){
        supplierService.deleteSupplier(id);
        return ResponseEntity.ok("Supplier deleted successfully with ID: "+ id);
    }
    @GetMapping("/supplier/get-supplier")
    public ResponseEntity<List<SupplierDTO>> getsupplierbylocationandindustry(@RequestBody String location, String nature_of_business, String manufacturing_processes){
        return ResponseEntity.ok(supplierService.ListOfSupplier(location, nature_of_business, manufacturing_processes));
    }

}
