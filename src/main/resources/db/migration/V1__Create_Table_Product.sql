CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name varchar(100) NOT NULL ,
    price FLOAT NOT NULL ,
    quantity INT NOT NULL ,
    description VARCHAR(100) ,
    brand VARCHAR(50) NOT NULL ,
    expiration_date DATE NOT NULL ,
    barcode VARCHAR(255) NOT NULL ,
    rating FLOAT NOT NULL
);

