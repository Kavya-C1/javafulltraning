INSERT INTO `voyadb1`.`stud_book`
(`stud_id`,
`book_id`)
VALUES
(2,103);



select * from stud_book;

select s.stud_name, s.email, b.title, b.author from stud_book sb
inner join student s on s.student_id = sb.stud_id
inner join book b on sb.book_id = b.book_id;
