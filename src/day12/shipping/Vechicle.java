package day12.shipping;

public abstract class Vechicle {
	//진짜 진짜 너무너무 졸리다 큰일이다.. 너무 너무 너무 졸리다 ㅠㅠㅠ 
	//운송 수단의 이동거리를 계산
	public abstract double calcTripDistance();
	
	//운송 수잔의 연료 효율을 계산
	public abstract double calcFuelEfficiency();
	
	//운송 수단의 이름
	public abstract String getName();
	
	//운송 수단의 연료 소모량 계산 (template method pattern)
	//재정의를 하면 안돼 그래서 파이널로 재정의를 하는 것이지 
	public final double calcFuelNeeds() {
		double fuel = calcTripDistance()/calcFuelEfficiency();
		return fuel;
	}
}
