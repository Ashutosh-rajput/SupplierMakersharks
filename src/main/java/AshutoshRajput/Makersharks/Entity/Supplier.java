package AshutoshRajput.Makersharks.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@ToString
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    @SequenceGenerator(name = "seq",sequenceName = "ex_seq",allocationSize = 1)
    @Column(name = "supplier_id")
    private Long supplier_id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column(name = "location")
    private String location;

    @Column(name = "natureOfBusiness")
    private String natureOfBusiness;

    @Column(name = "manufacturingProcesses")
    private String manufacturingProcesses;
}
