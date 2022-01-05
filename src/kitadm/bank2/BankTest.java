package kitadm.bank2;

import java.util.ArrayList;
import java.util.Scanner;	

public class BankTest {

	private BankManager bm = new BankManager();
	
	public static void main(String[] args)  {
		/*
		 * 1. ���� �޴� ���
		 *   - ���α׷� ���� �޴��� �����ϵ� ������ ���α׷��� ��������
		 * 2. �޴����ÿ� ���� �б�ó��
		 *   (1)���»��� : ���� �����޴� ó���� createAccount()�޼��带 ���� ���� ó��
		 *   (2)���°˻� : �˻��� ���¹�ȣ�� �Է¹��� �� �˻��� ���� ������ ����Ѵ�. �˻������ ���� �� ������ ����Ѵ�.
		 *   (3)���»���:  ���� ����
		 *   (4)�Ա� : ���� ����
		 *   (5)��� : ���� ���� + ����� ���¹�ȣ�� ����� �ݾ��� ���� �޾Ƽ� ~~ ��� ó���� �����ϸ� ���� �޽����� ����Ѵ�.
		 *   (6)��ü : ���� ����
		 *   (7)��� �� ��� ����  ���¸� ����Ѵ�.
		 *   (8) ���α׷��� �����Ѵ�. */
		
		BankTest bt = new BankTest();
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			printMainMenu();
			System.out.println("���ϴ� �޴��� �����ϼ���.");
			int num = sc.nextInt();
			
			switch(num){
			case 1: //���»���
				//ó���� ���� ũ������Ʈ ��ī��Ʈ�� ����ƽ���� ����� ��� �ٵ� �׷� ���� �ƴ϶� ��ü�� �����ؼ� �ҷ����� �Ǵ� ���̾���
				bt.createAccount();
			//���� ���� �Լ� ä���ֱ�
				break;
			case 2: //�˻�
				System.out.print("�˻��� ���¹�ȣ�� �Է��ϼ���");
				//accNo�� �ٸ� ������ ���� ����� �� �ִ� ��Ȳ�� ���� �� �־ s�� �ҷ��� 
				String s_accNo = sc.next();
				//�׳� ������ �дٰ� ���� �ƴ϶� �̰� �޾Ƽ� ����ؾ���. 
				try {
					Account a = bt.bm.searchAccount(s_accNo);
					System.out.printf("���¼����� : %s\t ���¹�ȣ : %s\t �ܰ� : %d�� %n", a.getOwner().getName(), a.getAssNo(), a.getBalance());//\t��  �ڵ����� �����ִ� ���̾� 
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
					//����ڿ��� �������� ������
				}
				//���� �Լ� ó��
				
				break;
			case 3: //����
				System.out.print("���� �� ���¹�ȣ�� �Է��ϼ���");
				String d_accNo = sc.nextLine();
				try {
					Account a = bt.bm.deleteAccount(d_accNo);
					System.out.printf("%s 'account %s is deleted",  a.getOwner().getName(), a.getAssNo());
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
				}
				//�Ʊ� ��� �����̴ּ��� ������ e.printStackTrace() ��� println(e.getMessage())�� ����ϴ� ���� �ѹ��� �� �������ֽ� �� ��������?

				//���� �Լ�ó��
				
				break;
			case 4: //�Ա�
				System.out.print("���¹�ȣ�� �Է��ϼ���");
				String deposit_accNo = sc.nextLine();
				sc.nextLine();
				System.out.println("�Ա� �� ���� �Է��ϼ���");
				int deposit_amount = sc.nextInt();
				try {
					int balance = bt.bm.deposit(deposit_accNo, deposit_amount);
					System.out.println("�Ա� �� �ܰ�: " + balance);
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 5: //���
				System.out.println("���¹�ȣ�� �Է��ϼ���");
				String w_accNo = sc.nextLine();
				sc.nextLine();
				System.out.println("��� �� ���� �Է��ϼ���");
				int w_amount = sc.nextInt();
				try {
					int new_balance = bt.bm.withdraw(w_accNo, w_amount);
					System.out.println(w_accNo +"�� ��� �� �ܾ���" +new_balance);
				} catch (RecordNotFoundException | InvalidTransactionException e) {
					System.out.println(e.getMessage());
					//ó�� ����� ������ ��Ƽ�� �ص� �ǰ� ���� �ٸ��� ���� ���ָ� �� ���� ���� ���� �����ϰ� �޼����� ��Ÿ ���� ���̴ϱ� ��Ƽ�� �ص� �� �ٵ� �������� ���������� ���� �Ͻ�
				}
				
				break;
			case 6: //�۱�
				System.out.println("������ ��� ���¹�ȣ�� �Է��ϼ���");
				String accNoFrom = sc.nextLine();
				sc.nextLine();
				System.out.println("�Ա� �� ���� �Է��ϼ���");
				int trans_amount = sc.nextInt();
				sc.nextLine();
				System.out.println("�Ա� ���� ���¹�ȣ�� �Է��ϼ���");
				String accNoTo = sc.nextLine();
				try {
					int balance = bt.bm.transfer(accNoFrom
							, accNoTo, trans_amount);
					System.out.println("��ü �� �ܰ� : " + balance );
				} catch (RecordNotFoundException | InvalidTransactionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 7: //ȣ�� �������
				ArrayList<Account> all_list =bt.bm.getAllAccounts();
				for(Account acc : all_list) {
					System.out.printf("���¼����� : %s\t ���¹�ȣ : %s\t �ܰ� : %d�� %n", acc.getOwner().getName(), acc.getAssNo(), acc.getBalance());//\t��  �ڵ����� �����ִ� ���̾� 
				}
				/*���� ���� �ڵ� ---> bt.bm.getAllAccounts();*/

				break;
			case 8: bt.bm.saveData();
					System.out.println("������ ���� �Ϸ�");
				System.exit(0);
				break;
				//����Ʈ ���� �ȸ���� ���ȳ�! ����Ʈ �����
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
				//���ڰ� �ƴ� ���� ���͵� ������ �� �����ǰ� ������
				
				
				
			}//switch
			
		}//while 8�� ���Ḧ ������ ���� ������ �Ѵ�. 
			
	}
	/*���µ���� ó��
	 * ������(�̸� ���� �ּ�) �� ��������(���¹�ȣ, �ʱ� �ܰ�)�� �Է¹޾� Ŀ���͸ӿ� ��ī��Ʈ ��ü�� ������ �� ����Ѵ�.*/
	//Ŭ���� �ȿ����� ����� �����̶� �����̺����� �߾� 
	
	private void createAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����: ");
		String name = sc.next();
		System.out.println("����: ");
		int age = sc.nextInt();
		//�ּҰ� ���͸� �������� ����� ���ε� ���ۿ� ���� ������ ���� ���� ���� �װ� ���ַ��� �־��ִ� ���̾� 
		sc.nextLine();
		System.out.println("�ּ�: ");
		String address = sc.nextLine();
		System.out.println("ù �Ա� ����: ");
		int balance = sc.nextInt();
		
		Customer hi = new Customer(name, age, address);
		//�ż��带 ����ؼ� ������� ����� ������ ���� ��Ʈ������ ������ ������ ���� �޾Ƽ� �аž�. ��� ����ƽ���� ������� ������ Ŭ������ ���� �޾ƿ��� ���̾�
		String accNo = AccountNoGeneratorAnswer.genAccountNo();
		System.out.println("������ ���¹�ȣ : " +accNo);
		
		Account a = new Account(accNo, hi, balance);
		bm.createAccount(a);
		System.out.println("���� ������ �����߽��ϴ�.");
		
		
	}
	
	private static void printMainMenu() {
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
		System.out.println("�̢̢�---[Kita DM 2 Bank]-----");
		System.out.println("�̢̢�------------------------");
		System.out.println("�̢̢�------1. ���� ����---------");
		System.out.println("�̢̢�------2. ���� �˻�---------");
		System.out.println("�̢̢�------3. ���� ����---------");
		System.out.println("�̢̢�------4. �Ա�------------");
		System.out.println("�̢̢�------5. ���------------");
		System.out.println("�̢̢�------6. ��ü------------");
		System.out.println("�̢̢�------7. ���� ���� ���� ���---");
		System.out.println("�̢̢�------8. ����---------");		
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
		System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢̢�");
	}
}
