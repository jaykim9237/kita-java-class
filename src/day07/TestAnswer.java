package day07;

import java.util.Scanner;

public class TestAnswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�迭�� ũ�� : ");
			int length = sc.nextInt();
			
			if(length == -1) break;
			
			if(length < 2) {
				System.out.println("2�̻��� ���� �Է��ϼ���.");
				continue;
			}
			;
			int array[] = new int[length];
			
				for(int i = 0; i < array.length; i++) {
					System.out.printf("�迭[%d] = ", i);
					array[i] = sc.nextInt();
				}//for
				
				int sum = 0;
				for (int i = 0; i<array.length; i++) {
					sum+=array[i];
				}
				
				for (int i = 0; i<array.length; i++) {
					System.out.print(array[i]);
					if(i< array.length -1)
						System.out.print("+");
				}
				
				System.out.println(" = "  + sum);
						
		}//while
			
		 
	 }//main
}//class



