package day09;

import java.util.Scanner;

public class TheaterReservation02Answer {
	
	//7�� 7�� ���� �¼�, ������ �Ǹ� 1, �� �� �¼���  0
	private int seats[][] = new int[7][7];
	
	//������ �¼� ���� ��Ȳ�� �����ش�.
	public void showReservationStatue() {
		System.out.println("������ ���� ���´� �Ʒ��� �����ϴ�.");
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
	
	//�Ű������� ���� �� ��, ���� �ش��ϴ� �¼��� �����Ѵ� ������ �����ϸ� Ʈ�� �����ϸ� ������ ��ȯ�Ѵ�.
	public boolean reservationSeats(int row, int col) {
		boolean result = false;//����Ʈ ���� ���з� �ϴ� �δ°���
		if(seats[row-1][col-1] != 1) {
			seats[row-1][col-1] = 1;
			result = true;
		}//�����ϸ� Ʈ���̰� �����ϸ� �׳� ���� ���ϰ� ������ ��������
		return result;
	}//rreserSeat
	
	public static void main(String[] args) {
		
		//���� �������̼��� ����ƽ�� �ƴϴϱ� ��ü�� �ҷ��;��ϴ°��� ���࿡ �¼�ǥ�� ���� ������
		TheaterReservation02Answer tr =new TheaterReservation02Answer();
		//tr.showReservationStatue() ��ü�� ���� �ҷ����� ������ 
		Scanner sc = new  Scanner(System.in);
			while(true) {
				System.out.println("�¼��� ���� �ϰڽ��ϱ�? (y or n)");
				String choice =sc.next();
				//������
				if(choice.equals("n")) break;
				
				tr.showReservationStatue();
				System.out.println();
				System.out.println("�� ���� �¼��� �����ϰڽ��ϱ�?");
				int howMany = sc.nextInt();
				 for(int i=0; i<howMany; i++) {
					 System.out.printf( "[ %d��° �ڸ����� ]%n", i+1);
					 //sysf�� ����Ϸ��� �������
						System.out.println("�ప �Է�: ");
						int row = sc.nextInt();
						System.out.println("���� �Է�: ");
						int col = sc.nextInt();
						//�޼��� ��ü�� �� ������ �������� ���̴ϱ� ���ǽĿ� ����� �� �ִ°���
						if(tr.reservationSeats(row, col)) {
							System.out.println("������ �Ǿ����ϴ�.");
						}else {
							System.out.println("�ش��ڸ��� �̹� ������ �Ǿ����ϴ�.");
							i--;  //�� @!@!!�̰� ���� �߿��ѵ� �����ϰ� �־���!!! ��Ƽ���� �׳� �Ѿ�°��ݾ� �װ� �ƴ϶� �������� ���ư����ϴ°���
						}
					 
				 }//for
			}//while
		//if(true){  #$#%##$ } if���� ������ ���̸� ������ �ϴ°���� ���׷��ϱ� �޼����� ���� ���̸� ������ �Ұž� �����̸� ������ ���� �ʴ°���!! �׷��� ������ �����°ž�!!!!!��~~~���صƾ�~~!!
		
		
	}//main
	

}//class
