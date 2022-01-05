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
		    //콤마 하는거랑 포이치 사용하는거 못했어 
		}
		System.out.println();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("변경하고 싶은 위치 1을 입력하세요 : ");
			int num1 = sc.nextInt()-1;//그냥수이면 안되 항상 0을 염두하고 있어야해
			
			System.out.println("변경하고 싶은 위치 2를 입력하세요 : ");
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
