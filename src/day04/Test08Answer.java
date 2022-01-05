package day04;

import java.util.Scanner;

public class Test08Answer
{
	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);

		System.out.print("사용하실 연산자(*,/,-,+)를 입력하세요 : ");
		String op = ab.next();

		System.out.print("정수를 입력하세요 : ");
		int num1 = ab.nextInt();

		System.out.print("정수를 입력하세요 : ");
		int num2 = ab.nextInt();
		
		
		int result = 0;
		switch(op){
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "*" : result = num1 * num2;
				break;
			case "/" : 
				
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					 return;
				}
				
				result = num1/num2; //else는 없어도 되는거야 왜냐하면 if만으로도 사용할 수있으니까
				
				break;
			//틀린부분!!
			default: 
				System.out.println("잘못된 연산자입니다.");
				return; //메서드의 실행을 종료해라
		}//switch

	System.out.printf("%d %s %d 는 %d 입니다.%n,", num1, op, num2, result);

	}//main
}//class
