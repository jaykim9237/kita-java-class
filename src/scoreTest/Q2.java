package scoreTest;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	}

}
