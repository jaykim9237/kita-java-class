package day04;

import java.util.Scanner;

public class MethodTest

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		MethodTest mt = new MethodTest();

		boolean isLeapYear = checkLeapYear(year);
		System.out.println(isLeapYear);
//첵립이어에 오류가 날거야 왜냐하면 스테틱한 함스를 불러올 수 없으니까 
	}
	 /*
		입력받은 년도가 윤년인지 평년인지를 검사한다.
		윤년이면  true, 평년이면 false를 반환.
	*/
	boolean checkLeapYear(int year){
		boolean result = false; //버릇적으로 초기화해주는 것이 좋아
		if (year % 4 == 0 && (year % 100 != 0 ) || year % 400 == 0 )
		{
			result = true;
		}

		/*else를 안 쓴 이유는 기본 디폴트 값(기본값)을 거짓으로 해놓은 것이잖아 그러니까 참이 아니면 거짓인거지 */
		return result;

		/* 이거를 스테틱으로 만든거야
		static boolean checkLeapYear(int year){
		boolean result = false; //버릇적으로 초기화해주는 것이 좋아
		if (year % 4 == 0 && (year % 100 != 0 ) || year % 400 == 0 )
		{
			result = true;
		}

		/*else를 안 쓴 이유는 기본 디폴트 값(기본값)을 거짓으로 해놓은 것이잖아 그러니까 참이 아니면 거짓인거지 */
		
	}
	}


