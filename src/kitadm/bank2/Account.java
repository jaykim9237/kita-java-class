package kitadm.bank2;

import java.io.Serializable;

public class Account implements Serializable{
	private String accNo;
	private Customer owner;
	private int balance;
	
	public Account(String assNo, Customer owner, int balance) {
		super();
		this.accNo = assNo;
		this.owner = owner;
		this.balance = balance;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public String getAssNo() {
		return accNo;
	}

	public int getBalance() {
		return balance;
	}
	//�Ա� 
	//�Ա� �� ���� �ܰ� ��ȯ�Ѵ�. 
	public int deposit(int amount) {
	 balance += amount;
	 return balance;
	}
	
	//����
	//��� �ݾ��� �Ű������� �޾� ��� ó���� �Ѵ�. 
	//��� �� ���� �ܰ� ��ȯ�Ѵ�. 
	//��, ��� �ݾ��� ���� �ܰ��� ������ InvalidTransactionException�� �߻���Ų��. ���ܴ� ȸ�ǽ�ĭ��.
	//�������� �Ű������� amount�� �ϼ̾�
	public int withdraw(int cash) throws InvalidTransactionException{
		if(balance >= cash){
		balance -= cash;
		} else throw new InvalidTransactionException("�ܰ� �����մϴ�.");
		
		return balance;
	}
	
	/*��ü
	 * ��ü�ݾװ� ��ü�� ���� ���� ���� ������ �Ű������� �޾Ƽ� ó���Ѵ�.
	 * ��ü ó�� �� ���� �ܰ� ��ȯ�Ѵ�.
	 * ��, ��ü�ݾ���  ���� �ܰ��� ������ InvalidTransactionException�� �߻���Ų��. ���ܴ� ȸ�ǽ�ĭ��*/
	//ó���� �޴� ����� ��ü�� Customer�� Ÿ������ ��Ҵµ� �װ� �ƴϾ� �������� �׳� ���� ������ �ް� ���߿� �ٷ��� ���̾�
	//AccountŸ���� Ÿ���̾���
	public int transfer(int amount, Account target) throws InvalidTransactionException {
		if (amount > balance) {
			throw new InvalidTransactionException("�ܰ� �����մϴ�.");
		} else {
			balance -= amount;
			target.deposit(amount);//��ī��Ʈ Ÿ�� �� Ŭ���� ������..
			
		}
			
		return balance;
	}
}
