package com.bookapp.service;

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
	
	
	private BookDetails details;
	
	
	@Autowired
    public void setDetails(BookDetails details) {
		this.details = details;
	}



	@Override
    public List<Book> getAll() {
        List<Book> books = details.showBooks();
        return books;
    }



    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books= details.showBooks();
        List<Book> bookByAuthor = new ArrayList<>();
        for(Book book:books){
            if (book.getAuthor().startsWith(author)){
                bookByAuthor.add(book);
            }
        }
       if(bookByAuthor.isEmpty()){
           throw new BookNotFoundException("Book by this author not available");
       }
       return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books= details.showBooks();
        List<Book> bookByCategory = new ArrayList<>();
        for(Book book:books){
            if (book.getCategory().equals(category)){
                bookByCategory.add(book);
            }
        }
        if( bookByCategory.isEmpty()){
            throw new BookNotFoundException("book not found");
        }
        return  bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books= details.showBooks();
        List<Book> bookByPrice = new ArrayList<>();
        for(Book book:books){
            if (book.getPrice()==price){
                bookByPrice.add(book);
            }
        }
        return bookByPrice;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books= details.showBooks();
        List<Book> bookByAuthorAndCategory = new ArrayList<>();
        for(Book book:books){
            if (book.getAuthor().equals(author) && book.getCategory().equals(category)){
                bookByAuthorAndCategory.add(book);
            }
        }
        return bookByAuthorAndCategory;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books= details.showBooks();
        List<Book> bookById = new ArrayList<>();
        for(Book book:books){
            if (book.getBookId()==bookId){
//                newBook.add(book);
                return book;
            }
        }
        return (Book) bookById;
    }
}
