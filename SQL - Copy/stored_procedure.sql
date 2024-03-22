use voyadb1;

use delimiter $$

create procedure show_books(in auth varchar(20))
BEGIN
select * from book where author = auth;
end
$$
call show_books('kathy', 2000) $$

select * from book where author = 'kathy'  and price < 2000 $$
select * from book $$

call bookCountByPrice(1000, @total) $$
select @total$$

call get_cabs_by_type("tempo traveller")$$

call get_cabs_by_type("indica car")$$