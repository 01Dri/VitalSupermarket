CREATE TABLE supplier_batches (
    id SERIAL PRIMARY KEY ,
    supplier_id INT,
    batch_id INT,
    FOREIGN KEY (supplier_id) REFERENCES supplier(id),
    FOREIGN KEY (batch_id) REFERENCES batch(id)
);
