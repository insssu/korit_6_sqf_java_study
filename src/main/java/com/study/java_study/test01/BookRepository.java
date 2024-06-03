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

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1:
                for (BookEntity book : books) {
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 2:
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 3:
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 4:
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }


    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        switch (option) {
            case 1:
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;

            case 2:
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;

            case 3:
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;

            case 4:
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
        }
        return searchBooks;
    }
}
