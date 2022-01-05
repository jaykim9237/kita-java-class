package day03;

import java.util.Scanner;

public class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 초단위로 입력하세요 : ");
		long sec = sc.nextLong();

		long hr = sec/3600;
		System.out.println(hr +"시간");

		long min = (sec - hr*60)/60;
		System.out.println(min +"분");

		long rest_sec = (sec - hr*60)/60;
		System.out.println(rest_sec +"초");





	}
}
