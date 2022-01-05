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
	//입금 
	//입금 후 현재 잔고를 반환한다. 
	public int deposit(int amount) {
	 balance += amount;
	 return balance;
	}
	
	//츨금
	//출금 금액을 매개변수로 받아 출금 처리를 한다. 
	//출금 후 현재 잔고를 반환한다. 
	//단, 출금 금액이 현재 잔고보다 많으면 InvalidTransactionException을 발생시킨다. 예외는 회피시칸다.
	//교수님은 매개변수를 amount로 하셨어
	public int withdraw(int cash) throws InvalidTransactionException{
		if(balance >= cash){
		balance -= cash;
		} else throw new InvalidTransactionException("잔고가 부족합니다.");
		
		return balance;
	}
	
	/*이체
	 * 이체금액과 이체를 받을 상대방 계좌 정보를 매개변수로 받아서 처리한다.
	 * 이체 처리 후 현재 잔고를 반환한다.
	 * 단, 이체금액이  현재 잔고보다 많으면 InvalidTransactionException을 발생시킨다. 예외는 회피시칸다*/
	//처음에 받는 사람의 객체를 Customer의 타겟으로 잡았는데 그게 아니야 ㅑㅏㅏㅏ 그냥 계좌 정보로 받고 나중에 줄러올 것이야
	//Account타입의 타겟이었어
	public int transfer(int amount, Account target) throws InvalidTransactionException {
		if (amount > balance) {
			throw new InvalidTransactionException("잔고가 부족합니다.");
		} else {
			balance -= amount;
			target.deposit(amount);//어카운트 타입 이 클래스 였구나..
			
		}
			
		return balance;
	}
}
