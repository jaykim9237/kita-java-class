package day04;

import java.util.Scanner;

public class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();

		if (year %4 == 0 && (/*100�� ����� �ƴ��� */year%100 != 0 ) || year%400 == 0 )
		//���� �ʹ� ��� ������ ª�� ����� ������
		{
			System.out.println(year + "�� �����Դϴ�.");
		}

		else 
			System.out.println(year + "�� ����Դϴ�.");	
		
	}
}
