package scoreTest;

import java.util.Scanner;

public class Q1Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� :");
		int num = sc.nextInt();
		
		System.out.println(num % 2 ==0 ? num + "�� ¦���Դϴ�." : num + "�� Ȧ���Դϴ�.");
	}
}
