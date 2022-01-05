package day03;

import java.util.Scanner;

public class Test05Answer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 초단위로 입력하세요 : ");
		int time = sc.nextInt();

		int sec = time;
		int hour = sec/3600;
		sec = sec % 3600;
		int minute = sec / 60;
		sec = sec % 60;

		System.out.printf("%d초는 %d시간 %d분 %d초 입니다. %n", time, hour, minute, sec); 
	}
}


//오류나왔으니 다시해보기