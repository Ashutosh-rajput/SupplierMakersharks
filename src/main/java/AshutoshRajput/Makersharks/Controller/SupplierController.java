package AshutoshRajput.Makersharks.Controller;

import AshutoshRajput.Makersharks.DTO.SupplierDTO;
import AshutoshRajput.Makersharks.DTO.SupplierSearchDTO;
import AshutoshRajput.Makersharks.Service.ServiceImpl.SupplierServiceImpl;
import jakarta.validation.Valid;
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
    public SupplierDTO createSupplier(@RequestBody @Valid SupplierDTO supplierDTO){
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
    @PostMapping("/supplier/get-supplier/{page}/{size}")
    public ResponseEntity<List<SupplierDTO>> getsupplierbylocationandindustry(@RequestBody @Valid SupplierSearchDTO supplierSearchDTO,@PathVariable int page,@PathVariable int size){
        return ResponseEntity.ok(supplierService.ListOfSupplier(supplierSearchDTO.getLocation(),supplierSearchDTO.getNatureOfBusiness(),supplierSearchDTO.getManufacturingProcesses(),page,size));
    }

}
