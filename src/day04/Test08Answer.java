package day04;

import java.util.Scanner;

public class Test08Answer
{
	public static void main(String[] args) 
	{
		Scanner ab = new Scanner(System.in);

		System.out.print("����Ͻ� ������(*,/,-,+)�� �Է��ϼ��� : ");
		String op = ab.next();

		System.out.print("������ �Է��ϼ��� : ");
		int num1 = ab.nextInt();

		System.out.print("������ �Է��ϼ��� : ");
		int num2 = ab.nextInt();
		
		
		int result = 0;
		switch(op){
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "*" : result = num1 * num2;
				break;
			case "/" : 
				
				if(num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					 return;
				}
				
				result = num1/num2; //else�� ��� �Ǵ°ž� �ֳ��ϸ� if�����ε� ����� �������ϱ�
				
				break;
			//Ʋ���κ�!!
			default: 
				System.out.println("�߸��� �������Դϴ�.");
				return; //�޼����� ������ �����ض�
		}//switch

	System.out.printf("%d %s %d �� %d �Դϴ�.%n,", num1, op, num2, result);

	}//main
}//class
