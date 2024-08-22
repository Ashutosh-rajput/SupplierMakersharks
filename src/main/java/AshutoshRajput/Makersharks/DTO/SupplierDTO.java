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
    @NotBlank(message = "Please enter Company name.")
    private String company_name;
    @URL(message = "Please enter correct website url.")
    private String website;
    @NotBlank(message = "Please enter a location of company.")
    private String location;
    @ValidateNatureOfBusiness
    private String nature_of_business;
    @ValidateManufacturingProcesses
    private String manufacturing_processes;

}
