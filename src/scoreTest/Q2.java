package scoreTest;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
	}

}
