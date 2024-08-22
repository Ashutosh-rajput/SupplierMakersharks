package AshutoshRajput.Makersharks.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierDTO {
    private Long supplier_id;
    private String company_name;
    private String website;
    private String location;
    private String nature_of_business;
    private String manufacturing_processes;

}
