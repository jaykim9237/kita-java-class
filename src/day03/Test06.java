package day03;

import java.util.Scanner;

public class Test06  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격을 입력하세요 : ");
		int price = sc.nextInt();

		int p50000 = price/50000;

		int p10000 = (price - (p50000*50000))/10000;

		int p5000 = ((price - (p50000*50000)-(p10000*10000)))/5000;

		int p1000 = ((price- (p50000*50000) - (p10000*10000) -()); ///-노가다 하다가 망했어
	}
}
