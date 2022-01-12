package day15.cllecton;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class msHashSet {

	public static void main(String[] args) {
		int[] arr = new int[45];
		HashSet<Integer> set = new HashSet<Integer>();
		
		//배열에 45까지 채우기
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = i + 1;
			set.add(arr[i]); //45개의 방에 값을 주고 그걸 set에 넣는다. 
		}
		System.out.println(set);
		//hash에 저장된 요소들을 출력한다.
		
		
	}//main
}//class
  