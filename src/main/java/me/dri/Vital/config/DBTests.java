package me.dri.Vital.config;

import me.dri.Vital.entities.Batch;
import me.dri.Vital.entities.Product;
import me.dri.Vital.entities.Supplier;
import me.dri.Vital.pattern.ProductBuilder;
import me.dri.Vital.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class DBTests implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final ProductBuilder productBuilder;

    public DBTests(ProductRepository productRepository, ProductBuilder productBuilder) {
        this.productRepository = productRepository;
        this.productBuilder = productBuilder;
    }

    @Override
    public void run(String... args) throws Exception {
//        Supplier supplier = new Supplier(null, "Diego", "Lacta", "1321231231231", null);
//        Batch batch = new Batch(null, null, new Date(), 150, supplier, new Date());
        Product product = this.productBuilder
                .withName("Example Product")
                .withPrice(10.99)
                .withQuantity(100)
                .withDescription("This is an example product.")
                .withBrand("Example Brand")
                .withExpirationDate(new Date())
                .withBarcode("1234567890")
                .withRating(4.5)
                .build();
//        batch.setProduct(product);
//        product.setBatches(List.of(batch));
//        supplier.setBatches(List.of(batch));
        this.productRepository.save(product);
        System.out.println(product);
    }
}
