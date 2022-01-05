package day04;

import java.util.Scanner;

public class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();

		if (year %4 == 0 && (/*100의 배수가 아닌해 */year%100 != 0 ) || year%400 == 0 )
		//뭔가 너무 긴거 같은데 짧은 방법이 없을까
		{
			System.out.println(year + "는 윤년입니다.");
		}

		else 
			System.out.println(year + "는 평년입니다.");	
		
	}
}
