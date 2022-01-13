package retest;

import java.util.HashSet;
import java.util.Scanner;

public class BookStoreMain {
	
	String id, title, publisher, author, genre;
	int year, month;
	
	Novel novel = new Novel(id, title, publisher, author, genre);
	
	public static void main(String[] args) throws RecordNotFoundException {
		
		BookStoreMain smain = new BookStoreMain();
		BookStoreManager bm = new BookStoreManager();
				
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			printMainMenu();
			int num = sc.nextInt();
			
			switch(num){
			case 1://도서정보입력 등록
				System.out.println("* 도서 정보 입력");
				smain.createInfo();
				//추가하는 함수 만들기
				break;
				
			case 2://제목으로 검색
				System.out.println("* 제목으로 검색");
				System.out.println("검색할 제목을 입력하세요");
				String title = sc.next();
				try {Book book = bm.searchBookTitle(title);
				System.out.printf("번호:%s 제목:%s 출판사:%s", book.getId(), book.getTitle(), book.getPublisher());
				} catch (retest.RecordNotFoundException e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				System.out.println("* ID로 검색");
				System.out.println("검색할 제목을 입력하세요");
				String id = sc.next();
				Book bookId;
				try {
					bookId = bm.searchBookTitle(id);
					System.out.printf("번호:%s 제목:%s 출판사:%s", bookId.getId(), bookId.getTitle(), bookId.getPublisher());
				} catch (retest.RecordNotFoundException e) {
					e.printStackTrace();
				}
				break;
				
			case 4:
				System.out.println("* 전체 출력");
				
				HashSet<Book> bookList = bm.showAll();
				for(Book book1 : bookList) {
					System.out.printf("번호:%s 제목:%s 출판사:%s", book1.getId(), book1.getTitle(), book1.getPublisher());
				}
				break;
				
			case 5:
				System.out.println("* 소설책 목록 출력");
				
				HashSet<Novel> novelList = bm.novelAll();
				for(Novel novel : novelList) {
					System.out.printf("번호:%s 제목:%s 출판사:%s 저자:%s 장르:%s %n", novel.getId(), novel.getTitle(), novel.getPublisher(), novel.getAuthor(), novel.getGenre() );
				}
				
				break;
				
			case 6:
				System.out.println("* 잡지책 목록 출력");
				
				HashSet<Magazine> magaList = bm.magaAll();
				for(Magazine maga : magaList) {
					System.out.printf("번호:%s 제목:%s 출판사:%s 발행년월: %d / %d %n", maga.getId(), maga.getTitle(), maga.getPublisher(), maga.getYear(), maga.getMonth());
				}
				break;
				
			case 0: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘 못 입력했습니다.");
				System.out.println();
			}
		}//while
	}//main
	
	private void createInfo() {
		BookStoreManager bm = new BookStoreManager();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 분야 (1:소설, 2:잡지)");
		int what = sc.nextInt();
		
		System.out.println("도서구분번호: ");
		String id = sc.next();
		
		//동일한거는 안되게
		
		System.out.println("제목: ");
		String title = sc.next();
		System.out.println("출판사: ");
		String publisher = sc.next();
		
		//1인지 2인지에 따라 다르게 분류해야지
		switch(what) {
		case 1 :
			System.out.println("저자: ");
			String author = sc.next();
			System.out.println("장르: ");
			String genre = sc.next();
			
			
			//객체로 새로 불러오는게 문제 인거 같은데 이거를 어떻게 받지..
			Book book = new Book(id, title, publisher);
			bm.insertBook(book);
			
		
			bm.insertNovel(novel);
			System.out.println("등록이 완료되었습니다..");
			break;
			
		case 2 :
			System.out.println("발행년도: ");
			int year = sc.nextInt();
			System.out.println("발행월: ");
			int month = sc.nextInt();
			
			book = new Book(id, title, publisher);
			bm.insertBook(book);
			
			Magazine maga = new Magazine(id, title, publisher, year, month);
			bm.insertMaga(maga);
			System.out.println("등록이 완료되었습니다..");
			break;
		default :
			System.out.println("잘 못 입력했습니다.");
		}
		
		
	}
	
	
	private static void printMainMenu() {
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("▩▩▩---[도서정보 관리]--------");
		System.out.println("▩▩▩-----------------------------------");
		System.out.println("▩▩▩------1. 도서 정보 입력----");
		System.out.println("▩▩▩------2. 제목으로 검색-----");
		System.out.println("▩▩▩------3. ID로 검색--------");
		System.out.println("▩▩▩------4. 전체 출력--------");
		System.out.println("▩▩▩------5. 소설책 목록 출력---");
		System.out.println("▩▩▩------6. 잡지책 목록 출력---");
		System.out.println("▩▩▩------0. 종료----------");		
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
	}//print

}
