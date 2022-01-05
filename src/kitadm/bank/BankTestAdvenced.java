package kitadm.bank;

import java.util.Scanner;

public class BankTestAdvenced {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//생성된 계좌 정보를 저장
			Account aa = null;
			 
			while(true) {
			
				printMainMenu();
				System.out.print("메뉴를 선택하세요 :");
				int no = sc.nextInt();
				switch (no) {
				case 1: aa = createAccount(); //만들어진것을 aa에 받아둔거야				
					break;
					
				case 2: printAccountInfo(aa);
					break;
					
				case 3: deposit(aa);
					break;
				
				case 99: System.exit(0); //자바프로그램 종료
					
					break;

				default:
					break;
				}
			}//while
	}//main
	/*
	public static Account save() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금하실 금액 : ");
		int save = sc.nextInt();
		
		Accout s = new Account(balance);
		return s;
		
	}*/
	
	public static void deposit(Account a){//받고자 하는 객체를 매계변수로 사용하겠다. 그 이전의 정보가 있는 것이 온거야 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금하실 금액 : ");
		int amount = sc.nextInt();
		
		a.deposit(amount);//입금처리가 된거야 /*어카운트 클래스에 있는 디파짓의 식을 가지고 온거야 */
		System.out.println("입금성공");
	}
	
	
	public static Account createAccount() {
		/*스캐너 굳이 또 만들 필요없지*/
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 계좌번호 : ");
		String accNo = sc.next();
		System.out.print("name: ");
		String owner = sc.next();
		System.out.print("first income: ");
		int balance = sc.nextInt();
		
		//정보를 받아서 객체를 생성한거야
		Account a = new Account(accNo, owner, balance);
		
		System.out.println("계좌 생성 성공!");
		return a; //반환을 안해주면 바로 윗줄에 만들어준 객체가 안에서만 사용이 되는거지 
	}
	public static void printMainMenu() {
		System.out.println("-------------------");
		System.out.println("[kita DM Bank]");
		System.out.println("-------------------");
		System.out.println("1.계좌생성");
		System.out.println("2.계좌번호 출력");
		System.out.println("3.입금");
		System.out.println("99.종료");
	}
	
	 public static void printAccountInfo(Account a) {
		 System.out.printf("%s 소유의 계좌의 잔고: %d", a.getAccNo(), a.getBalance(), a.getBalance());
	 }

}
