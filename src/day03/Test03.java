package day03;

import java.util.Scanner;

public class Test03

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� :  ");
		int korean = sc.nextInt();

		System.out.print("�������� :  ");
		int english = sc.nextInt();

		System.out.print("�������� :  ");
		int math = sc.nextInt();

		int sum = (korean + english + math);
		Double avg = sum/3.0;
		System.out.print("���� : " +sum+ " ���: " +avg ); //�Ҽ��� �ΰ��� �ϴ°� �����߾�
	}
}
