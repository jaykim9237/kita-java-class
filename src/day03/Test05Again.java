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
		System.out.print("ȯ���� �ʸ� ������ �Է����ּ��� : ");
		sec = sc.nextLong();
		
		hr = sec/3600;
		rest = sec%3600;
		min = rest/*������*//60;
		rest= rest%60;
		

		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�. %n", sec, hr, min, rest);

		//�ʹ� �������̾� �ФФФФ� �������� �ѱ���� ���ϸ鼭 �۷� ���ϱ� �ߵǾ��� �Ф�

	}
}
