package day03;

import java.util.Scanner;


public class Test01Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");
		int num = sc.nextInt();
		System.out.println("num�� ��:" +num);
		boolean result = num > 0;
		System.out.println("result: "+result);
	}
}
