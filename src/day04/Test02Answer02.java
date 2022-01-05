package day04;

import java.util.Scanner;

public class Test02Answer02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		switch(num % 2){
		case 0 : System.out.println(num+"은 짝수입니다.");
			break;
		case 1 : System.out.println(num+"은 홀수입니다.");
		}

	}
}