CREATE TABLE batch (
    id SERIAL PRIMARY KEY,
    product_id INT,
    expiration_date DATE,
    quantity INT,
    supplier_id INT,
    entry_date DATE,
    FOREIGN KEY (product_id) REFERENCES product(id),
    FOREIGN KEY (supplier_id) REFERENCES supplier(id)
)