package day07.array;

import java.util.Arrays;

public class msArray45 {
	public static void main(String[] args) {
		//index : 0~45 -1, 0~44
		int [] luck = new int[45];
		
		//�迭�� �� ��ҿ� 1~45 �� ����
		for (int i = 0; i < luck.length; i++)
			luck[i] = i+1;
			
			int temp = 0;
			int temp2 = 0;
			
			//�迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� �ŷ� �ٲ㼭 ���� �����Ѵ�.
			//0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
			
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
