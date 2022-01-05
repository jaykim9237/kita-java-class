package day02;

import java.util.Scanner;

public class ScannerTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int i = sc.nextInt(); //넥스트인이 뭔지 찾아봐야겠다...
		System.out.println("입력한 숫자는" +i+ "입니다.");
		//여기는 스캐너 출력값이 안나와 cmd에서 나오게 할거야 설정에서 캡쳐 말고 없음으로 바꾸고 하자
	}
}
