package day09;

import java.util.Scanner;

public class TheaterReservation01Answer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int seats [] = new int[10];
		while(true) {
			System.out.println("�¼��� ���� �ϰڽ��ϵ�? (0 �Ǵ� 1)");
			int isContinue = sc.nextInt();
			if(isContinue == 0) break;
			
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("----------------------");
			System.out.println(" 1 2 3 4 5 6 7 8 9 10");
			System.out.println("----------------------");
			
			for(int i : seats) {
				System.out.printf("%2d", i);//������ �ڸ���
			}
			System.out.println();
			System.out.println("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
			int seatNo = sc.nextInt();
			
			if(seats[seatNo-1] != 0) {
				System.out.printf("%d ��° �ڸ��� ������ �� �����ϴ�.", seatNo);
				
			} else {
				seats[seatNo - 1] = 1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}//else
			
		}//while
	}

}
