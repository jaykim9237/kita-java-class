package day15.innerclass;
import java.util.Scanner;

import day15.innerclass.ActionEventTest;

public class ActionEventTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 10;
		int num = sc.nextInt();
		if(num == 0) {
			//뉴 다음에 인터페이스 객체가 오면 익명클래스 이구나 하고 이해를 하는 것이고 
			//뉴 다음에 클래스가 오면 어떤 익면의 클래스가 이 것을 상속하고 있구나를 알 수 있다. 
			new ActionEventTest() {
				@Override
				public void actionPerformed() {
					
					System.out.println("액션 이벤트 발생");
				}
			}.actionPerformed();
		}
	}

}

