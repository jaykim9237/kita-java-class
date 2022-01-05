package day09;

import java.util.Scanner;

public class TheaterReservation02Answer {
	
	//7행 7열 극장 좌석, 예약이 되면 1, 안 된 좌석은  0
	private int seats[][] = new int[7][7];
	
	//극장의 좌석 예약 현황을 보여준다.
	public void showReservationStatue() {
		System.out.println("현재의 예약 상태는 아래와 같습니다.");
		System.out.println("-----------------");
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println("-----------------");
		for(int i=0; i<seats.length; i++) {
			System.out.printf("%d|", i+1);
			for(int j = 0; j<seats[i].length; j++) {
				System.out.printf("%2d", seats[i][j]);
			}//innner for
			System.out.println("");
		}//outfor
		
	}//showReser
	
	//매개변수를 전달 된 행, 열에 해당하는 좌석을 예약한다 예약을 성공하면 트루 실패하면 폴스를 반환한다.
	public boolean reservationSeats(int row, int col) {
		boolean result = false;//디폴트 값을 실패로 일단 두는거지
		if(seats[row-1][col-1] != 1) {
			seats[row-1][col-1] = 1;
			result = true;
		}//성공하면 트루이고 실패하면 그냥 실행 안하고 폴스로 나오겠지
		return result;
	}//rreserSeat
	
	public static void main(String[] args) {
		
		//위에 레저베이션이 스테틱이 아니니까 객체로 불러와야하는거지 만약에 좌석표를 보고 싶으면
		TheaterReservation02Answer tr =new TheaterReservation02Answer();
		//tr.showReservationStatue() 객체를 만약 불러오고 싶으면 
		Scanner sc = new  Scanner(System.in);
			while(true) {
				System.out.println("좌석을 예약 하겠습니까? (y or n)");
				String choice =sc.next();
				//이퀄스
				if(choice.equals("n")) break;
				
				tr.showReservationStatue();
				System.out.println();
				System.out.println("몇 개의 좌석을 예약하겠습니까?");
				int howMany = sc.nextInt();
				 for(int i=0; i<howMany; i++) {
					 System.out.printf( "[ %d번째 자리예약 ]%n", i+1);
					 //sysf를 사용하려고 노력하자
						System.out.println("행값 입력: ");
						int row = sc.nextInt();
						System.out.println("열값 입력: ");
						int col = sc.nextInt();
						//메서드 자체가 참 거짓을 내보내는 값이니까 조건식에 사용할 수 있는거지
						if(tr.reservationSeats(row, col)) {
							System.out.println("예약이 되었습니다.");
						}else {
							System.out.println("해당자리는 이미 예약이 되었습니다.");
							i--;  //헉 @!@!!이거 완전 중요한데 간과하고 있었움!!! 컨티뉴는 그냥 넘어가는거잖아 그게 아니라 이전으로 돌아가야하는거지
						}
					 
				 }//for
			}//while
		//if(true){  #$#%##$ } if문은 조건이 참이면 진행을 하는거쟎아 ㄱ그러니까 메서드의 값이 참이면 진행을 할거야 거짓이면 진행을 하지 않는거지!! 그래서 엘스로 빠지는거야!!!!!오~~~이해됐어~~!!
		
		
	}//main
	

}//class
