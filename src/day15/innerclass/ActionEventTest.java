package day15.innerclass;

import java.util.Scanner;

public class ActionEventTest {

	public static void main(String[] args) {
			//임의의 액션을 임시로 만들게 영이 들어오는게 액션이야
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			new ActionEventTest().new ActionEventHandler().actionPerformed();
			
		}
	}
	
	//Action Event를 처리하는, 이벤트 처리 클래스 
	//이름이 있는 명시적 클래스이지 
	private class ActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed() {
			System.out.println("액션 이벤트 발생");
		}
		
	}

	public void actionPerformed() {
		// TODO Auto-generated method stub
		
	}
}
