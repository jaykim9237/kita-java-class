package day04;

import java.util.Scanner;

public class Test08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("����Ͻ� ������(*,/,-,+)�� �Է��ϼ��� : ");
		String cal = sc.nextLine();

		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();

		System.out.print("������ �Է��ϼ��� : ");
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
				System.out.print("�� �� �� �������Դϴ�.");
				return;
		}//switch

	System.out.printf("%d %s %d �� %.2f�Դϴ�.%n,", a, cal, b, result);

	}//main
}//class
