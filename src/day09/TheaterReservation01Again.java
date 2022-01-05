package day09;

import java.util.Scanner;

public class TheaterReservation01Again {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
	
		
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
	
	public static void reserSystem() {
		
		int[] seat = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재의 예약 상태는 다음과 같습니다.");
		System.out.println("----------------------");
		System.out.println(" 1 2 3 4 5 6 7 8 9 10");
		System.out.println("----------------------");
		
		for(int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i]);
		}
	
		System.out.println();
		System.out.println();
		
		System.out.println("몇 번째 좌석을 예약하시겠습니까?");
		//배열입력 받아서 		
		int want = sc.nextInt();
		//배열로 포문을 열어서 이미 1이면 안된다고 하고 0이면 가능하게 
		
		int temp = 
		
		
	}

}//class
