package day03;


import java.util.Scanner;
 
 public class Test02

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();

		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();

		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble(); 

		System.out.println("이름은 " +name+ "이고, 나이는 " +age+ "세, 키는 " +height+ " 입니다.");
	}
}
