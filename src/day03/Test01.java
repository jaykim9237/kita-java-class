package day03;

import java.util.Scanner;

public class Test01 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		
		boolean value = (num > 0); /*��ȣ�� �־ �ǰ� ��� ��*/
		System.out.print("�Է��Ͻ� ���� " + num + "�Դϴ�. ------> It is ");
		System.out.println(value);
				
	

			
	}
}
