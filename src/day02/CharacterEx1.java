package day02;

public class CharacterEx1  
{
	public static void main(String[] args) 
	{
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //int 타입으로 형 변환 //a의 그거가 65인거야

		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		/*System.out.ptintln((int)ch2); 그 차례로 나오게 만들어보고 싶어*/

		int ch3 = 67;
		System.out.println((char)ch3);
		System.out.println(ch3);

		char ch4 = '\uD55C';
		char ch5 = '현';
		System.out.println(ch4);
		System.out.println(ch5);
		
	}
}
