package me.dri.Vital.pattern;

import me.dri.Vital.entities.Batch;
import me.dri.Vital.entities.Product;

import java.util.Date;
import java.util.List;

public interface ProductBuilder {
    ProductBuilder withId(Long id);

    ProductBuilder withName(String name);
    ProductBuilder withPrice(Double price);
    ProductBuilder withQuantity(Integer quantity);
    ProductBuilder withDescription(String description);
    ProductBuilder withBrand(String brand);
    ProductBuilder withExpirationDate(Date expirationDate);
    ProductBuilder withBarcode(String barcode);
    ProductBuilder withRating(Double rating);
    ProductBuilder withBatch(Batch batch);
    ProductBuilder withBatches(List<Batch> batches);

    Product build();



}
