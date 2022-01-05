package day09;

import java.util.Scanner;

public class TheaterReservation01Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int seats [] = new int[10];
		while(true) {
			System.out.println("좌석을 예약 하겠습니따? (0 또는 1)");
			int isContinue = sc.nextInt();
			if(isContinue == 0) break;
			
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("----------------------");
			System.out.println(" 1 2 3 4 5 6 7 8 9 10");
			System.out.println("----------------------");
			
			for(int i : seats) {
				System.out.printf("%2d", i);//정수의 자리수
			}
			System.out.println();
			System.out.println("몇 번째 좌석을 예약하시겠습니까?");
			int seatNo = sc.nextInt();
			
			if(seats[seatNo-1] != 0) {
				System.out.printf("%d 번째 자리는 예약할 수 없습니다.", seatNo);
				
			} else {
				seats[seatNo - 1] = 1;
				System.out.println("예약이 완료되었습니다.");
			}//else
			
		}//while
	}

}
