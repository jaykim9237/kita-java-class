package day09;

import java.util.Scanner;

public class TheaterReservation01 {
	
//	int[] seat = new int[10];
	

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int[] seat2 = new int[10];
		seat2 = reserSystem();
		
		System.out.print("�¼��� �����ϰڽ��ϱ�? (1 �Ǵ� 0) :");
		int reservation = sc.nextInt();
		switch(reservation) {
		
		case 0 :
			System.out.println("�����մϴ�.");		
		break;
		
		
		case 1 /*����*/:reserSystem();
		break;
		}//switch
			
		
	}//main
	
	public static int[] reserSystem() {
		
		int[] seat = new int[10];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ���´� ������ �����ϴ�.");
		System.out.println("----------------------");
		System.out.println(" 1 2 3 4 5 6 7 8 9 10");
		System.out.println("----------------------");
		
		for(int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i]);
		}
		/*for(int seat : seat) {
			System.out.println(seat);}*/
		
		//�迭 ��µǰ�
		System.out.println();
		System.out.println();
		
		System.out.println("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
		//�迭�Է� �޾Ƽ� 		
		int want = sc.nextInt();
		
		return seat;
		
		//�迭�� ������ ��� �̹� 1�̸� �ȵȴٰ� �ϰ� 0�̸� �����ϰ� 
		
	}

}//class
