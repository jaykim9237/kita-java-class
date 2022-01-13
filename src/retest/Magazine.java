package retest;

public class Magazine extends Book
{

	public Magazine(String id, String title, String publisher) {
		super(id, title, publisher);
	}
	
	private int year;
	private int month;
	
	
	public Magazine(String id, String title, String publisher, int year, int month) {
		super(id, title, publisher);
		this.year = year;
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [������ =" + year + "/" + month + "]";
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	

}
