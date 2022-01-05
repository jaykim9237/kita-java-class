package day11.polymorphism;

public class MyDateTest {

	public static void main(String[] args) {
		//투스트링 매서드를 스트링클래스에 맞게 오버라이딩 , 재정의를 했기 때문이야 
		String s1 = new String("hello");
		System.out.println(s1);
		String s2 = new String("hello");
		//?? 투스트링이 뭐지?
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		
		
		
		MyDate md1 = new MyDate(2021, 12, 8	);
		MyDate md2 = new MyDate(2021, 12, 8	);
		//위에는 왜 헬로로 나오고 이거는 날짜가 안나오고 참조값이 나온거지? 아니 어떻게 나온거지? 오브젝트에서 온거지 ! 뭐든 클래스가 공동으로 가지고 있어야하는 것을 가지고 있어 오브젝트는
		System.out.println(md1.toString());
		//뉴뉴 했으니까 참조값이 다른거지 ! 매번 새로운 메모리를 만든거니까 
		//만약에 같게 하려면 마이데이트에 맞게끔 재정의 해줘야지 
		System.out.println(md1.equals(md2));
		
		
		

	}//main

}
