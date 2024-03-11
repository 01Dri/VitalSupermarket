CREATE TABLE inventory (
    id SERIAL PRIMARY KEY ,
    batch_id INT,
    quantity_full_batch INT,
    FOREIGN KEY (batch_id) REFERENCES  batch(id)
);