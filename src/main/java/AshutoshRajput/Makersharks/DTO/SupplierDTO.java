package AshutoshRajput.Makersharks.DTO;

import AshutoshRajput.Makersharks.Validation.ValidateManufacturingProcesses;
import AshutoshRajput.Makersharks.Validation.ValidateNatureOfBusiness;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierDTO {
    private Long supplier_id;
    @NotBlank(message = "Please enter Company name.")
    private String companyName;
    @NotBlank
    @URL(message = "Please enter correct website url.")
    private String website;
    @NotBlank(message = "Please enter a location of company.")
    private String location;
    @NotBlank
    @ValidateNatureOfBusiness
    private String natureOfBusiness;
    @NotBlank
    @ValidateManufacturingProcesses
    private String manufacturingProcesses;

}
