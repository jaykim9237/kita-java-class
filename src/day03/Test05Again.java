package day03;

import java.util.Scanner;

public class Test05Again 
{
	public static void main(String[] args) 
	{
		long sec;
		long min;
		long hr;
		long rest;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("発至拝 段研 舛呪稽 脊径背爽室推 : ");
		sec = sc.nextLong();
		
		hr = sec/3600;
		rest = sec%3600;
		min = rest/*蟹袴走*//60;
		rest= rest%60;
		

		System.out.printf("%d段澗 %d獣娃 %d歳 %d段 脊艦陥. %n", sec, hr, min, rest);

		//格巷 姶維旋戚醤 ばばばばば 蟹袴走研 廃厩嬢稽 源馬檎辞 越稽 床艦猿 設鞠醸嬢 ばば

	}
}
