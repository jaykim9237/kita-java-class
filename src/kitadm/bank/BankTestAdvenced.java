package kitadm.bank;

import java.util.Scanner;

public class BankTestAdvenced {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//������ ���� ������ ����
			Account aa = null;
			 
			while(true) {
			
				printMainMenu();
				System.out.print("�޴��� �����ϼ��� :");
				int no = sc.nextInt();
				switch (no) {
				case 1: aa = createAccount(); //����������� aa�� �޾Ƶаž�				
					break;
					
				case 2: printAccountInfo(aa);
					break;
					
				case 3: deposit(aa);
					break;
				
				case 99: System.exit(0); //�ڹ����α׷� ����
					
					break;

				default:
					break;
				}
			}//while
	}//main
	/*
	public static Account save() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ա��Ͻ� �ݾ� : ");
		int save = sc.nextInt();
		
		Accout s = new Account(balance);
		return s;
		
	}*/
	
	public static void deposit(Account a){//�ް��� �ϴ� ��ü�� �Ű躯���� ����ϰڴ�. �� ������ ������ �ִ� ���� �°ž� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ա��Ͻ� �ݾ� : ");
		int amount = sc.nextInt();
		
		a.deposit(amount);//�Ա�ó���� �Ȱž� /*��ī��Ʈ Ŭ������ �ִ� �������� ���� ������ �°ž� */
		System.out.println("�Աݼ���");
	}
	
	
	public static Account createAccount() {
		/*��ĳ�� ���� �� ���� �ʿ����*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���¹�ȣ : ");
		String accNo = sc.next();
		System.out.print("name: ");
		String owner = sc.next();
		System.out.print("first income: ");
		int balance = sc.nextInt();
		
		//������ �޾Ƽ� ��ü�� �����Ѱž�
		Account a = new Account(accNo, owner, balance);
		
		System.out.println("���� ���� ����!");
		return a; //��ȯ�� �����ָ� �ٷ� ���ٿ� ������� ��ü�� �ȿ����� ����� �Ǵ°��� 
	}
	public static void printMainMenu() {
		System.out.println("-------------------");
		System.out.println("[kita DM Bank]");
		System.out.println("-------------------");
		System.out.println("1.���»���");
		System.out.println("2.���¹�ȣ ���");
		System.out.println("3.�Ա�");
		System.out.println("99.����");
	}
	
	 public static void printAccountInfo(Account a) {
		 System.out.printf("%s ������ ������ �ܰ�: %d", a.getAccNo(), a.getBalance(), a.getBalance());
	 }

}
