package day08Test;

public class Tset02Answer {

	public static void main(String[] args) {
		String array [] = {"브레드", "월크", "초코", "소세지", "치즈"};
		System.out.println("원래 배열: ");
		for (String s : array) {
			System.out.print(s +" ");
		}//sor
		
		System.out.println();
		
		//이덱스 값은 항상 그거보다 하나 작다는 생각을 해야해
		for (int i = 4; i >=0; i--) {
			System.out.print(array[i] + " ");
		}
	}//main

}//class
