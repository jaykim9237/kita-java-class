package day04;

import java.util.Scanner;

public class Test02Answer02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		switch(num % 2){
		case 0 : System.out.println(num+"�� ¦���Դϴ�.");
			break;
		case 1 : System.out.println(num+"�� Ȧ���Դϴ�.");
		}

	}
}