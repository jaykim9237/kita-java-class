package day03;

import java.util.Scanner;

public class Test03Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� :  ");
		int kor = sc.nextInt();

		System.out.print("�������� :  ");
		int eng = sc.nextInt();

		System.out.print("�������� :  ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.printf("����: %d, ���: %.2f %n", total, avg);
	}
}
