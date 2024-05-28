package com.study.java_study.ch09_클래스04;

import java.awt.print.Book;

// 저장소 -> CRUD가 이루어지는 장소 / 책을 모아놓는 곳은 책꽂이 역할을 하는 배열. / 부품을 만들고 있는 과정을 하는 클래스
public class BookRepository {
    private int bookId;
    private BookEntity[] books;   // BookEntity라는 배열에 books라는 변수를 만들었다.

    public BookRepository() { books = new BookEntity[0]; }     // bookrepository가 생성되어질 때


    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() {        // save 클래스 안에서만 쓰는 메소드 이기 때문에 private을 잡아놓은 것. 외부에 노출시키지 않고 작업
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];  // save메소드가 호출될 때 마다 배열크기가 하나 큰 새로운 배열을 만들 것이다.

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈 값이다.
        for(int i = 0; i < books.length; i++) {     // books.length 기존배열
            newBooks[i] = books[i];                 // books.length의 길이만큼, 위치도 동일하니 그대로 옮겨준 과정
        }

        books = newBooks;       // 주소값을 통째로 옮기는 과정. 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
                                //
    }

    private int getLastIndex() { return books.length -1; }

    public void saveBook(BookEntity book) {             // book이라는 객체를 하나 받아온다. 그것을 배열에 추가를 할 것이다.

        extendBooks(); // 배열 확장의 메소드 호출

        books[getLastIndex()] = book; // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.

    }


    // 단건조회 : 하나만 조회를 한다.
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;             // 찾고자 하는 책이 있으면 null자리에 그 책이 들어오게됨.
                                                // 만약 찾고자 하는 책이 없다면 null을 이용해 없다는 것을 알려주면 됨.
        for(BookEntity book : books) {          // 선형(순차)탐색으로 찾는 과정.
            if(book.getBookId() == bookId) {    // bookId라는 매개변수를 가져와서 배열에 확인
                findBook = book;                // 도서 객체 자체를 넣는 과정
                break;
            }
        }

        return findBook;
    }


    // 단건조회 : 하나만 조회를 한다.
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        for(BookEntity book : books) {                  // for 반복할거다. private  BookEntity[] books;를. books와 1:1로 비교해서
            if(book.getBookName().equals(bookName)) {   // 만약. book의 이름중에. bookName과 같은게 있다면 (문자열 비교이기 때문에 equals()를 이용해서 비교)
                findBook = book;                        // findeBook에 입력한 book 값을 대입하고
                break;                                  // 반복을 멈춘다.
            }                                           // contains를 써도 상관이 없나? 리턴자료형이 하나이기 때문에 정확한 자료형을 보내줘야 하니까 equals
        }                                               // contains는 여러개가 나올 수 있기 때문에 배열로 만들어 줘야한다.
        return findBook;                                // 그런다음 findBook을 return한다.
    }

    private  int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1:   //통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {     // equals는 완전히 같은 이름을 써야하지만 contains는 문자열에 포함이 되어있다면.
                        newArraySize++;        // i번째 인덱스의 자리에 book을 집어 넣는다.
                    }
                }
                break;

            case 2:   //도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 3:   //저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;

            case 4:   //출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
        }

        return newArraySize;
    }


    // 다건조회
    public BookEntity[] searchBooks(int option, String searchText) {            // 매개변수 option과 searchText를 넣어줄거야
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];                // 검색해서 찾은 도서의 수량을 알아야(사이즈를 알아야) 검색한 것이 몇개인지

        int i = 0;
        switch (option) {
            case 1:   //통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {     // equals는 완전히 같은 이름을 써야하지만 contains는 문자열에 포함이 되어있다면.
                        searchBooks[i] = book;           // i번째 인덱스의 자리에 book을 집어 넣는다.
                        i++;                            // i번째 인덱스의 자리에 book을 집어 넣는다. if 조건이 충족될 때만 i가 증가한다.
                    }
                }
                break;

            case 2:   //도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;        // i번째 인덱스의 자리에 book을 집어 넣는다.
                        i++;
                    }
                }
                break;

            case 3:   //저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;        // i번째 인덱스의 자리에 book을 집어 넣는다.
                        i++;
                    }
                }
                break;

            case 4:   //출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;        // i번째 인덱스의 자리에 book을 집어 넣는다.
                        i++;
                    }
                }

        }

        return searchBooks;

    }

}
