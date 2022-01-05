package day03;

public class Account 
{
	String accNo = "11-11"; //게좌번호
	int balance = 0; //잔고
	String owner; //계좌 소유주 이름

	public int deposit(int amount)
	{
		balance = balance + amount;
		return balance; 
	}
}
