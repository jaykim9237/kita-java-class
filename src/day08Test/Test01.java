package day08Test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		
		int[] num = {223, 321, 305, 315, 330, 225, 126, 111, 222, 333};
		
		System.out.print("original: ");
		
		for(int i=0; i<=num.length; i++) {
			
			System.out.print(num[i]);		
			if(i < num.length-1)
					     System.out.print("," );
		    //�޸� �ϴ°Ŷ� ����ġ ����ϴ°� ���߾� 
		}
		System.out.println();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("�����ϰ� ���� ��ġ 1�� �Է��ϼ��� : ");
			int num1 = sc.nextInt()-1;//�׳ɼ��̸� �ȵ� �׻� 0�� �����ϰ� �־����
			
			System.out.println("�����ϰ� ���� ��ġ 2�� �Է��ϼ��� : ");
			int num2 =sc.nextInt()-1;
			
			int a = 0;
			num[num1] = a;
			num[num1] = num[num2];
			a = num[num2];
					
			System.out.println("new: ");
			for(int i: num) {
				System.out.print(i+ " ");
			}
			

			
			
		
	}//main

}//class
