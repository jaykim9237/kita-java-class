package day10;

import java.util.Scanner;


public class CalendarTest02 {
	
	String day_of_week [] = {"��", "��", "ȭ", "��", "��", "��", "��,"};

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int year = sc.nextInt();
		System.out.println("���� �Է��ϼ���: ");
		int month = sc.nextInt();
		
		CalendarInfo info = new CalendarInfo(year, month);
		int dateBoard [][] = info.initializeDate();
				
		System.out.printf("------%d�� %d�� --------%n", year, month);
		System.out.println(" ��   ��   ȭ   ��   ��   ��   �� ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (dateBoard[i][j] == 0 ) {
					System.out.print(" 00");
				}//if
				else {
					System.out.printf("%2d ", dateBoard[i][j]);
				}//else
				
			}//in
			System.out.println();
		}//out
		
		
		/*
		
		Calendar c = Calendar.getInstance();
		
		int dateBoard[][] = info.initializeDate();
		
		for (int i = 0; i < dateBoard.length; i++) {
			
			for (int j = 0; j < dateBoard[i].length; j++) {
				System.out.print("0");
			}//in for
			System.out.println();
		}//OUT FOR
		
		*/
		
	}//main

}//class
