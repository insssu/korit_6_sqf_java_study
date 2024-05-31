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

    private int getLastIndex() { return books.length -1;}

    public void saveBook(BookEntity book) {
        extendBooks();
        books[getLastIndex()] = book;
    }

    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }
}
