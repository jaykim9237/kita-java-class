package day15.innerclass;

import java.util.Scanner;

public class ActionEventTest {

	public static void main(String[] args) {
			//������ �׼��� �ӽ÷� ����� ���� �����°� �׼��̾�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			new ActionEventTest().new ActionEventHandler().actionPerformed();
			
		}
	}
	
	//Action Event�� ó���ϴ�, �̺�Ʈ ó�� Ŭ���� 
	//�̸��� �ִ� ����� Ŭ�������� 
	private class ActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed() {
			System.out.println("�׼� �̺�Ʈ �߻�");
		}
		
	}

	public void actionPerformed() {
		// TODO Auto-generated method stub
		
	}
}
