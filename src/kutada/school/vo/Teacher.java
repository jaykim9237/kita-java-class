package kutada.school.vo;
public class Teacher extends Person {

		private String subject;//교과목
		
		
	public Teacher(String name, int age, String ssn, String subject) {
		super(name, age, ssn);
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void printInfo() {
		super.printInfo();
		System.out.printf("과목 : %s", subject);
	}
}
