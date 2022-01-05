package day04;

import java.util.Scanner;

public class Test4Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 정수로 입력하세요 : ");
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
				//찍은거 한번 보기
				if(checkLeapYear(year))
					days = 29;
				else
					days = 28;
				break;
			default: System.out.println("올바르지 않은 숫자입니다.");	
		
			}//switch

		
		System.out.printf("%d년 %d월은 %d일까지 있습니다.%n", year, month, days);		
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