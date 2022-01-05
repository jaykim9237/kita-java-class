package day08Test;

public class Test05Answer {

	public static void main(String[] args) {
 
		int array [] = new int[3];
		
		do {
			array[0] = (int)(Math.random()*45+1);
			array[1] = (int)(Math.random()*45+1);
			array[2] = (int)(Math.random()*45+1);
			
		}while(array[0] == array[1] || array[1] == array[2] || array[2] == array[0]);
		
	}//main

}//class
