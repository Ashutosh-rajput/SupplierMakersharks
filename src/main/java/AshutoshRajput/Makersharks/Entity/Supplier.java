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

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "website")
    private String website;

    @Column(name = "location")
    private String location;

    @Column(name = "nature_of_business")
    private String nature_of_business;

    @Column(name = "manufacturing_processes")
    private String manufacturing_processes;
}
