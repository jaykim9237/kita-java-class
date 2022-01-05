package day09;

import java.util.Scanner;

public class TheaterReservation02 {

	public static void main(String[] args) {

		
		//예약을 하시겠습니까? while 을 사용해서 돌려
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 예약 하겠습니까? (0 = 예  또는 1 = 아니오 )");
			int willYou = sc.nextInt();
			
			
			if(willYou == 0) {
				showReservationStatus();
			}
							
			if(willYou !=0)
				System.out.println("종료합니다.");		
			}//while

		}//main
	
	
	public static int[][] showReservationStatus() {
		
		Scanner sc =new Scanner(System.in);
		int[][] seatStatue = new int[7][7];
		
		//현재의 예약상태는 다음과 같습니다. 
		System.out.println("현재의 예약 상태는 아래와 같습니다.");
		System.out.println("---------------");
		System.out.println(" 1 2 3 4 5 6 7");
		System.out.println("---------------");
		for( int i = 0; i < 7; i++){
			System.out.print( i +"| ");
			for( int j = 0; j < 7 ; j++) {
				System.out.print(  seatStatue[i][j] + " ");			
			}//for2
			System.out.println();
		}//for1
		
		System.out.println("몇 개의 좌석을 예약하겠습니까?");
		int howMany = sc.nextInt();
		//질문, 스캐너를 각각해야하나 한번에 할 수 는 없나?
		//47 이렇게 직접 말고 수로 나타낼 수 는 없나? i j는 변하는 수라서 안될거 같은데.. .흠..
		for(int k = 1; k <= howMany; k++) {
			System.out.println( "[ " + k + "번째 자리예약 ]");
			System.out.println("행값 입력: ");
			int m = sc.nextInt();
			System.out.println("열값 입력: ");
			int n = sc.nextInt();
			
			if(m < 8 && n < 8 ) {
				seatStatue[m-1][n-1] = 1;
				System.out.println("예약이 완료되었습니다.");
				}
			else
				System.out.println("잘 못 입력하였습니다.");
		}//for
		System.out.println("현재의 예약 상태는 아래와 같습니다.");
		System.out.println("-----------------");
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println("-----------------");
		for( int i = 0; i < 7; i++){
			System.out.print( i+1 +"| ");
			for( int j = 0; j < 7 ; j++) {
				System.out.print(  seatStatue[i][j] + " ");}
			System.out.println(" ");
		}
		
		
		return seatStatue;
	}
}
	/*
	public static boolean reservationSeat() {
		Scanner sc =new Scanner(System.in);
		int[][] seat2 = new int[7][7];
		seat2 = showReservationStatus();
	
		System.out.println("몇 개의 좌석을 예약하겠습니까?");
		int howMany = sc.nextInt();
		int k = howMany;
		//질문, 스캐너를 각각해야하나 한번에 할 수 는 없나?
		//47 이렇게 직접 말고 수로 나타낼 수 는 없나? i j는 변하는 수라서 안될거 같은데.. .흠..
		for(k = 1; k < 47; k++) {
			System.out.println( "[ " + k + "번째 자리예약 ]");
			System.out.println("행값 입력: ");
			int m = sc.nextInt();
			System.out.println("열값 입력: ");
			int n = sc.nextInt();
			m=0;
			n=0;
			
			if((m-1) < 7 && (n-1) < 7 ) {
			seat2[m-1][n-1] = 1;
			System.out.println("예약이 완료되었습니다.");
			}
			return true;
			//왜 자꾸 엘스가 틀렸다고 나오지
			else
				System.out.println("잘 못 입력하였습니다.");
			return false;
		}//for
		//바뀐값을 전부 받고 결과를 알려줘(위에 포문에서 함수를 불러서 하는거지)
		
	
	}
	
	// 1이면 함수로 뺀 것을 보여주고 0이면 끝내   이때 리턴 타입을 함수로 받아와야겠다.
	
	
			//그리고 몇개의 예약을 받을 건지를 스캐너로 받아서 포문에 몇 번 돌릴건지를 해 
			//포문을 돌려 행이랑 열 값 받고 그거를 바꿔줘 
			//예약 되었습니다. */


