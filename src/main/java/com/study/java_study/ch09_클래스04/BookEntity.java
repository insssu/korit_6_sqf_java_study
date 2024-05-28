package com.study.java_study.ch09_클래스04;

// Entity : 정보의 집합체. 정보를 꺼내올 때 출력해주는 중간의 데이터 덩어리.
public class BookEntity {

    private int bookId;
    private String bookName;
    private String author;
    private String publisher;

    public BookEntity(int bookId, String bookName, String author, String publisher) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {                              // toString :
        return "BookEntity{" +                              // 객체안의 어떤 값이 들어있는가를 출력해주는 역할
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public BookEntity() {                                   //
    }


}
