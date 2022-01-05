package day07.staticex;



//�̱��� Ŭ����
class Company{
	private int total;
	private static Company c = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		
		return c;
	}
	public void addTotal(int num) {
		total += num;
	}
	
	public int getTotal() {
		return total;
	}
	
}

public class SingletonTest {

	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		c1.addTotal(100);
		System.out.println("���� ��ü ��" + c1.getTotal());
		
		Company c2 = Company.getInstance();
		c2.addTotal(100);
		System.out.println("���� ��ü ��" + c2.getTotal());
		
		System.out.println(C1 == c2); //���� ��ü�̳� �ϰ� ����°��� �׷� Ʈ�簡 ���� 
	}

}
