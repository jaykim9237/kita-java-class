package day06.classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*����� ������
	 * ������ ��Ģ
	 * -�����ڴ� �̸��� Ŭ������ ����.
	 * -����Ÿ���� ������ �ʴ´�.
	 * ����� �����ڸ� ����� ���̻� �⺻ �����ڴ� �ڵ����� ����� ���� �ʴ´�.
	 * ������ �ʱ�ȭ �Ǿ ���� ����µ� ���� ����� �ذ���*/
	
	
	public Student(int studentID, String studentName, 
					int grade, String address) {  //�Ϻη� �Ű������� �̸��� �����ϰ� �Ѱž� , �� ���� �ʱ�ȭ �Ϸ��� ����ѰŴϱ� .
		this.studentID = studentID;/*�ٵ� ���� �տ����� �ҷ��´µ� �����̿� �ִ� ���ú����� �����ž� �׷��ϱ� ������ = �����Ű� �Ȱž� �ٵ� �츮�� �θ��°Ŵ� �ȿ� 
		�ִ°Ÿ� �θ��°� �ƴ��ݾ� �׷��ϱ� �դ��� this�� �ٿ��� �ȿ� �ִ°� �ƴ϶� ���������� ���� �˷��ִ°���*/
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
		
	}
	
	public Student(int studentID, String studentName, 
			 String address) {  //��ü�� �پ��ϰ� ���� �ְ� �Ϸ��� �������� �� �� �־�, ���� ���� ���� �г��� �׻� 1�ΰ���
			this.studentID = studentID;
			this.studentName = studentName;
			this.grade = 1;
			this.address = address;

}
	

	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
