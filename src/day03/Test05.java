package day03;

import java.util.Scanner;

public class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð��� �ʴ����� �Է��ϼ��� : ");
		long sec = sc.nextLong();

		long hr = sec/3600;
		System.out.println(hr +"�ð�");

		long min = (sec - hr*60)/60;
		System.out.println(min +"��");

		long rest_sec = (sec - hr*60)/60;
		System.out.println(rest_sec +"��");





	}
}
