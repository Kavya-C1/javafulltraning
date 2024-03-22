show databases;
create database voyadb1;
use voyadb1;

create table employee (
emp_id int primary key,
emp_name varchar(20),
salary float);

desc employee;

insert into employee values (1, 'Kavya', 20000);
insert into employee (emp_id, emp_name, salary) values ( 2, 'Pooja', 22000);
insert into employee values (3, 'Chandu', 23000);
insert into employee values (4, 'Geetha', 21000);
insert into employee values (5, 'Kumar', 25000);
insert into employee values (6, 'Vijay', 24000);

select * from employee;
select * from employee where emp_id=2;
