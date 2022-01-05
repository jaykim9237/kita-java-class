package kutada.school.vo;

public class Student extends Person{
	private String stdNo;
	
	//생성자를 만들 때 우리는 학번만 만드느게 아니라 이름 나이 주민번호 학번을 가지고 만들어야 하는거잖아 그렇지? 학번만있는거는 아니니까 그런데 다른거를 사람 클래스가 가지고 있는거지 ? 
	//그러니까 부모 클래스 한테 넘겨 줘야하느거야 그때 쓰는게 슈퍼를 사용해 
	//부모클래스인 펄슨의 생성자를 호출하여 이름 나이 주민 번호를 전달한다. 
	//부모가 객체가 생성되어야지 자식이 객체를 생산할 수 있어 , 
	
	public Student(String name, int age, String ssn, String stdNo) {
	
		//슈퍼보다 위에는 아무것도 실행이 될 수 없어 , 아무 코드도 올 수 없다는거지!! 왜냐하면 부모의 코드에 먼저 생겨야해 
	super(name, age, ssn);
	this.stdNo = stdNo;
	//학번에 대한 초기화를 시켜 주는거라고 ..? 이게 뭐지 ...후
	
	
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	
	public void printInfo() {
		//부모의 것을 불러다 사용을 하고 그 다음에 필요한걸 가져다가 사용하는거지 
		super.printInfo();
		System.out.printf(",학번 : %s%n", stdNo);
	}

}