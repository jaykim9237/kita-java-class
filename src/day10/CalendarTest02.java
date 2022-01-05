package day10;

import java.util.Scanner;


public class CalendarTest02 {
	
	String day_of_week [] = {"일", "월", "화", "수", "목", "금", "토,"};

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("연도를 입력하세요: ");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		
		CalendarInfo info = new CalendarInfo(year, month);
		int dateBoard [][] = info.initializeDate();
				
		System.out.printf("------%d년 %d월 --------%n", year, month);
		System.out.println(" 일   월   화   수   목   금   토 ");
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
