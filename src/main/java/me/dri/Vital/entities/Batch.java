package me.dri.Vital.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "batch")
@Data
@AllArgsConstructor
public class Batch  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinTable(name = "product_id")
    private Product product;

    private Date expirationDate;

    private Integer quantity;

    @ManyToOne
    @JoinTable(name = "supplier_id")
    private Supplier supplier;

    private Date entryDate;


    public Batch() {

    }




}
