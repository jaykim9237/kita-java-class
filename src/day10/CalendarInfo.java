package day10;

import java.util.Calendar;

public class CalendarInfo {
	
	
	private int length; //특정 월이 갖는 총 일 수 
	private int dayOfWeek; //특정월의 1일에 해당하는 요일 (일요일 부터 계산하며 1-7의 범위의 값을 갖는다.)

	private int [] monthly_date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	/*
	 * 매개변수로 입력받은 년과 월의 값을 가지고 멤버변수 랭스와 데이오브 위크를 초기화 하는 값이다. */
	public CalendarInfo(int year, int month) {
		length = getLastDate(year, month);
		dayOfWeek = getDayOfWeek(year, month, 1);
	}
	
	/*매개변수로 전달받은 년, 월, 일의 값으로 해당 날짜가 무슨 요일인지를 반환한다.
	 * 반환값은 일요일부터 계산하여 1-7의 정수 값이 된다.*/
	public int getDayOfWeek(int y, int m, int d) {
		int dayOfWeek = 0;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DATE, d);
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	
	/*매개변수로 전달 받은 연, 월에 해당하는 전체 일 수 를 계산
	 * 단, 윤년인 경우에는 2월의 전체 일 수 를 29일로 젼화한다.
	 * 나버지 월은 먼스리 대이트의 배열에 정해진 갑값을 이용한다. */
	public int getLastDate(int y, int m) {
		int lastDate = 0;
		//윤년인지를 
		if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			monthly_date[1] = 29;
		///윤년이 아니면 그냥 반환해주는거지
		lastDate = monthly_date[m-1];
		
		return lastDate;
	}
	
	/* 한달의 날짜 정보를 담은 데쉬보드 배옇의 값을 초기화한다.
	 * 일요일부터 시작해서 토요일에 끝나는 달력 형태의 각 방에 형태에
	 * 해당하는 값으로 초기화 하며,날짜를 갖지 않는 배열의 방의 값은 으로 채워진다. */
	public int[][] initializeDate(){
			int dateBoard[][] =new int [6][7];
			int datecnt = 2 - dayOfWeek;
			
			for (int i = 0; i < dateBoard.length; i++) {
				for (int j = 0; j < dateBoard[i].length; j++) {
					if(datecnt >= 1 && datecnt <= length)
						dateBoard[i][j] = datecnt;
					datecnt++;
				}//inner
			}//outer
			return dateBoard;
			
	}
	
}//class
