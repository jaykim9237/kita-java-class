package day04;

import java.util.Scanner;

public class Test02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();

		if (a%2 == 0)
		{	System.out.println("¦���Դϴ�.");
		}

		else{
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}
