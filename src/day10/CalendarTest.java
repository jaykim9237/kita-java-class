package day10;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		String day_of_week [] = {"일", "월", "화", "수", "목", "금", "토,"};
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONTH)+"월");
		System.out.println(c.get(Calendar.DATE)+"일");
		System.out.println(day_of_week[c.get(Calendar.DAY_OF_WEEK)] + "요일");
	
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, 2);//월은 0부터 시작이라서 2이면 3월이야
		c.set(Calendar.DATE, 1);
	}
}

