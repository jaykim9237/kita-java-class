package day08Test;

public class Tset02Answer {

	public static void main(String[] args) {
		String array [] = {"�극��", "��ũ", "����", "�Ҽ���", "ġ��"};
		System.out.println("���� �迭: ");
		for (String s : array) {
			System.out.print(s +" ");
		}//sor
		
		System.out.println();
		
		//�̵��� ���� �׻� �װź��� �ϳ� �۴ٴ� ������ �ؾ���
		for (int i = 4; i >=0; i--) {
			System.out.print(array[i] + " ");
		}
	}//main

}//class
