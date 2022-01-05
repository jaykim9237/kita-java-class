package day04;

import java.util.Scanner;

public class Test07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight/((height/100)*(height/100));
		String result = null;
			

			if(bmi <18.5){
				result = "저체중";
			}
			else if(18.5<=bmi  && bmi<23 ){
				result = "정상";
			}
			else if(23<=bmi  && bmi<25 ){
				result = "과체중";
			}
			else
				result = "비만";

		System.out.printf("키 %.2f 몸무게 %.2f 의 BMI 지수는 %.2f,  %s입니다.%n", height, weight, bmi, result);

	}

}
