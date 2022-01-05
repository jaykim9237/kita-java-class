package day03;

import java.util.Scanner;

public class Test04Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 :  ");
		int kor = sc.nextInt();

		System.out.print("영어점수 :  ");
		int eng = sc.nextInt();

		System.out.print("수학점수 :  ");
		int mat = sc.nextInt();

		int total = kor + eng + mat;
		double avg = total / 3.0;
		boolean result = (avg >= 60) && (kor >=40) && (eng >=40) && (mat >=40);
		System.out.printf("평균:%.2f %n" , avg);
		System.out.println(result ? "합격" : "불합격");
		

	}
}