package me.dri.Vital.config;

import me.dri.Vital.entities.Batch;
import me.dri.Vital.entities.Product;
import me.dri.Vital.entities.Supplier;
import me.dri.Vital.pattern.ProductBuilder;
import me.dri.Vital.repository.BatchRepository;
import me.dri.Vital.repository.ProductRepository;
import me.dri.Vital.repository.SupplierInventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class DBTests implements CommandLineRunner {

    private final ProductRepository productRepository;

    private final BatchRepository batchRepository;

    private final ProductBuilder productBuilder;

    private final SupplierInventory supplierInventory;

    public DBTests(ProductRepository productRepository, BatchRepository batchRepository, ProductBuilder productBuilder, SupplierInventory supplierInventory) {
        this.productRepository = productRepository;
        this.batchRepository = batchRepository;
        this.productBuilder = productBuilder;
        this.supplierInventory = supplierInventory;
    }

    @Override
    public void run(String... args) throws Exception {
        Supplier supplier = new Supplier(null, "Diego", "Lacta", "1321231231231", null);
        Batch batch = new Batch(null, null, new Date(), 150, null, new Date());
        batch = this.batchRepository.save(batch);
        supplier.setBatches(List.of(batch));
        this.supplierInventory.save(supplier);
        Product product = this.productBuilder
                .withName("Example Product")
                .withPrice(10.99)
                .withQuantity(100)
                .withDescription("This is an example product.")
                .withBrand("Example Brand")
                .withExpirationDate(new Date())
                .withBarcode("1234567890")
                .withRating(4.5)
                .withBatch(batch)
                .build();
//        batch.setProduct(product);
//        product.setBatches(List.of(batch));
//        supplier.setBatches(List.of(batch));
        product = this.productRepository.save(product);
        batch.setProduct(product);
//        batch.setProduct(product);
        this.batchRepository.save(batch);
//        this.productRepository.save(product);
        System.out.println(product);
        System.out.println(supplier);
        System.out.println(batch);

    }
}
