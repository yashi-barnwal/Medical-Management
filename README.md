# Medical-Management



# Create Database using MySQL Workbench
```create database medical;```

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fullname VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contact_no VARCHAR(15),
    address VARCHAR(255),
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    user_type VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE companies (
    id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(100) NOT NULL,
    country VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    contact_no VARCHAR(20),
    address VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    company_name VARCHAR(100) NOT NULL,
    product_category VARCHAR(100),
    quantity INT NOT NULL DEFAULT 0,
    price_per_unit DECIMAL(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE product_category (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(100) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO users (fullname, email, contact_no, address, username, password, user_type)
VALUES (
    'Admin User',
    'admin@admin.com',
    '1234567890',
    'Admin Office, HQ',
    'admin',
    'admin123', 
    'admin'
);

CREATE TABLE sales_record (
    sales_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    company_name VARCHAR(100) NOT NULL,
    date_of_sale DATE NOT NULL,
    quantity INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL
);