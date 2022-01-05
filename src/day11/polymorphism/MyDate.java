package day11.polymorphism;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	//������ �������
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return year + "��" + month + "��" + day + "��";
	}
	
	public boolean equals(Object o) {
		boolean result = false;
		
		//���� �ƴϰ� ���̵���Ʈ Ÿ���� �� �񱳸� ���ڴ°��� 
		if(o != null && o instanceof MyDate) {
			MyDate d = (MyDate)o;
			if(this.year == d.year && this.month ==d.month && this.day ==d.day)
				result = true;
		}
		return result;
	}
	
	//���ݱ��� �츮�� ���� ����� �ߴ������� �迭���� �͵� �츮�� �迭�� ������� �ʰ� �� ���� ����ߴ� ������ ������ �츮�� ���� �Լ��� ����� ���� �ִٸ� ������Ʈ�� ��� �ִ� ���� �ƴϴϰ� �츮�� �������̵��� ����� �ϴ� ���̾� .
	
	
}
