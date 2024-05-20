create database dbkt_microservice;
use dbkt_microservice;
create table product(
    product_id int primary key auto_increment,
    product_name varchar(255),
    price float
);