package day15.exception;

public class ArrayExceptionHandlling {

	public static void main(String[] args) {
		int [] arr = new int [5];
		
		try {
			for(int i = 0; i <= 5;  i++) {
				arr [i] = i;
				//���� 5�� �ε� 6�� ���°��� ������ ��������
				
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("�����ä� ó�� �κ�");
		}
		System.out.println("���α׷� ��ȿ");
	}

}
