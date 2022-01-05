package day10;

import java.util.Calendar;

public class CalendarInfo {
	
	
	private int length; //Ư�� ���� ���� �� �� �� 
	private int dayOfWeek; //Ư������ 1�Ͽ� �ش��ϴ� ���� (�Ͽ��� ���� ����ϸ� 1-7�� ������ ���� ���´�.)

	private int [] monthly_date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	/*
	 * �Ű������� �Է¹��� ��� ���� ���� ������ ������� ������ ���̿��� ��ũ�� �ʱ�ȭ �ϴ� ���̴�. */
	public CalendarInfo(int year, int month) {
		length = getLastDate(year, month);
		dayOfWeek = getDayOfWeek(year, month, 1);
	}
	
	/*�Ű������� ���޹��� ��, ��, ���� ������ �ش� ��¥�� ���� ���������� ��ȯ�Ѵ�.
	 * ��ȯ���� �Ͽ��Ϻ��� ����Ͽ� 1-7�� ���� ���� �ȴ�.*/
	public int getDayOfWeek(int y, int m, int d) {
		int dayOfWeek = 0;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DATE, d);
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	
	/*�Ű������� ���� ���� ��, ���� �ش��ϴ� ��ü �� �� �� ���
	 * ��, ������ ��쿡�� 2���� ��ü �� �� �� 29�Ϸ� ��ȭ�Ѵ�.
	 * ������ ���� �ս��� ����Ʈ�� �迭�� ������ ������ �̿��Ѵ�. */
	public int getLastDate(int y, int m) {
		int lastDate = 0;
		//���������� 
		if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			monthly_date[1] = 29;
		///������ �ƴϸ� �׳� ��ȯ���ִ°���
		lastDate = monthly_date[m-1];
		
		return lastDate;
	}
	
	/* �Ѵ��� ��¥ ������ ���� �������� �迸�� ���� �ʱ�ȭ�Ѵ�.
	 * �Ͽ��Ϻ��� �����ؼ� ����Ͽ� ������ �޷� ������ �� �濡 ���¿�
	 * �ش��ϴ� ������ �ʱ�ȭ �ϸ�,��¥�� ���� �ʴ� �迭�� ���� ���� ���� ä������. */
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
