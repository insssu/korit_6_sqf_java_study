package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;                        // 이 객체 하나를 가지고 현재 클래스 안의 scanner는 모두 사용 가능
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);           //스캐너 생성
        bookRepository = new BookRepository();      // repository 생성
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
        return selectedMenu;                    // while문이 실행이 되면 selectedMenu = scanner.nextLine();에서 값을 넣어주는것을 출력
    }                                           // if조건에서 입력받은 selectedMenu의 조건의 참 거짓을 판별

    public boolean run() {
        boolean isRun = true;

        System.out.println("[도서 관리 프로그램]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 전체 조회");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();         //

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
                modify();
                break;

            case "4":
                remove();
                break;

            case "5":

                break;

            default:
                System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;                       // is run이 true라면 계속 반복되는 문장.
    }

    private String validateValue(String title) {            //
        String value = null;
        while(true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            if(!value.isBlank()) {                // 공백이 아니라면. if문을 빠져나온다. isBlank는 띄어쓰기를 문자로 포함시키는 경우. 공백체크
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요."); // isEmpty는 띄어쓰기를 포함하지 않고 받고싶은 경우
        }
        return value;
    }

    private String duplicateBookName() {                // 중복체크
        String bookName = null;
        while (true) {                                               // 2. while문이 실행되는 동안
            bookName = validateValue("도서");            // 공백체크.  // 3. 입력할 "도서"를 입력
            if (bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다");
        }
        return bookName;                        // 1. bookName을 리턴할거다
    }

    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();              // 중복이 안되게끔 만들거야.
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);  // new BookEntity의 값을 받아야 하는데 (객체 생성)
        bookRepository.saveBook(book);      //도서등록                        // 이 값을 어떤식으로 받을거냐 했더니 System.out.println("[ 도서 등록 ]");의 밑에 네줄로 선언해준다.
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
        String searchText = scanner.nextLine();     // 검색하고자 하는 데이터 입력.
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);  // searchBooks의 역할은 option, searchText 의 자료를 받아와서 실행

        System.out.println("[ 검색 결과 ]");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());

        }
    }

    private void remove() {
        System.out.println("[ 도서 삭제 ]");
        search();                                       // search를 통해 검색을 한 후 도서의 번호를 보고 지우고자 하는 책 번호를 다시 입력
        System.out.print("삭제할 도서번호를 입력 : ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);

    }

    private void modify() {
        System.out.println("[ 도서 수정 ]");
        System.out.println();
        search();
        System.out.print("수정 할 도서번호 입력 : ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if(book == null) {
            System.out.println("해당 도서는 존재하지 않습니다.");
            return;
        }
        System.out.println("<< 도서 수정 정보 입력 >>");
        for(int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.print("도서명을 수정하시겠습니까? (y/n) : ");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {        // equalsIgnoreCase는 대소문자 구분없이 문자열을 구분해라.
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;

                case 1:
                    System.out.print("저자를 수정하시겠습니까? (y/n) : ");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {        // equalsIgnoreCase는 대소문자 구분없이 문자열을 구분해라.
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;

                case 2:
                    System.out.print("출판사를 수정하시겠습니까? (y/n) : ");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {        // equalsIgnoreCase는 대소문자 구분없이 문자열을 구분해라.
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;

                    }
            }
            System.out.println("수정 되었습니다.");
            System.out.println();
        }
        System.out.println();
    }
}
