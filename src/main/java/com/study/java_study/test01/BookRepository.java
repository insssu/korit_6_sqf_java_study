package com.study.java_study.test01;

public class BookRepository {

    private int bookId;
    private BookEntity[] books;

    public BookRepository() { books = new BookEntity[0]; }

    public int autoIncreasementBookId() {
        return ++bookId;
    }

    private void extendBooks() {
        BookEntity[] newBooks = new BookEntity[books.length + 1];
    }
}
