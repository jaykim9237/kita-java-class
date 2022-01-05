package kitadm.bank2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * 1.계좌 등록
 * 2. 계좌 검색
 * 3. 계좌 삭제
 * 4. 입금
 * 5. 출금 
 * 6. 이체
 * 7. 등록 계좌정보 반환
 * 8. 데이터 저장
 * 9. 데이터 읽기
 * */
public class BankManager {
	private ArrayList<Account> accountList;// = new ArrayList<Account>(); 
	//선언만 해 놓고 생성자를 만들어두는 것이지 
	/*
	 * 등록 계좌 정보를 가지고 있는 data.dt 파일이 있으면 해당 파일로부터 데이터를 읽어와서 어카운트리스트를 초기화 한다.
	 * 만략, 파일이 없으면 새로운 어카운트리스트를 생성한다.
	 * 
	 * 그럼 데이터가 있는지 없는지 어떻게 알겠는가 우리가 파일 객체를 알아야해*/
	public BankManager() {
		File file = new File("data.dt");
		if(file.exists()) {//그거 많이 읽어봐야겠다.
			readData();//여기서 리드를 사용하는 것이고 그럼 저장은 오디에 해줘야 하는 것일까
		} else {
			accountList = new ArrayList<Account>();
		}
	}
	
	//1. 계좌등록
	public void createAccount(Account a) {
		accountList.add(a);
	}
	
	/*2.계좌 검색
	 * 검색할 계좌번호를 매개변수로 입력 받아서 검색결과를 Account객체로 반환한다. 
	 * 다, 검색 계좌번호가 존재하지 않으면 예외 회피를 사용한다. */
	
	/*public Account searchAccount(String search_no) {
		Scanner sc = new Scanner(System.in);
		AccountNoGeneratorAnswer acc = new AccountNoGeneratorAnswer();
		System.out.println("000-00-0000 형식으로 계좌번호를 입력하세요.");
		search_no = sc.nextLine();
		if (search_no.equals(search_no)) {
			System.out.println("AccountNoGeneratorAnswer.accountNolist");
		}
	}*/
	public Account searchAccount(String accNo) throws RecordNotFoundException{
		Account result = null;
		for(Account a : accountList) {
			if(accNo.equals(a.getAssNo())){
				result = a;
				break;
			/*만약에 else로 요류를 발생할 것을 하면 안되는 것인게 뒤에 있을 수도 있는거잖아 이 반복문을 전부 수행하고 나서 거기에도 없으면 발생을 시켜야 하는 것이지*/
			}//if
		}//for
		//같은 것을 찾아서 결과가 있으면 값이 나올 것이고 만약에 안나오면 값이 널값인거니까 널일대는 오류를 생성하라는 것이지 
		if(result == null) throw new RecordNotFoundException("계좌가 존재하지 않습니다.");
	return result;
	}
	
	
	/*3.계좌 삭제
	 * 삭제할 계좌번호를 매개변수로 입력받아 등록 되어 잇는 계좌에서 일치하는 계좌를 삭제한다. 
	 * 만약, 삭제할 계좌번호가 존재하지 않을 경우RecordNotFoundExceptio을 발생한다. (회피, 미루기 이용)
	 * 삭제를 성공하면 삭제한 계좌 객체를 결과로 반환한다.  */
	
	public Account deleteAccount(String accNo) throws RecordNotFoundException{
		Account a = searchAccount(accNo);
		accountList.remove(a);
		return a;		
		
	}
	/*4. 입금 deposit
	 * 입금하고자 하는 계좌 번호와 입금 금액을 매개변수로 받아 입금처리를 한다. 
	 * 만약 잉ㅂ금하고자 하는 계좌번호가 존재 하지 않을 경우 위와 같은 오류를 내준다. 오류회피
	 * 입금을 성공하면 입금 후 잔고를 결과로 반환한다.*/
	
	public int deposit(String accNo, int amount) throws RecordNotFoundException {
		Account a = searchAccount(accNo);
		int balance = a.deposit(amount);
		
		return balance;
	}
	
	/*5.출금
	 * 출금하고자 하는 계좌 번호와 풀금 금랙을 매개변수로 입력받아 출금 처리를 한다.
	 * 만약 출금하고자 하는 계좌번호가 존재하지 않을 경우 위와같이 오류 회피를 실행한다. 
	 * 출금을 성공하면 출금 후 잔고를 결과로 반환한다.*/
	
	public int withdraw(String accNo, int amount) throws RecordNotFoundException, InvalidTransactionException{
		Account a = searchAccount(accNo);
		int balance = a.withdraw(amount);
		
		return balance;
	}
	
	/*6.이체
	 * 이체를 할 계좌와 이체를 받을 계좌 번호 그리고 이체 금액을 매개변수로 입력 받아서 이체를 처리한다. 
	 * 만약 이체한 계좌번호와 이체를 받을 계좌번호가 존재하지 않을 겅우 
	 * Recodr낫 파운드익셉션을 그리고 정상적인 에체가 이뤄지지 않았을 경우 인밸리드트렌스젝션익셉트를 발생한다.
	 * 이체를 성공하면 이체 루 잔고를 결과로 반환한다. */
	
	public int transfer(String accNoFrom, String accNoTo, int amount) throws RecordNotFoundException, InvalidTransactionException{
		Account from = searchAccount(accNoFrom);
		Account to = searchAccount(accNoTo);
		
		int balanceFrom = from.transfer(amount, to);
		
		return balanceFrom;
	}
	
	/*7. 등록 계좌 정보 반환*/
	
	public ArrayList<Account> getAllAccounts(){
		return accountList;
	}
	//8. 데이터 저장(file name : data.dt)
	public void saveData() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dt"))){
				oos.writeObject(accountList);
				
		/*try(FileOutputStream fos = new FileOutputStream("data.dt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(obj);*/
		} catch (IOException ioe) {
			ioe.printStackTrace();
			}
	}
//9. 데이터 읽기 (파일 이름 : data.dt)

public void readData() {
	try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dt"))) {
		accountList = (ArrayList<Account>)ois.readObject();
	} catch(IOException ioe) {
		ioe.printStackTrace();
	} catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();  //원노트에 적어둠
	}
}
}//class 
