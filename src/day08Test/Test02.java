package day08Test;

public class Test02 {

	public static void main(String[] args) {

		String name [] = {"수1", "수2", "수3", "수4", "수5", "수6"};
		
	System.out.println("원래 배열: ");
		
	for(String a: name) {
		System.out.print(a +" ");
	}//for
	
	System.out.println();
	
	System.out.println("역순 배열: ");//i의 랭스의 값이 그대로일 수 없지 왜냐하면 배열의 시작은 0부터니까
	for(int i = name.length-1; i>=0; i-- ) {
		System.out.print(name[i] + " ");
		
	}
	
	}//main

}//class
