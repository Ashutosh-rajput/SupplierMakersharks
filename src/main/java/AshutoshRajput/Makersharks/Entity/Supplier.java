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

    @Column(name = "company_name", nullable = false)
    private String company_name;

    @Column(name = "website", nullable = false)
    private String website;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "nature_of_business", nullable = false)
    private String nature_of_business;

    @Column(name = "manufacturing_processes", nullable = false)
    private String manufacturing_processes;
}
