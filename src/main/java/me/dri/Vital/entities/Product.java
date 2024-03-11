package me.dri.Vital.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Integer quantity;

    private String description;

    private String brand;

    @Column(name = "expiration_date")
    private Date expirationDate;

    private String barcode;

    private Double rating;

    @OneToMany
    private List<Batch> batches;


    public Product() {

    }
}
