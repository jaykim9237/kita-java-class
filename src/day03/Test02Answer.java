package day03;


import java.util.Scanner;
 
 public class Test02Answer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = sc.next();

		System.out.print("����: ");
		int age = sc.nextInt();

		System.out.print("Ű: ");
		Double height = sc.nextDouble();
		System.out.printf("�̸��� %s�̰�, ���̴� %d, Ű�� %.2fcm�Դϴ�.%n",name, age, height);

	}
}
