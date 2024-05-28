package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;                        // 이 객체 하나를 가지고 현재 클래스 안의 scanner는 모두 사용 가능
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";                 // 원래는 배열로 해야하지만 임의로.
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택 : ");
            selectedMenu = scanner.nextLine();
            if (menus.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[도서 관리 프로그램]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;

            case "1":
                registerBook();
                break;

            case "2":
                search();
                break;

            case "3":
                break;

            case "4":
                break;

            default:
                System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;
    }

    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            if(!value.isBlank()) {                // 공백이 아니라면. if문을 빠져나온다. isBlank는 띄어쓰기를 문자로 포함시키지 않는 경우. 공백체크
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요."); // isEmpty는 띄어쓰기를 포함하여 받고싶은 경우
        }
        return value;
    }

    private String duplicateBookName() {                // 중복체크
        String bookName = null;
        while (true) {
            bookName = validateValue("도서");            // 공백체크
            if (bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다");
        }
        return bookName;
    }

    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);
        bookRepository.saveBook(book);      //도서등록
        System.out.println("새로운 도서를 등록하였습니다.");
    }
    /*
        while(true) {
            bookName = validateValue("도서");                                // 공백인지 체크하는 과정
            if(bookRepository.findBookByBookName(bookName) == null) {       // 중복체크. null이 아니라면. 도서명을 찾았을테니.
               break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요"); // id 중복확인처럼

        }

        bookName = duplicateBookName();
        author = validateValue("저자");
        publisher = validateValue("출판사");

    }
    */

    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.print("옵션 선택 : ");
        int option = scanner.nextInt();     // 예외처리를 이용하여 작성해야하지만 나중에 배우니까 우선은 이렇게.
        scanner.nextLine();                 // 엔터 버퍼 날려주는 과정. nextLine()을 제외하고는 nextLine()을 사용하여 엔터버퍼를 제거해 줘야 한다.
        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[ 검색 결과 ]");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());

        }
    }

}
