package day07.array;

public class ShallowCopy {

	public static void main(String[] args) {
		int num1[] = {10,20,30,40,50};
		int num2[] = num1;
		
		num1[0] = 1;
		
		System.out.println("=== num1 ===");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		
		System.out.println( );
		System.out.println("=== num2 ===");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}	
} 
