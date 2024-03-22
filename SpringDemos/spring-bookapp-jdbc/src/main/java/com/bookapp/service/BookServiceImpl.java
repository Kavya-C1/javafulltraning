package com.bookapp.service;

import com.bookapp.dao.IBookDao;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private IBookDao bookDao;
	
	

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.addBook(book);
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		bookDao.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		bookDao.deleteBook(bookId);
	}
	
	
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book> books = bookDao.findAll();
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = bookDao.findByAuthor(author);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

//	@Override
//	public List<Book> getByCategory(String category) throws BookNotFoundException {
//		// TODO Auto-generated method stub
//		List<Book> books = bookDao.findByAuthorCategory(category, category);
//		if(books.isEmpty())
//			throw new BookNotFoundException("No books found");
//		return books;
//	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = bookDao.findByLesserPrice(price);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = bookDao.findByAuthorCategory(author, category);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return books;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = (List<Book>) bookDao.findById(bookId);
		if(books.isEmpty())
			throw new BookNotFoundException("No books found");
		return (Book) books;
	}

	
	
}
