package day03;


import java.util.Scanner;
 
 public class Test02Answer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();

		System.out.print("나이: ");
		int age = sc.nextInt();

		System.out.print("키: ");
		Double height = sc.nextDouble();
		System.out.printf("이름은 %s이고, 나이는 %d, 키는 %.2fcm입니다.%n",name, age, height);

	}
}
