package day08Test;

public class Test02 {

	public static void main(String[] args) {

		String name [] = {"��1", "��2", "��3", "��4", "��5", "��6"};
		
	System.out.println("���� �迭: ");
		
	for(String a: name) {
		System.out.print(a +" ");
	}//for
	
	System.out.println();
	
	System.out.println("���� �迭: ");//i�� ������ ���� �״���� �� ���� �ֳ��ϸ� �迭�� ������ 0���ʹϱ�
	for(int i = name.length-1; i>=0; i-- ) {
		System.out.print(name[i] + " ");
		
	}
	
	}//main

}//class
