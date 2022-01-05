package day03;

import java.util.Scanner;

public class Test06Answer  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price, m50t, m10t, m5t, m1t, rest; //동일한 타입은 나열할 수 있어 
		System.out.print("상품가격을 입력하세요 : ");
		price = sc.nextInt();

		rest = price;
		m50t = rest/50000;
		rest = rest % 50000;
		m10t = rest / 10000;
		rest = rest % 10000;
		m5t = rest / 5000;
		rest = rest % 5000;
		m1t = rest / 1000;
		rest = rest %1000;

		System.out.printf("%d원은 5만원권 %d장, 1만원권 %d장, 5천원권 %d장, 1천원권 %d장을 지불하고 %d원이 남았습니다. %n", price, m50t, m10t, m5t, m1t, rest);


		

	}
}