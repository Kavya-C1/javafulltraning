package com.bookapp.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO BOOK VALUES(title,author,price,category)";
    public static final String UPDATEQUERY = "UPDATE BOOK SET price=? where book_Id=?";
    public static final String DELETEQUERY = "DELETE FROM BOOK where book_Id=?";

    public static final String SELECTQUERY = "SELECT * FROM BOOK";
    public static final String SELECTBYAUTHORQUERY = "SELECT * FROM BOOK WHERE author=?";
    public static final String SELECTBYPRICEQUERY = "SELECT * FROM BOOK WHERE price<?";
    public static final String SELECTBYAUTHCATQUERY = "SELECT * FROM BOOK WHERE AUTHOR=?";
    public static final String SELECTBYIDQUERY = "SELECT * FROM BOOK WHERE book_id=?";
}
