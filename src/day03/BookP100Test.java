package day03;

import java.util.Scanner;


class BookP100Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		

		if(score >= 90)
			System.out.println("A");

		else if(80<=score && score<90)
			System.out.println("B");

		else if(70<=score && score<80)
			System.out.println("C");

		else if(60<=score && score<70)
			System.out.println("D");
		
		else//� ���� ������ �ߴµ� else if�� 60�̸��϶� ������ �����°� ���� ������ �ʱ�ȭ�� �ȵ�������� �ϼ̴µ�...
			System.out.println("F"); //��....5<��<5�� �ʿ䰡 ������... else if�� � ������ ���ظ� ���ؼ� ���� �����̴�.
		//����� �������� ���ξ����� �ٽ� Ǯ��� 
		
	}
}
