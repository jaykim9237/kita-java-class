package kutada.school.vo;

public class Person{
	private String name;
	private int age;
	private String ssn;
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}
	
	public void printInfo() {
		System.out.printf("������ �̸� : %s, ���� : %d , �ֹι�ȣ : %s ", name, age, ssn);
	}
	
	
}
