package day11.polymorphism;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	//생성자 만들었고
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
		return year + "년" + month + "월" + day + "일";
	}
	
	public boolean equals(Object o) {
		boolean result = false;
		
		//널이 아니고 마이데이트 타입일 때 비교를 하자는거지 
		if(o != null && o instanceof MyDate) {
			MyDate d = (MyDate)o;
			if(this.year == d.year && this.month ==d.month && this.day ==d.day)
				result = true;
		}
		return result;
	}
	
	//지금까지 우리는 값만 출력을 했던것이지 배열같은 것도 우리는 배열을 출력하지 않고 그 값을 출력했던 것이지 앞으로 우리가 만든 함수를 출력할 일이 있다면 오브젝트에 모두 있는 것이 아니니가 우리는 오버라이딩을 해줘야 하는 것이야 .
	
	
}
