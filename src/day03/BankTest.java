package day03;

import java.util.Scanner;

public class BankTest 
{
	public static void main(String[] args) 
	{
		Account a = new Account(); //��ü�� �����Ѱž� ... �츮�� ���� Ŭ������ ����ϱ� ���ؼ� 
		System.out.println(a.accNo+"������ �ʱ� �ܰ��" +a.balance+"�� �Դϴ�.");

		Scanner sc = new Scanner(System.in);
		System.out.print("�󸶸� �Ա� �ϰڽ��ϱ�?");
		int amount = sc.nextInt(); //������ ���� �޶� �츮�� ���� ������ �ؽ�Ʈ��Ʈ�� ���ž� ���� ��� �����̸� �����̾�
		int updated_balance = a.deposit(amount); /*a�� ȣ���� �Ұž� �������� ȣ���� �� �ΰ���*/
		System.out.println(a.accNo+"������ ���ŵ� �ܰ��" +a.balance+"�� �Դϴ�.");

		
		System.out.print("������ �������� �̸��� �Է��ϼ���." );
		String name = sc.next();
		a.owner = name;
		System.out.println(a.accNo+"������ ������ �̸���" +a.owner+ "�� ����Ǿ����ϴ�.");

	}
}
