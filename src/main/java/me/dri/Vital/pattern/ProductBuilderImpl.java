package me.dri.Vital.pattern;

import me.dri.Vital.entities.Batch;
import me.dri.Vital.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ProductBuilderImpl  implements  ProductBuilder{
    private Long id;

    private String name;

    private Double price;

    private Integer quantity;

    private String description;

    private String brand;

    private Date expirationDate;

    private String barcode;

    private Double rating;

    private List<Batch> batches = new ArrayList<>();

    @Override
    public ProductBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public ProductBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public ProductBuilder withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public ProductBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public ProductBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public ProductBuilder withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    @Override
    public ProductBuilder withBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    @Override
    public ProductBuilder withRating(Double rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public ProductBuilder withBatch(Batch batch) {
        this.batches.add(batch);
        return this;
    }

    @Override
    public ProductBuilder withBatches(List<Batch> batches) {
        this.batches.addAll(batches);
        return this;
    }

    @Override
    public Product build() {
        return new Product(this.id, this.name, this.price, this.quantity, this.description, this.brand, this.expirationDate, this.barcode, this.rating);
    }
}
