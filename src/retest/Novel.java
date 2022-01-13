package retest;

public class Novel extends Book{

	public Novel(String id, String title, String publisher) {
		super(id, title, publisher);
	}
	
	
	private String author;
	private String genre;
	
	
	public Novel(String id, String title, String publisher, String author, String genre) {
		super(id, title, publisher);
		this.author = author;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Novel [저자=" + author + ", 장르=" + genre + "]";
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
