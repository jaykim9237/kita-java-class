package day04;

import java.util.Scanner;

public class Test07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight = sc.nextDouble();

		double bmi = weight/((height/100)*(height/100));
		String result = null;
			

			if(bmi <18.5){
				result = "��ü��";
			}
			else if(18.5<=bmi  && bmi<23 ){
				result = "����";
			}
			else if(23<=bmi  && bmi<25 ){
				result = "��ü��";
			}
			else
				result = "��";

		System.out.printf("Ű %.2f ������ %.2f �� BMI ������ %.2f,  %s�Դϴ�.%n", height, weight, bmi, result);

	}

}
