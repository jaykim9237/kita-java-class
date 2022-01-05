package day03;

import java.util.Scanner;

public class Test03

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 :  ");
		int korean = sc.nextInt();

		System.out.print("영어점수 :  ");
		int english = sc.nextInt();

		System.out.print("수학점수 :  ");
		int math = sc.nextInt();

		int sum = (korean + english + math);
		Double avg = sum/3.0;
		System.out.print("총점 : " +sum+ " 평균: " +avg ); //소수점 두개만 하는거 실패했어
	}
}
