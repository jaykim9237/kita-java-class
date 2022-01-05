package day06.classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/*명시적 생성자
	 * 생성자 규칙
	 * -생성자는 이름이 클래스와 같다.
	 * -리턴타입을 가지지 않는다.
	 * 명시적 생성자를 만들면 더이상 기본 생성자는 자동으로 만들어 지지 않는다.
	 * 원래는 초기화 되어서 값이 생기는데 내가 만들어 준거지*/
	
	
	public Student(int studentID, String studentName, 
					int grade, String address) {  //일부로 매개변수랑 이름을 동일하게 한거야 , 그 값을 초기화 하려고 사용한거니까 .
		this.studentID = studentID;/*근데 여기 앞에꺼가 불렀는는데 가까이에 있는 로컬변수를 읽은거야 그러니까 같은거 = 같은거가 된거야 근데 우리가 부르는거는 안에 
		있는거를 부르는게 아니잖아 그러니까 앞ㅇㅔ this를 붙여서 안에 있는게 아니라 멤버변수라는 것을 알려주는거지*/
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
		
	}
	
	public Student(int studentID, String studentName, 
			 String address) {  //객체를 다양하게 쓸수 있게 하려고 여러개를 쓸 수 있어, 여기 같은 경우는 학년이 항상 1인거지
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
