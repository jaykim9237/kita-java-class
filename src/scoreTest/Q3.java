package scoreTest;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원뿔의 반지름: ");
		int r = sc.nextInt();
		System.out.print("원뿔의 높이: ");
		int h = sc.nextInt();
		
		double v = (3.14*r*r*h)/3;
		System.out.printf("원뿔의 부피 : %.2f", v);
	}

}
