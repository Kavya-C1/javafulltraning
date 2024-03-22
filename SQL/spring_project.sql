create database bookappmaven;
use bookappmaven;

create table Book (
 bookId int primary key,
 title varchar(20),
 author varchar(20),
 category varchar(20),
 price double
 );
 
 insert into Book (bookId, title, author, category, price)values
 (1,"Java in Action", "John David","Tech",900.90),
(2,"5am club", "Robin sharma","Self help",300.68),
(3,"Html", "John David","Tech",1900.45),
(4,"Secret Seven", "Enid Ben","Fiction",700.08),
(5,"Seven habits", "John Hopper","SelfHelp",800.90);
 
 select * from Book;
 
 
 create database productapp;
 use productapp;
 
 create table product(
 product_id int auto_increment primary key,
 product_name varchar(20),
 brand varchar(20),
 price double,
 category varchar(20)
 );
 
 select * from product;
 
 create database insuranceapp;
 use insuranceapp;
 
 create table insurance (
 insurance_id int auto_increment primary key,
 policy_name varchar(20),
 brand varchar(20),
 type varchar(20),
 duration int,
 premium double
 );
 

 select * from insurance; 