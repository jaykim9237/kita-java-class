package day08Test;

public class Test04Answer {

	public static void main(String[] args) {
		char array[] = {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M'};
		
		System.out.println("변경 전 : ");
		for (char c : array) {
			System.out.print(c);
		}
		
		System.out.println();
		for(char i = 0; i<alph.length; i++) {
			if('A' <= array[i] && array[i] <='F')
				|| (array[i]>= 'Q' && array[i]<= 'Z'){
				array[i] = '*'
			}//if
		}//for
		
		System.out.print("변경 후: ");
		for (char c : array) {
			System.out.print(c);
	}

}
