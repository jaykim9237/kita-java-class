package day03;

import java.util.Scanner;
public class Test04

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("����01 :  ");
		int sub01 = sc.nextInt();

		System.out.print("����02 :  ");
		int sub02 = sc.nextInt();

		System.out.print("����03 :  ");
		int sub03 = sc.nextInt();

		double avg = (sub01 + sub02 + sub03)/3.0;
		System.out.println("��� : " +avg);


		String result;
		result = (avg >= 60 && sub01 > 40 && sub02 > 40 && sub03 > 40) ? "�հ�" : "���հ�" ;
		System.out.println(result); //�Ʊ �׷��µ� f�� �Ⱦ��� ����Ʈ�� �ߴ��� �Ҽ����� �������� �ʾ�

	}
}
