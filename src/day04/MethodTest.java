package day04;

import java.util.Scanner;

public class MethodTest

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		MethodTest mt = new MethodTest();

		boolean isLeapYear = checkLeapYear(year);
		System.out.println(isLeapYear);
//ý���̾ ������ ���ž� �ֳ��ϸ� ����ƽ�� �Խ��� �ҷ��� �� �����ϱ� 
	}
	 /*
		�Է¹��� �⵵�� �������� ��������� �˻��Ѵ�.
		�����̸�  true, ����̸� false�� ��ȯ.
	*/
	boolean checkLeapYear(int year){
		boolean result = false; //���������� �ʱ�ȭ���ִ� ���� ����
		if (year % 4 == 0 && (year % 100 != 0 ) || year % 400 == 0 )
		{
			result = true;
		}

		/*else�� �� �� ������ �⺻ ����Ʈ ��(�⺻��)�� �������� �س��� �����ݾ� �׷��ϱ� ���� �ƴϸ� �����ΰ��� */
		return result;

		/* �̰Ÿ� ����ƽ���� ����ž�
		static boolean checkLeapYear(int year){
		boolean result = false; //���������� �ʱ�ȭ���ִ� ���� ����
		if (year % 4 == 0 && (year % 100 != 0 ) || year % 400 == 0 )
		{
			result = true;
		}

		/*else�� �� �� ������ �⺻ ����Ʈ ��(�⺻��)�� �������� �س��� �����ݾ� �׷��ϱ� ���� �ƴϸ� �����ΰ��� */
		
	}
	}


