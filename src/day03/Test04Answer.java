package day03;

import java.util.Scanner;

public class Test04Answer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� :  ");
		int kor = sc.nextInt();

		System.out.print("�������� :  ");
		int eng = sc.nextInt();

		System.out.print("�������� :  ");
		int mat = sc.nextInt();

		int total = kor + eng + mat;
		double avg = total / 3.0;
		boolean result = (avg >= 60) && (kor >=40) && (eng >=40) && (mat >=40);
		System.out.printf("���:%.2f %n" , avg);
		System.out.println(result ? "�հ�" : "���հ�");
		

	}
}