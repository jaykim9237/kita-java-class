package day03;

import java.util.Scanner;

public class Test05Answer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð��� �ʴ����� �Է��ϼ��� : ");
		int time = sc.nextInt();

		int sec = time;
		int hour = sec/3600;
		sec = sec % 3600;
		int minute = sec / 60;
		sec = sec % 60;

		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�. %n", time, hour, minute, sec); 
	}
}


//������������ �ٽ��غ���