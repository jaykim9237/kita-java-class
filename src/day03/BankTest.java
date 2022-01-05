package day03;

import java.util.Scanner;

public class BankTest 
{
	public static void main(String[] args) 
	{
		Account a = new Account(); //객체를 생성한거야 ... 우리가 만든 클래스를 사용하기 위해서 
		System.out.println(a.accNo+"계좌의 초기 잔고는" +a.balance+"원 입니다.");

		Scanner sc = new Scanner(System.in);
		System.out.print("얼마를 입금 하겠습니까?");
		int amount = sc.nextInt(); //유형에 따라 달라 우리는 지금 정수라서 넥스트인트를 쓴거야 예를 들어 스팅이면 라인이야
		int updated_balance = a.deposit(amount); /*a가 호출을 할거야 디파짓을 호출할 거 인거지*/
		System.out.println(a.accNo+"계좌의 갱신된 잔고는" +a.balance+"원 입니다.");

		
		System.out.print("계좌의 소유주의 이름을 입력하세요." );
		String name = sc.next();
		a.owner = name;
		System.out.println(a.accNo+"계좌의 고유주 이름이" +a.owner+ "로 변경되었습니다.");

	}
}
