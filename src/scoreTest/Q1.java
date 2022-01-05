package scoreTest;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 :");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num + "는 짝수입니다.");
		}else System.out.println(num + "는 홀수입니다.");
	}

}
