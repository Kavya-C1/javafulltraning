use voyadb;

create table books (
 title varchar(20),
 book_id int primary key auto_increment,
 author varchar(20),
 price float
 );
 
 desc books;
 
 insert into books(title, author, price) values('Linux','Tim',550);
 
 select * from books;
 
 -- aggregate functions
 
 select min(price) from books;
 select max(price) from books;
 select sum(price) from books;
 select avg(price) from books;
 select count(*) from books;
 
 insert into books(title, author, price)
 values(upper('The secret'), trim(' Rhonda '), round(4509.75));
 
select * from books;

select lower(title), format(price,1), upper(author) from books;
select substr(title,1,5) from books;

select lower(title) as title, char_length(title) as length from books;

select concat(title, " " , author) as details from books;
select concat_ws("-", title, author) as details from books;
 

 
 
 