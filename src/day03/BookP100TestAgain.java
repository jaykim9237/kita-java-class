package day03;

import java.util.Scanner;


public class BookP100TestAgain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int score;
		char grade;

		System.out.print("성적을 입력하세요 : ");
		score = sc.nextInt();

		if (score >= 90)
		{	grade = 'A';
		}

		else if (score >= 80)
		{	grade = 'B';
		}
		
		else if (score >= 70)
		{	grade = 'C';
		}

		else if (score >= 60)
		{	grade = 'D';
		}

		else 
			grade = 'F';

		System.out.printf("당신의 성적은 %d으로 등급은 '%s' 입니다.%n", score, grade);
//잘해따~~~~

	}
}