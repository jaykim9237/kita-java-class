package day07.staticex;



//싱글턴 클래스
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
		System.out.println("현제 전체 값" + c1.getTotal());
		
		Company c2 = Company.getInstance();
		c2.addTotal(100);
		System.out.println("현제 전체 값" + c2.getTotal());
		
		System.out.println(C1 == c2); //같은 객체이냐 하고 물어보는거지 그럼 트루가 나와 
	}

}
