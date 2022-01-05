package day12.shipping;

public abstract class Vechicle {
	//��¥ ��¥ �ʹ��ʹ� ������ ū���̴�.. �ʹ� �ʹ� �ʹ� ������ �ФФ� 
	//��� ������ �̵��Ÿ��� ���
	public abstract double calcTripDistance();
	
	//��� ������ ���� ȿ���� ���
	public abstract double calcFuelEfficiency();
	
	//��� ������ �̸�
	public abstract String getName();
	
	//��� ������ ���� �Ҹ� ��� (template method pattern)
	//�����Ǹ� �ϸ� �ȵ� �׷��� ���̳η� �����Ǹ� �ϴ� ������ 
	public final double calcFuelNeeds() {
		double fuel = calcTripDistance()/calcFuelEfficiency();
		return fuel;
	}
}
