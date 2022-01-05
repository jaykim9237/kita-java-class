package kitadm.bank;

public class Account {
	
	//멤버변수 (필드)
	private String accNo;
	private String owner;
	private int balance;
	
	//생성자-멤버변수를 초기화
	public Account(String accNo, String ownerpp, int balance) {
		this.accNo = accNo;
		owner = ownerpp;
		this.balance = balance;
		
		
	}
	//생성자
	public Account(String accNo, String owner) {
		this.accNo = accNo;
		this.owner = owner;
		
		/*(this(accNo, owner,0);을 여기에 적으면 위에 잇는 같은 스트링스트링인트로 되어 있는 다른 생성자를 호출하라는 의미 이지  --어떻게 ? 매개변수가 같은 거를.)*/
		//생성자는 동일한 매개변수를 가지고 있는 것을 동일항 것으로 인식을 해 만약에 (계좌번호 이름 잔액) 이랑 (계좌번호 주소 잔액) 이면 같은 생성자로 인식을 해 그래서 내 생각에는 처음에 생성자를 만들 때는 전체를 다 해줘야 하는 걸까?
	}
	

	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	
	
	
	
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;  //사실 read only라서 세터는 안말들어도 되는 상황인거지
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
		this.balance = balance;  사실 돈을 넣지 않는 이상 잔고가 변할리 없으니 안필요하겠지
	}
	*/

}//class
