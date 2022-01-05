package kitadm.bank2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * 1.���� ���
 * 2. ���� �˻�
 * 3. ���� ����
 * 4. �Ա�
 * 5. ��� 
 * 6. ��ü
 * 7. ��� �������� ��ȯ
 * 8. ������ ����
 * 9. ������ �б�
 * */
public class BankManager {
	private ArrayList<Account> accountList;// = new ArrayList<Account>(); 
	//���� �� ���� �����ڸ� �����δ� ������ 
	/*
	 * ��� ���� ������ ������ �ִ� data.dt ������ ������ �ش� ���Ϸκ��� �����͸� �о�ͼ� ��ī��Ʈ����Ʈ�� �ʱ�ȭ �Ѵ�.
	 * ����, ������ ������ ���ο� ��ī��Ʈ����Ʈ�� �����Ѵ�.
	 * 
	 * �׷� �����Ͱ� �ִ��� ������ ��� �˰ڴ°� �츮�� ���� ��ü�� �˾ƾ���*/
	public BankManager() {
		File file = new File("data.dt");
		if(file.exists()) {//�װ� ���� �о���߰ڴ�.
			readData();//���⼭ ���带 ����ϴ� ���̰� �׷� ������ ���� ����� �ϴ� ���ϱ�
		} else {
			accountList = new ArrayList<Account>();
		}
	}
	
	//1. ���µ��
	public void createAccount(Account a) {
		accountList.add(a);
	}
	
	/*2.���� �˻�
	 * �˻��� ���¹�ȣ�� �Ű������� �Է� �޾Ƽ� �˻������ Account��ü�� ��ȯ�Ѵ�. 
	 * ��, �˻� ���¹�ȣ�� �������� ������ ���� ȸ�Ǹ� ����Ѵ�. */
	
	/*public Account searchAccount(String search_no) {
		Scanner sc = new Scanner(System.in);
		AccountNoGeneratorAnswer acc = new AccountNoGeneratorAnswer();
		System.out.println("000-00-0000 �������� ���¹�ȣ�� �Է��ϼ���.");
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
			/*���࿡ else�� ����� �߻��� ���� �ϸ� �ȵǴ� ���ΰ� �ڿ� ���� ���� �ִ°��ݾ� �� �ݺ����� ���� �����ϰ� ���� �ű⿡�� ������ �߻��� ���Ѿ� �ϴ� ������*/
			}//if
		}//for
		//���� ���� ã�Ƽ� ����� ������ ���� ���� ���̰� ���࿡ �ȳ����� ���� �ΰ��ΰŴϱ� ���ϴ�� ������ �����϶�� ������ 
		if(result == null) throw new RecordNotFoundException("���°� �������� �ʽ��ϴ�.");
	return result;
	}
	
	
	/*3.���� ����
	 * ������ ���¹�ȣ�� �Ű������� �Է¹޾� ��� �Ǿ� �մ� ���¿��� ��ġ�ϴ� ���¸� �����Ѵ�. 
	 * ����, ������ ���¹�ȣ�� �������� ���� ���RecordNotFoundExceptio�� �߻��Ѵ�. (ȸ��, �̷�� �̿�)
	 * ������ �����ϸ� ������ ���� ��ü�� ����� ��ȯ�Ѵ�.  */
	
	public Account deleteAccount(String accNo) throws RecordNotFoundException{
		Account a = searchAccount(accNo);
		accountList.remove(a);
		return a;		
		
	}
	/*4. �Ա� deposit
	 * �Ա��ϰ��� �ϴ� ���� ��ȣ�� �Ա� �ݾ��� �Ű������� �޾� �Ա�ó���� �Ѵ�. 
	 * ���� �פ����ϰ��� �ϴ� ���¹�ȣ�� ���� ���� ���� ��� ���� ���� ������ ���ش�. ����ȸ��
	 * �Ա��� �����ϸ� �Ա� �� �ܰ� ����� ��ȯ�Ѵ�.*/
	
	public int deposit(String accNo, int amount) throws RecordNotFoundException {
		Account a = searchAccount(accNo);
		int balance = a.deposit(amount);
		
		return balance;
	}
	
	/*5.���
	 * ����ϰ��� �ϴ� ���� ��ȣ�� Ǯ�� �ݷ��� �Ű������� �Է¹޾� ��� ó���� �Ѵ�.
	 * ���� ����ϰ��� �ϴ� ���¹�ȣ�� �������� ���� ��� ���Ͱ��� ���� ȸ�Ǹ� �����Ѵ�. 
	 * ����� �����ϸ� ��� �� �ܰ� ����� ��ȯ�Ѵ�.*/
	
	public int withdraw(String accNo, int amount) throws RecordNotFoundException, InvalidTransactionException{
		Account a = searchAccount(accNo);
		int balance = a.withdraw(amount);
		
		return balance;
	}
	
	/*6.��ü
	 * ��ü�� �� ���¿� ��ü�� ���� ���� ��ȣ �׸��� ��ü �ݾ��� �Ű������� �Է� �޾Ƽ� ��ü�� ó���Ѵ�. 
	 * ���� ��ü�� ���¹�ȣ�� ��ü�� ���� ���¹�ȣ�� �������� ���� �Ͽ� 
	 * Recodr�� �Ŀ���ͼ����� �׸��� �������� ��ü�� �̷����� �ʾ��� ��� �ι븮��Ʈ���������ͼ�Ʈ�� �߻��Ѵ�.
	 * ��ü�� �����ϸ� ��ü �� �ܰ� ����� ��ȯ�Ѵ�. */
	
	public int transfer(String accNoFrom, String accNoTo, int amount) throws RecordNotFoundException, InvalidTransactionException{
		Account from = searchAccount(accNoFrom);
		Account to = searchAccount(accNoTo);
		
		int balanceFrom = from.transfer(amount, to);
		
		return balanceFrom;
	}
	
	/*7. ��� ���� ���� ��ȯ*/
	
	public ArrayList<Account> getAllAccounts(){
		return accountList;
	}
	//8. ������ ����(file name : data.dt)
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
//9. ������ �б� (���� �̸� : data.dt)

public void readData() {
	try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dt"))) {
		accountList = (ArrayList<Account>)ois.readObject();
	} catch(IOException ioe) {
		ioe.printStackTrace();
	} catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();  //����Ʈ�� �����
	}
}
}//class 
