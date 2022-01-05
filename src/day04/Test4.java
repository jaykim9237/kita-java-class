package day04;

import java.util.Scanner;

public class Test4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int month = sc.nextInt();

		int day;
		switch(month){
			case 4 : 
			case 6 : 
			case 9 : 
			case 11:
				day = 30;
			break;

			case 1 : 
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 : 
			case 10 : 
			case 12 :
				day = 31;
			break;

			case 2 :
				if (year % 4 == 0 && (year % 100 != 0 ) || year % 400 == 0)
				{ day = 28; }

				day = 29;
			break;

			default :
				day = 0;

		
		}//switch
	
		System.out.printf("%d�� %d�� �� %d�ϱ��� �ֽ��ϴ�.%n", year, month, day);
		
	}//main
}//class



