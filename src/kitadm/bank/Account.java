package kitadm.bank;

public class Account {
	
	//������� (�ʵ�)
	private String accNo;
	private String owner;
	private int balance;
	
	//������-��������� �ʱ�ȭ
	public Account(String accNo, String ownerpp, int balance) {
		this.accNo = accNo;
		owner = ownerpp;
		this.balance = balance;
		
		
	}
	//������
	public Account(String accNo, String owner) {
		this.accNo = accNo;
		this.owner = owner;
		
		/*(this(accNo, owner,0);�� ���⿡ ������ ���� �մ� ���� ��Ʈ����Ʈ����Ʈ�� �Ǿ� �ִ� �ٸ� �����ڸ� ȣ���϶�� �ǹ� ����  --��� ? �Ű������� ���� �Ÿ�.)*/
		//�����ڴ� ������ �Ű������� ������ �ִ� ���� ������ ������ �ν��� �� ���࿡ (���¹�ȣ �̸� �ܾ�) �̶� (���¹�ȣ �ּ� �ܾ�) �̸� ���� �����ڷ� �ν��� �� �׷��� �� �������� ó���� �����ڸ� ���� ���� ��ü�� �� ����� �ϴ� �ɱ�?
	}
	

	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	
	
	
	
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;  //��� read only�� ���ʹ� �ȸ��� �Ǵ� ��Ȳ�ΰ���
	}

	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

/*	public void setBalance(int balance) {
		this.balance = balance;  ��� ���� ���� �ʴ� �̻� �ܰ� ���Ҹ� ������ ���ʿ��ϰ���
	}
	*/

}//class
