package day09;

import java.util.Scanner;

public class TheaterReservation01Again {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
	
		
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
	
	public static void reserSystem() {
		
		int[] seat = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ���´� ������ �����ϴ�.");
		System.out.println("----------------------");
		System.out.println(" 1 2 3 4 5 6 7 8 9 10");
		System.out.println("----------------------");
		
		for(int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i]);
		}
	
		System.out.println();
		System.out.println();
		
		System.out.println("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
		//�迭�Է� �޾Ƽ� 		
		int want = sc.nextInt();
		//�迭�� ������ ��� �̹� 1�̸� �ȵȴٰ� �ϰ� 0�̸� �����ϰ� 
		
		int temp = 
		
		
	}

}//class
