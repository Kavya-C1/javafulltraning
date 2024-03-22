package com.bookapp.dao;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDb;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements IBookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		Object[] bookArr = {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.INSERTQUERY, bookArr);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.UPDATEQUERY, price, bookId);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Book book = jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,new BookMapper(), bookId);
		return book;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, (rs, rowNum)->{
			Book book = new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("bookId"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		},author);
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, new BookMapper(),price);
		return books;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY, new BookMapper(),author,Category);
		return books;
	}
   
}
