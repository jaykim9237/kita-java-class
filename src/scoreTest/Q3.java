package scoreTest;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������: ");
		int r = sc.nextInt();
		System.out.print("������ ����: ");
		int h = sc.nextInt();
		
		double v = (3.14*r*r*h)/3;
		System.out.printf("������ ���� : %.2f", v);
	}

}
