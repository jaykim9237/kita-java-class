package day07.array;

import java.util.Arrays;

class msArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*20); //math.random�� 0~1 ������ �����̴�. 
			int tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;
			
			System.out.println(Arrays.toString(arr));
			
		}//main
	}

}
