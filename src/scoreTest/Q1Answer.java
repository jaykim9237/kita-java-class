package scoreTest;

import java.util.Scanner;

public class Q1Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 :");
		int num = sc.nextInt();
		
		System.out.println(num % 2 ==0 ? num + "는 짝수입니다." : num + "는 홀수입니다.");
	}
}
