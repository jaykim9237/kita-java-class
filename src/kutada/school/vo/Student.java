package kutada.school.vo;

public class Student extends Person{
	private String stdNo;
	
	//�����ڸ� ���� �� �츮�� �й��� ������� �ƴ϶� �̸� ���� �ֹι�ȣ �й��� ������ ������ �ϴ°��ݾ� �׷���? �й����ִ°Ŵ� �ƴϴϱ� �׷��� �ٸ��Ÿ� ��� Ŭ������ ������ �ִ°��� ? 
	//�׷��ϱ� �θ� Ŭ���� ���� �Ѱ� ����ϴ��ž� �׶� ���°� ���۸� ����� 
	//�θ�Ŭ������ �޽��� �����ڸ� ȣ���Ͽ� �̸� ���� �ֹ� ��ȣ�� �����Ѵ�. 
	//�θ� ��ü�� �����Ǿ���� �ڽ��� ��ü�� ������ �� �־� , 
	
	public Student(String name, int age, String ssn, String stdNo) {
	
		//���ۺ��� ������ �ƹ��͵� ������ �� �� ���� , �ƹ� �ڵ嵵 �� �� ���ٴ°���!! �ֳ��ϸ� �θ��� �ڵ忡 ���� ���ܾ��� 
	super(name, age, ssn);
	this.stdNo = stdNo;
	//�й��� ���� �ʱ�ȭ�� ���� �ִ°Ŷ�� ..? �̰� ���� ...��
	
	
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	
	public void printInfo() {
		//�θ��� ���� �ҷ��� ����� �ϰ� �� ������ �ʿ��Ѱ� �����ٰ� ����ϴ°��� 
		super.printInfo();
		System.out.printf(",�й� : %s%n", stdNo);
	}

}