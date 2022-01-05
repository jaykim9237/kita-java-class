package day03;

import java.util.Scanner;


public class Test01Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int num = sc.nextInt();
		System.out.println("num의 값:" +num);
		boolean result = num > 0;
		System.out.println("result: "+result);
	}
}
