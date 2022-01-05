package kutada.school.vo;

public class Employee extends Person {
	
	private String dept;

	public Employee(String name, int age, String ssn, String dept) {
		super(name, age, ssn);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.printf("ÇÐ¹ø : %s%n", dept);
	}

}
