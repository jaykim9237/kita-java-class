package day10.inheritance;

class A{
	private int a = 10;
	
	public int getA() {
		return a;
	}
}

class B extends A {
	private int b = 20;
	
	public int getB() {
		return b;
	}
}
public class InheritanceTest01 {
	
	public static void main(String[] args) {
		B b =new B();
		System.out.println(b.getA());
		
		A a = new B();
		/*B b2 = (B)a;//ū�Ÿ� �ٽ� �����ſ� �δ� �������� �׷��� ������ ���ž� �׷��ϱ� ����ȯ�� ��������ϴ°���
		
		System.out.println(a.getB());//�̱��� �η簡���ؼ� ����!*/
		
		B b2 = (B)a;
		System.out.println(b2.getB()); //�̰� �´°ž�
	}
}
