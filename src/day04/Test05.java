package day04;

import java.util.Scanner;

public class Test05
 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ��ð��� �Է��ϼ��� : ");
		int time = sc.nextInt(); 

		int pay = 0;
		if(time <= 50){
			pay = time*10000;
		}
		
		else
			pay = (int)((time*10000)*1.1);
		//���������� ���������� ��Ÿ���ַ��� �տ� �ຯȯ�� �ؾ��ϴµ� �� ���� ()���ָ� ��!

		System.out.print("������ �޿���" +pay+ "�Դϴ�.");


	}//main
}//class
