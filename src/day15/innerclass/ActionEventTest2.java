package day15.innerclass;
import java.util.Scanner;

import day15.innerclass.ActionEventTest;

public class ActionEventTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 10;
		int num = sc.nextInt();
		if(num == 0) {
			//�� ������ �������̽� ��ü�� ���� �͸�Ŭ���� �̱��� �ϰ� ���ظ� �ϴ� ���̰� 
			//�� ������ Ŭ������ ���� � �͸��� Ŭ������ �� ���� ����ϰ� �ֱ����� �� �� �ִ�. 
			new ActionEventTest() {
				@Override
				public void actionPerformed() {
					
					System.out.println("�׼� �̺�Ʈ �߻�");
				}
			}.actionPerformed();
		}
	}

}

