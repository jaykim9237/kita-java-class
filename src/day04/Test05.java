package day04;

import java.util.Scanner;

public class Test05
 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간을 입력하세요 : ");
		int time = sc.nextInt(); 

		int pay = 0;
		if(time <= 50){
			pay = time*10000;
		}
		
		else
			pay = (int)((time*10000)*1.1);
		//더블이지만 정수까지만 나타내주려면 앞에 행변환을 해야하는데 그 값은 ()해주면 돼!

		System.out.print("귀하의 급여는" +pay+ "입니다.");


	}//main
}//class
