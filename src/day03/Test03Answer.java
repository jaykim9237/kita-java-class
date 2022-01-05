package day03;

import java.util.Scanner;

public class Test03Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 :  ");
		int kor = sc.nextInt();

		System.out.print("영어점수 :  ");
		int eng = sc.nextInt();

		System.out.print("수학점수 :  ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.printf("총점: %d, 평균: %.2f %n", total, avg);
	}
}
