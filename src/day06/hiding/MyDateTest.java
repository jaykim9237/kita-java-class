package day06.hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate(2021, 11, 30);
		System.out.printf("%d년 %d월 %d일%n",md.getYear(), md.getMonth(), md.getDay());
		System.out.println(md);
		
		md.setDay(29);//유효한 값이 아니잖아 32일 없으니까 , 변수의 접근 가능자를 한정지으는거지 그게 get, set
		System.out.printf("%d년 %d월 %d일%n",md.getYear(), md.getMonth(), md.getDay());
		
	}

}
