package day12.interfacetest;

public class CalculatorTest {

	public static void main(String[] args) {

			int num1 = 10;
			int num2 = 5;
			
			
			
			Calc calc = new completeCalalc();
			System.out.println(calc.add(num1, num2));
			System.out.println(calc.substract(num1, num2));
			System.out.println(calc.times(num1, num2));
			System.out.println(calc.divide(num1, num2));
			//calc.showinfo();
			calc.description();
			
			
	}

}


/*
 * 
 * @Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		
		else
			return Calc.ERROR;
	//������ ����̱� ������ Ŭ������ �ҷ��� ������ �� �� �ִ°���
	}

	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}
}*/
 