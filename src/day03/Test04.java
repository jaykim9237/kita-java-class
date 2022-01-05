package day03;

import java.util.Scanner;
public class Test04

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("과목01 :  ");
		int sub01 = sc.nextInt();

		System.out.print("과목02 :  ");
		int sub02 = sc.nextInt();

		System.out.print("과목03 :  ");
		int sub03 = sc.nextInt();

		double avg = (sub01 + sub02 + sub03)/3.0;
		System.out.println("평균 : " +avg);


		String result;
		result = (avg >= 60 && sub01 > 40 && sub02 > 40 && sub03 > 40) ? "합격" : "불합격" ;
		System.out.println(result); //아까도 그랬는데 f를 안쓰는 프린트를 했더니 소수점이 끊이지를 않아

	}
}
