package day05;

public class ContinueExample

{
	public static void main(String[] args) 
	{
		int total = 0;
		int num;

		for(num = 1; num <= 100; num++){

			if(num % 2 ==0)
				continue;

			total += num;

		}//for

		System.out.println("1���� 100������ Ȧ���� ���� : "+ total +"�Դϴ�.");
	}
}
