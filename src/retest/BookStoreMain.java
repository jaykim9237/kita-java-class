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
			case 1://���������Է� ���
				System.out.println("* ���� ���� �Է�");
				smain.createInfo();
				//�߰��ϴ� �Լ� �����
				break;
				
			case 2://�������� �˻�
				System.out.println("* �������� �˻�");
				System.out.println("�˻��� ������ �Է��ϼ���");
				String title = sc.next();
				try {Book book = bm.searchBookTitle(title);
				System.out.printf("��ȣ:%s ����:%s ���ǻ�:%s", book.getId(), book.getTitle(), book.getPublisher());
				} catch (retest.RecordNotFoundException e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				System.out.println("* ID�� �˻�");
				System.out.println("�˻��� ������ �Է��ϼ���");
				String id = sc.next();
				Book bookId;
				try {
					bookId = bm.searchBookTitle(id);
					System.out.printf("��ȣ:%s ����:%s ���ǻ�:%s", bookId.getId(), bookId.getTitle(), bookId.getPublisher());
				} catch (retest.RecordNotFoundException e) {
					e.printStackTrace();
				}
				break;
				
			case 4:
				System.out.println("* ��ü ���");
				
				HashSet<Book> bookList = bm.showAll();
				for(Book book1 : bookList) {
					System.out.printf("��ȣ:%s ����:%s ���ǻ�:%s", book1.getId(), book1.getTitle(), book1.getPublisher());
				}
				break;
				
			case 5:
				System.out.println("* �Ҽ�å ��� ���");
				
				HashSet<Novel> novelList = bm.novelAll();
				for(Novel novel : novelList) {
					System.out.printf("��ȣ:%s ����:%s ���ǻ�:%s ����:%s �帣:%s %n", novel.getId(), novel.getTitle(), novel.getPublisher(), novel.getAuthor(), novel.getGenre() );
				}
				
				break;
				
			case 6:
				System.out.println("* ����å ��� ���");
				
				HashSet<Magazine> magaList = bm.magaAll();
				for(Magazine maga : magaList) {
					System.out.printf("��ȣ:%s ����:%s ���ǻ�:%s ������: %d / %d %n", maga.getId(), maga.getTitle(), maga.getPublisher(), maga.getYear(), maga.getMonth());
				}
				break;
				
			case 0: 
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�� �� �Է��߽��ϴ�.");
				System.out.println();
			}
		}//while
	}//main
	
	private void createInfo() {
		BookStoreManager bm = new BookStoreManager();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� �о� (1:�Ҽ�, 2:����)");
		int what = sc.nextInt();
		
		System.out.println("�������й�ȣ: ");
		String id = sc.next();
		
		//�����ѰŴ� �ȵǰ�
		
		System.out.println("����: ");
		String title = sc.next();
		System.out.println("���ǻ�: ");
		String publisher = sc.next();
		
		//1���� 2������ ���� �ٸ��� �з��ؾ���
		switch(what) {
		case 1 :
			System.out.println("����: ");
			String author = sc.next();
			System.out.println("�帣: ");
			String genre = sc.next();
			
			
			//��ü�� ���� �ҷ����°� ���� �ΰ� ������ �̰Ÿ� ��� ����..
			Book book = new Book(id, title, publisher);
			bm.insertBook(book);
			
		
			bm.insertNovel(novel);
			System.out.println("����� �Ϸ�Ǿ����ϴ�..");
			break;
			
		case 2 :
			System.out.println("����⵵: ");
			int year = sc.nextInt();
			System.out.println("�����: ");
			int month = sc.nextInt();
			
			book = new Book(id, title, publisher);
			bm.insertBook(book);
			
			Magazine maga = new Magazine(id, title, publisher, year, month);
			bm.insertMaga(maga);
			System.out.println("����� �Ϸ�Ǿ����ϴ�..");
			break;
		default :
			System.out.println("�� �� �Է��߽��ϴ�.");
		}
		
		
	}
	
	
	private static void printMainMenu() {
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
		System.out.println("�̢̢�---[�������� ����]--------");
		System.out.println("�̢̢�-----------------------------------");
		System.out.println("�̢̢�------1. ���� ���� �Է�----");
		System.out.println("�̢̢�------2. �������� �˻�-----");
		System.out.println("�̢̢�------3. ID�� �˻�--------");
		System.out.println("�̢̢�------4. ��ü ���--------");
		System.out.println("�̢̢�------5. �Ҽ�å ��� ���---");
		System.out.println("�̢̢�------6. ����å ��� ���---");
		System.out.println("�̢̢�------0. ����----------");		
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
	}//print

}
