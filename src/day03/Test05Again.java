package day03;

import java.util.Scanner;

public class Test05Again 
{
	public static void main(String[] args) 
	{
		long sec;
		long min;
		long hr;
		long rest;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("환산할 초를 정수로 입력해주세요 : ");
		sec = sc.nextLong();
		
		hr = sec/3600;
		rest = sec%3600;
		min = rest/*나머지*//60;
		rest= rest%60;
		

		System.out.printf("%d초는 %d시간 %d분 %d초 입니다. %n", sec, hr, min, rest);

		//너무 감격적이야 ㅠㅠㅠㅠㅠ 나머지를 한국어로 말하면서 글로 쓰니까 잘되었어 ㅠㅠ

	}
}
