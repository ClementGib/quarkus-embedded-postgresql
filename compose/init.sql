-- CREATE SCHEMA --
CREATE SCHEMA basapp;

CREATE TABLE basapp.customers
(
customer_id BIGSERIAL UNIQUE NOT NULL,
name varchar(750) NOT NULL,
CONSTRAINT pk_customer PRIMARY KEY (customer_id)
);