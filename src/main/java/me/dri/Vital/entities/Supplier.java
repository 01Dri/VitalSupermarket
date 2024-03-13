package me.dri.Vital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "supplier")
@Data
@AllArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "corporate_cnpj")
    private String corporateCnpj;

    @OneToMany
    @JoinTable(name = "supplier_batches", joinColumns = @JoinColumn(name = "supplier_id"),
    inverseJoinColumns = @JoinColumn(name="batch_id"))
    private List<Batch> batches;



    public Supplier() {}

}
