package day08Test;

import java.lang.reflect.Array;

public class Test05Answer3 {

	public static void main(String[] args) {
		
		int array [] = new int[6];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++)/*여기부분이 이전에 만들어진거야 */ {
				if(array[i] ==array[j]) {
					i--;
					break;
				
				}//if
				
			}//for2
		}//for1
		
		for(int i:array) {
			System.out.println(i +" ");
		}
	}

}
