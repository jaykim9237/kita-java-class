package scoreTest;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� :");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num + "�� ¦���Դϴ�.");
		}else System.out.println(num + "�� Ȧ���Դϴ�.");
	}

}
