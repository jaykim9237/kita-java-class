package day04;

import java.util.Scanner;

public class Test08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("사용하실 연산자(*,/,-,+)를 입력하세요 : ");
		String cal = sc.nextLine();

		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();

		System.out.print("정수를 입력하세요 : ");
		int b = sc.nextInt();
		
		double result = 0;
		
		
	
		switch(cal){
			case "+" : result = a + b;
				break;
			case "-" : result = a - b;
				break;
			case "*" : result = a*b;
				break;
			case "/" : 
				
				if(b != 0) result = a/b;
				break;
			default : 
				System.out.print("잘 못 된 연산자입니다.");
				return;
		}//switch

	System.out.printf("%d %s %d 는 %.2f입니다.%n,", a, cal, b, result);

	}//main
}//class
