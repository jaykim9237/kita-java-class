package day03;

public class Account 
{
	String accNo = "11-11"; //���¹�ȣ
	int balance = 0; //�ܰ�
	String owner; //���� ������ �̸�

	public int deposit(int amount)
	{
		balance = balance + amount;
		return balance; 
	}
}
