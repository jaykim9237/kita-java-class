package day15.cllecton;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class msHashSet {

	public static void main(String[] args) {
		int[] arr = new int[45];
		HashSet<Integer> set = new HashSet<Integer>();
		
		//�迭�� 45���� ä���
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = i + 1;
			set.add(arr[i]); //45���� �濡 ���� �ְ� �װ� set�� �ִ´�. 
		}
		System.out.println(set);
		//hash�� ����� ��ҵ��� ����Ѵ�.
		
		
	}//main
}//class
  