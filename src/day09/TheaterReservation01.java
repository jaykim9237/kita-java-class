package day09;

import java.util.Scanner;

public class TheaterReservation01 {
	
//	int[] seat = new int[10];
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int[] seat2 = new int[10];
		seat2 = reserSystem();
		
		System.out.print("좌석을 예약하겠습니까? (1 또는 0) :");
		int reservation = sc.nextInt();
		switch(reservation) {
		
		case 0 :
			System.out.println("종료합니다.");		
		break;
		
		
		case 1 /*실행*/:reserSystem();
		break;
		}//switch
			
		
	}//main
	
	public static int[] reserSystem() {
		
		int[] seat = new int[10];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재의 예약 상태는 다음과 같습니다.");
		System.out.println("----------------------");
		System.out.println(" 1 2 3 4 5 6 7 8 9 10");
		System.out.println("----------------------");
		
		for(int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i]);
		}
		/*for(int seat : seat) {
			System.out.println(seat);}*/
		
		//배열 출력되게
		System.out.println();
		System.out.println();
		
		System.out.println("몇 번째 좌석을 예약하시겠습니까?");
		//배열입력 받아서 		
		int want = sc.nextInt();
		
		return seat;
		
		//배열로 포문을 열어서 이미 1이면 안된다고 하고 0이면 가능하게 
		
	}

}//class
