package day10;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		String day_of_week [] = {"��", "��", "ȭ", "��", "��", "��", "��,"};
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR)+"��");
		System.out.println(c.get(Calendar.MONTH)+"��");
		System.out.println(c.get(Calendar.DATE)+"��");
		System.out.println(day_of_week[c.get(Calendar.DAY_OF_WEEK)] + "����");
	
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, 2);//���� 0���� �����̶� 2�̸� 3���̾�
		c.set(Calendar.DATE, 1);
	}
}

