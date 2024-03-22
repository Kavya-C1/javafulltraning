use voyadb;

create table product(
product_id int primary key auto_increment,
product_name varchar(20),
brand varchar(20),
price float,
category varchar(20)
);

insert into product values (104, 'Speaker', 'Bosch', 15000, 'Electronics');

select * from product;


create table orders (
order_id int primary key auto_increment,
customer_name varchar(20),
quantity int,
billing_date date,
prod_id int,
foreign key(prod_id) references product(product_id)
);

desc orders;
select * from orders;

insert into orders values (507, 'Tarun', 3, '2023-03-14', 102);
select * from orders;

select o.order_id, o.customer_name, p.product_name, p.brand, o.billing_date, o.quantity from orders
o inner join product p on o.prod_id = p.product_id;
