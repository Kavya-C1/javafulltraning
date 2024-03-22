use voyadb;
select * from employee;
show tables;

select * from employee where emp_id=2;
alter table employee add column city varchar(20);
show tables;
select * from employee;
-- alter table employee drop city;
select * from employee;

update employee set city = 'Bangalore' where emp_id<3;
select * from employee;
alter table employee
add column department varchar(20) not null;

alter table employee
add column department varchar(20) not null default 'AM';

select * from employee;

alter table employee modify department varchar(20);

desc employee;

alter table employee add column zip integer;
select * from employee;

alter table employee change zip zipcode integer;
select * from employee;

select * from employee order by emp_name;
select * from employee order by emp_name desc;

delete from employee where emp_id=1;
delete from employee;

-- assignment
use voyadb;
create table student(
student_id int,
student_name varchar(20),
department varchar(10)
);

desc student;

insert into student values (1, 'Ka', 'CS');
insert into student values(2, 'Pa', 'ME');
insert into student values(3, 'Chan', 'EC');
insert into student values(4, 'Geeth', 'CS');
insert into student values(5,'Kumar','ME');
insert into student values(6,'Vijay','EC');
insert into student values(7, 'Madan', 'CS');
insert into student values(8, 'Keerthi', 'CS');
insert into student values(9, 'Mahesh', 'EC');
insert into student values(10, 'Anjali', 'CS');

select * from student;

alter table student add column city varchar(20);

select * from student;

update student set city = 'Bangalore' where student_id>5;
select * from student;

update student set city = 'Mysore' where student_id<5;
select * from student;

alter table student add column course varchar(20) not null default 'Java';
select * from student;

alter table student add column mystate int;
select * from student;
desc student;

alter table student modify mystate varchar(20);
select * from student;
desc student;

alter table student modify student_id int primary key;
desc student;

alter table student change mystate state varchar(20);
select * from student;
desc student;

alter table student add column zipcode int;
select * from student;
desc student;

update student set course = 'angular' where student_id<3;
select * from student;
desc student;

update student set course = 'spring' where student_id>3 and student_id<8;
select * from student;
desc student;

select * from student order by student_name;

alter table student drop zipcode;
select * from student;
desc student;


select distinct course from student order by course;

-- ends with a
select * from student where student_name like '%a';

-- second letter is a
select * from student where student_name like '_a%';
 
-- has letter j in name
select * from student where student_name like '%j%';

-- starts with k
select * from student where student_name like 'k%';

-- has only two words and starts with k
select * from student where student_name like 'k_';


select * from student where department in ('CS', 'ME');

select * from student where student_id between 3 and 8;

select * from student where student_id not between 2 and 5;

select student_id as id, student_name as name from student;

select distinct course from student;

select student_name as Student_Name, student_id as Student_Id, course as Student_Course, city as Student_city, department as Student_dept from student;

update student set state = 'Karnataka' where student_id>2;
select concat(student_name, course, department) as student_details, concat(city, state) as location from student;
