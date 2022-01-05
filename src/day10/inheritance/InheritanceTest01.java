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
		/*B b2 = (B)a;//큰거를 다시 작은거에 두는 느낌이지 그래서 에러가 날거야 그러니까 형변환을 시켜줘야하는거지
		
		System.out.println(a.getB());//겁근이 부루가능해서 에러!*/
		
		B b2 = (B)a;
		System.out.println(b2.getB()); //이게 맞는거야
	}
}
