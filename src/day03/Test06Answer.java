package day03;

import java.util.Scanner;

public class Test06Answer  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price, m50t, m10t, m5t, m1t, rest; //������ Ÿ���� ������ �� �־� 
		System.out.print("��ǰ������ �Է��ϼ��� : ");
		price = sc.nextInt();

		rest = price;
		m50t = rest/50000;
		rest = rest % 50000;
		m10t = rest / 10000;
		rest = rest % 10000;
		m5t = rest / 5000;
		rest = rest % 5000;
		m1t = rest / 1000;
		rest = rest %1000;

		System.out.printf("%d���� 5������ %d��, 1������ %d��, 5õ���� %d��, 1õ���� %d���� �����ϰ� %d���� ���ҽ��ϴ�. %n", price, m50t, m10t, m5t, m1t, rest);


		

	}
}