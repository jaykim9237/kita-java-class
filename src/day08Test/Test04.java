package day08Test;

public class Test04 {

	public static void main(String[] args) {

		char alph[] = {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M'};
		
		//0-5까지의 자리는 *로 바꾸고
		//16-27까지의 자리는 *오 바꾸지
		
		for(char i = 0; i<alph.length; i++) {
			if('A' < alph[i] && alph[i] < 'F') {
				
			}//if
			
			if('Q' < alph[i] &&  alph[i] < 'Z') {
				alph[i] = '*';
			}//if
			
			
		}//for
		
		for (char c : alph) {
			System.out.print(c);
		}
		
		
		
	}//main

}
