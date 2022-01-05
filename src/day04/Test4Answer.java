package day04;

import java.util.Scanner;

public class Test4Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int month = sc.nextInt();

		int days = 0;
		switch(month){
			case 1 : 
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 : 
			case 10 : 
			case 12 :
				days = 31;
				break;

			case 4 : 
			case 6 : 
			case 9 : 
			case 11 :
				days = 30;
				break;

			case 2 :
				//������ �ѹ� ����
				if(checkLeapYear(year))
					days = 29;
				else
					days = 28;
				break;
			default: System.out.println("�ùٸ��� ���� �����Դϴ�.");	
		
			}//switch

		
		System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.%n", year, month, days);		
	}//main

	static boolean checkLeapYear(int year){
		boolean result = false; 
		if (year % 4 == 0 && (year % 100 != 0 ) || year % 400 == 0 )
		{
			result = true;
		}
		
		return result;
	}
}