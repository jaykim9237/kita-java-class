package day04;

import java.util.Scanner;

public class Test01

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int b = sc.nextInt();
		System.out.print("����° ���� �Է� : ");
		int c = sc.nextInt();

		int max = a;
		if(max <b){
			max = b
		}

		if(max < c){
			max = c
		}

		System.out.printf("%d, %d, %d �� ���� ū ���� %d�Դϴ�.", a, b, c, max)
	}
}
