package day08Test;

public class Test04 {

	public static void main(String[] args) {

		char alph[] = {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M'};
		
		//0-5������ �ڸ��� *�� �ٲٰ�
		//16-27������ �ڸ��� *�� �ٲ���
		
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
