package day06.classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(2020, "홍길동", 1, "서울시 강남구");
		
		
		
		System.out.println(student.studentName);
		System.out.println(student.getStudentName());
		System.out.println(student.grade);
	}

}
