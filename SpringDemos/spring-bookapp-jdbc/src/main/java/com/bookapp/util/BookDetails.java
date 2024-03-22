package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookDetails {

    public List<Book> showBooks() {
        return Arrays.asList(
                new Book("Java in Action", "John David","Tech",1,900.90),
        new Book("5am club", "Robin sharma","Self help",2,300.68),
        new Book("Html", "John David","Tech",3,1900.45),
        new Book("Secret Seven", "Enid Ben","Fiction",4,700.08),
        new Book("Seven habits", "John Hopper","SelfHelp",5,800.90)
        );

    }
}
