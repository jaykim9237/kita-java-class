package day03;

import java.util.Scanner;

public class Test01 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		
		boolean value = (num > 0); /*괄호는 있어도 되고 없어도 돼*/
		System.out.print("입력하신 값은 " + num + "입니다. ------> It is ");
		System.out.println(value);
				
	

			
	}
}
