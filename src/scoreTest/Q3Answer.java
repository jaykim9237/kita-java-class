package scoreTest;

import java.util.Scanner;

public class Q3Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("������ ������: ");
		int r = sc.nextInt();
		System.out.print("������ ����: ");
		int h = sc.nextInt();
		
		double v = (1.0/3.0)*PI*(r*r)*h;
		System.out.printf("qnvl : %.2f%n", v);
	}
}
