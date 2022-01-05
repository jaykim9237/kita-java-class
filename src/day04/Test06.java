package day04;

import java.util.Scanner;

public class Test06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 해를 입력하세요 : ");
		int birth = sc.nextInt();

 //고용노동부 전화 받으니라 지금...못했어..
		
		String ddi = "잘못입력하셨습니다."; //null : 참조형 데이터의 기본값

		switch((birth-3)%12){
			case 1: ddi = "쥐";
				break;
			case 2: ddi = "소";
				break;
			case 3: ddi = "호랑이";
				break;
			case 4: ddi = "토끼";
				break;
			case 5: ddi = "용";
				break;
			case 6: ddi = "뱀";
				break;
			case 7: ddi = "말";
				break;
			case 8: ddi = "양";
				break;
			case 9: ddi = "원숭이";
				break;
			case 10: ddi = "닭";
				break;
			case 11: ddi = "개";
				break;
			case 12: ddi = "돼지";
				break;

			}//switch

		System.out.printf("입력하신 %d년의 띠는 %s입니다.%n", birth, ddi);

	}
}
