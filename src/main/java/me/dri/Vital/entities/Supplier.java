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
    private List<Batch> batches;



    public Supplier() {}

}
