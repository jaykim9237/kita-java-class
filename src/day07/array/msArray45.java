package day07.array;

import java.util.Arrays;

public class msArray45 {
	public static void main(String[] args) {
		//index : 0~45 -1, 0~44
		int [] luck = new int[45];
		
		//배열의 각 요소에 1~45 값 저장
		for (int i = 0; i < luck.length; i++)
			luck[i] = i+1;
			
			int temp = 0;
			int temp2 = 0;
			
			//배열의 i번째 요소와 임의의 요소에 저장된 값을 거로 바꿔서 값을 저장한다.
			//0번째 부터 5번째 요소까지 모두 6개를 바꾼다.
			
			for (int j = 0; j < 6; j++) {
				temp2 = (int)(Math.random()*45);
				temp = luck[j];
				luck[j] = luck[temp2];
				luck[temp2] = temp;
				System.out.println(Arrays.toString(luck));
			}//for
			
			for (int k = 0; k < 6 ; k++) {
				System.out.printf("luck[%d] = %d%n", k, luck[k]);
			}
	}//main
}//class
