package day09;

import java.util.Scanner;

public class TheaterReservation02 {

	public static void main(String[] args) {

		
		//������ �Ͻðڽ��ϱ�? while �� ����ؼ� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�¼��� ���� �ϰڽ��ϱ�? (0 = ��  �Ǵ� 1 = �ƴϿ� )");
			int willYou = sc.nextInt();
			
			
			if(willYou == 0) {
				showReservationStatus();
			}
							
			if(willYou !=0)
				System.out.println("�����մϴ�.");		
			}//while

		}//main
	
	
	public static int[][] showReservationStatus() {
		
		Scanner sc =new Scanner(System.in);
		int[][] seatStatue = new int[7][7];
		
		//������ ������´� ������ �����ϴ�. 
		System.out.println("������ ���� ���´� �Ʒ��� �����ϴ�.");
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
		
		System.out.println("�� ���� �¼��� �����ϰڽ��ϱ�?");
		int howMany = sc.nextInt();
		//����, ��ĳ�ʸ� �����ؾ��ϳ� �ѹ��� �� �� �� ����?
		//47 �̷��� ���� ���� ���� ��Ÿ�� �� �� ����? i j�� ���ϴ� ���� �ȵɰ� ������.. .��..
		for(int k = 1; k <= howMany; k++) {
			System.out.println( "[ " + k + "��° �ڸ����� ]");
			System.out.println("�ప �Է�: ");
			int m = sc.nextInt();
			System.out.println("���� �Է�: ");
			int n = sc.nextInt();
			
			if(m < 8 && n < 8 ) {
				seatStatue[m-1][n-1] = 1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
			else
				System.out.println("�� �� �Է��Ͽ����ϴ�.");
		}//for
		System.out.println("������ ���� ���´� �Ʒ��� �����ϴ�.");
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
	
		System.out.println("�� ���� �¼��� �����ϰڽ��ϱ�?");
		int howMany = sc.nextInt();
		int k = howMany;
		//����, ��ĳ�ʸ� �����ؾ��ϳ� �ѹ��� �� �� �� ����?
		//47 �̷��� ���� ���� ���� ��Ÿ�� �� �� ����? i j�� ���ϴ� ���� �ȵɰ� ������.. .��..
		for(k = 1; k < 47; k++) {
			System.out.println( "[ " + k + "��° �ڸ����� ]");
			System.out.println("�ప �Է�: ");
			int m = sc.nextInt();
			System.out.println("���� �Է�: ");
			int n = sc.nextInt();
			m=0;
			n=0;
			
			if((m-1) < 7 && (n-1) < 7 ) {
			seat2[m-1][n-1] = 1;
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}
			return true;
			//�� �ڲ� ������ Ʋ�ȴٰ� ������
			else
				System.out.println("�� �� �Է��Ͽ����ϴ�.");
			return false;
		}//for
		//�ٲﰪ�� ���� �ް� ����� �˷���(���� �������� �Լ��� �ҷ��� �ϴ°���)
		
	
	}
	
	// 1�̸� �Լ��� �� ���� �����ְ� 0�̸� ����   �̶� ���� Ÿ���� �Լ��� �޾ƿ;߰ڴ�.
	
	
			//�׸��� ��� ������ ���� ������ ��ĳ�ʷ� �޾Ƽ� ������ �� �� ���������� �� 
			//������ ���� ���̶� �� �� �ް� �װŸ� �ٲ��� 
			//���� �Ǿ����ϴ�. */


