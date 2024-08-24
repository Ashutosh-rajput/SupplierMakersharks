package AshutoshRajput.Makersharks.DTO;

import AshutoshRajput.Makersharks.Validation.ValidateManufacturingProcesses;
import AshutoshRajput.Makersharks.Validation.ValidateNatureOfBusiness;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierSearchDTO {
    @NotBlank(message = "Please enter a location of company.")
    private String location;
    @NotBlank
    @ValidateNatureOfBusiness
    private String natureOfBusiness;
    @NotBlank
    @ValidateManufacturingProcesses
    private String manufacturingProcesses;
//    private int page;
//    private int size;

}
