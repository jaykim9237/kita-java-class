package day04;

import java.util.Scanner;

public class Test05Answer
 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ��ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int hourpay = 10000;

		int pay = 0;
		if(time <= 50)
			pay = time * hourpay;
		
		else{
			pay = (int)(50*hourpay + (time-50) * hourpay * 1.1);
		}

		System.out.print("������ �޿���" +pay+ "�Դϴ�.");
	}

}