package retest;

public class Book {
 //상위클래스
	
	private String id;
	private String title;
	private String publisher;
	
	public Book(String id, String title, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
	}

	
	@Override
	public String toString() {
		return "Book [도서 구분 번호=" + id + ", 제목=" + title + ", 출판사=" + publisher + "]";
	}

	public Book() {
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
