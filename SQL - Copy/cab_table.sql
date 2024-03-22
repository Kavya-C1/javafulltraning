use voyadb;

create table cab (
cab_number integer primary key,
driver_name varchar(20),
pickup varchar(20),
drop_loc varchar(20),
cab_type varchar(20)
);

desc cab;

select * from cab;
insert into cab values(1565, 'Akhil', 'Silkboard', 'Devanahalli', 'Indica car');
select * from cab;

create table comp_employee (
emp_id integer primary key,
emp_name varchar(20),
department varchar(20),
cab_id integer,
foreign key(cab_id) references cab(cab_number)
);

desc comp_employee;
select * from comp_employee;

insert into comp_employee values(505, 'Mallesh', 'operations', 1999);
select * from comp_employee;

select c.pickup, c.drop_loc, c.driver_name, e.emp_name, e.department, e.cab_id, c.cab_number from comp_employee
e inner join cab c 
on e.cab_id = c.cab_number;




select table_name,
column_name,
constraint_name,
referenced_table_name
from information_schema.key_column_usage
where referenced_table_name = 'cab';

alter table employee drop constraint comp_employee_ibfk_1;
alter table employee drop cab_id;


select * from cab;
create table cab_emp(cab_id int, emp_id int);
insert into cab_emp values
(1556, 500),(1556,502),(2002,503),(2002,504);

select e.emp_name, e.department, c.cab_number, c.pickup, c.drop_loc, c.cab_type
from cab_emp ce
inner join cab c on ce.cab_id = c.cab_number
inner join employee e on ce.emp_id = e.emp_id;

select e.emp_name, e.department, c.cab_number, c.pickup, c.drop_loc, c.cab_type
from cab_emp ce
inner join cab c on ce.cab_id = c.cab_number
inner join employee e on ce.emp_id = e.emp_id
where c.cab_type = 'Tempo traveller';

show create table book;