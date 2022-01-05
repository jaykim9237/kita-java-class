package kitadm.bank2;

import java.util.ArrayList;
import java.util.Scanner;	

public class BankTest {

	private BankManager bm = new BankManager();
	
	public static void main(String[] args)  {
		/*
		 * 1. 메인 메뉴 출력
		 *   - 프로그램 종료 메뉴를 선택하디 전까지 프로그램을 번족수행
		 * 2. 메뉴선택에 따른 분기처리
		 *   (1)계좌생성 : 계좌 생성메뉴 처리는 createAccount()메서드를 통해 별도 처리
		 *   (2)계좌검색 : 검색할 계좌번호를 입력받은 후 검색된 계좌 덩보를 출력한다. 검색결과가 없을 시 오류를 출력한다.
		 *   (3)계좌삭제:  위와 유사
		 *   (4)입금 : 위와 유사
		 *   (5)출금 : 위와 유사 + 출금할 계좌번호와 출금할 금액을 전달 받아서 ~~ 출금 처리를 실패하면 오류 메시지를 출력한다.
		 *   (6)이체 : 위와 유사
		 *   (7)등록 된 모든 정보  계좌를 출력한다.
		 *   (8) 프로그램을 종료한다. */
		
		BankTest bt = new BankTest();
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			printMainMenu();
			System.out.println("원하는 메뉴를 선택하세요.");
			int num = sc.nextInt();
			
			switch(num){
			case 1: //계좌생성
				//처음에 나는 크리에이트 어카운트를 스테틱으로 만들어 줬어 근데 그럴 것이 아니라 객체를 생성해서 불러오면 되는 것이었지
				bt.createAccount();
			//계좌 생성 함수 채워주기
				break;
			case 2: //검색
				System.out.print("검색할 계좌번호를 입력하세요");
				//accNo는 다른 곳에서 많이 사용할 수 있는 상황이 많을 수 있어서 s를 불렀어 
				String s_accNo = sc.next();
				//그냥 가져다 둔다고 끝이 아니라 이걸 받아서 사용해야지. 
				try {
					Account a = bt.bm.searchAccount(s_accNo);
					System.out.printf("계좌소유주 : %s\t 계좌번호 : %s\t 잔고 : %d원 %n", a.getOwner().getName(), a.getAssNo(), a.getBalance());//\t는  자동으로 띄어써주는 것이야 
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
					//사용자에게 보여지기 때문에
				}
				//예외 함수 처리
				
				break;
			case 3: //삭제
				System.out.print("삭제 할 계좌번호를 입력하세요");
				String d_accNo = sc.nextLine();
				try {
					Account a = bt.bm.deleteAccount(d_accNo);
					System.out.printf("%s 'account %s is deleted",  a.getOwner().getName(), a.getAssNo());
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
				}
				//아까 잠시 설명주셨던거 같은데 e.printStackTrace() 대신 println(e.getMessage())를 사용하는 이유 한번만 더 말씀해주실 수 있으세요?

				//예외 함수처리
				
				break;
			case 4: //입금
				System.out.print("계좌번호를 입력하세요");
				String deposit_accNo = sc.nextLine();
				sc.nextLine();
				System.out.println("입금 할 값을 입력하세요");
				int deposit_amount = sc.nextInt();
				try {
					int balance = bt.bm.deposit(deposit_accNo, deposit_amount);
					System.out.println("입금 후 잔고: " + balance);
				} catch (RecordNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 5: //출금
				System.out.println("계좌번호를 입력하세요");
				String w_accNo = sc.nextLine();
				sc.nextLine();
				System.out.println("출금 할 값을 입력하세요");
				int w_amount = sc.nextInt();
				try {
					int new_balance = bt.bm.withdraw(w_accNo, w_amount);
					System.out.println(w_accNo +"의 출금 후 잔액은" +new_balance);
				} catch (RecordNotFoundException | InvalidTransactionException e) {
					System.out.println(e.getMessage());
					//처리 방식이 같으면 멀티로 해도 되고 갚이 다르면 각각 해주면 돼 지금 같은 경우는 동일하게 메세지를 나타 내는 것이니까 멀티로 해도 돼 근데 교수님은 연습용으로 각각 하심
				}
				
				break;
			case 6: //송금
				System.out.println("가지고 계신 계좌번호를 입력하세요");
				String accNoFrom = sc.nextLine();
				sc.nextLine();
				System.out.println("입금 할 값을 입력하세요");
				int trans_amount = sc.nextInt();
				sc.nextLine();
				System.out.println("입금 받을 계좌번호를 입력하세요");
				String accNoTo = sc.nextLine();
				try {
					int balance = bt.bm.transfer(accNoFrom
							, accNoTo, trans_amount);
					System.out.println("이체 후 잔고 : " + balance );
				} catch (RecordNotFoundException | InvalidTransactionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 7: //호출 계좌출력
				ArrayList<Account> all_list =bt.bm.getAllAccounts();
				for(Account acc : all_list) {
					System.out.printf("계좌소유주 : %s\t 계좌번호 : %s\t 잔고 : %d원 %n", acc.getOwner().getName(), acc.getAssNo(), acc.getBalance());//\t는  자동으로 띄어써주는 것이야 
				}
				/*내가 만든 코드 ---> bt.bm.getAllAccounts();*/

				break;
			case 8: bt.bm.saveData();
					System.out.println("데이터 저장 완료");
				System.exit(0);
				break;
				//디폴트 값을 안만들어 버렸네! 디폴트 만들기
			default:
				System.out.println("잘못 입력했습니다.");
				//숫자가 아닌 것이 들어와도 오류가 잘 생성되게 만들자
				
				
				
			}//switch
			
		}//while 8번 종료를 누를때 까지 실행을 한다. 
			
	}
	/*계좌등록을 처리
	 * 고객정보(이름 나이 주소) 및 계좌정보(계좌번호, 초기 잔고)를 입력받아 커스터머와 어카운트 객체를 생성한 후 등록한다.*/
	//클래스 안에서만 사용할 예정이라서 프라이빗으로 했어 
	
	private void createAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성함: ");
		String name = sc.next();
		System.out.println("나이: ");
		int age = sc.nextInt();
		//주소가 엔터를 기준으로 끊어내는 것인데 버퍼에 나이 다음에 만든 것이 남아 그걸 없애려고 넣어주는 것이야 
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
		System.out.println("첫 입금 가격: ");
		int balance = sc.nextInt();
		
		Customer hi = new Customer(name, age, address);
		//매서드를 사용해서 만들어진 결과가 나오는 것이 스트링으로 나오기 때문에 값을 받아서 둔거야. 즈리고 스테틱으로 만들었기 때문에 클래스로 직접 받아오는 것이야
		String accNo = AccountNoGeneratorAnswer.genAccountNo();
		System.out.println("생성된 계좌번호 : " +accNo);
		
		Account a = new Account(accNo, hi, balance);
		bm.createAccount(a);
		System.out.println("계좌 생성에 성공했습니다.");
		
		
	}
	
	private static void printMainMenu() {
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("▩▩▩---[Kita DM 2 Bank]-----");
		System.out.println("▩▩▩------------------------");
		System.out.println("▩▩▩------1. 계좌 생성---------");
		System.out.println("▩▩▩------2. 계좌 검색---------");
		System.out.println("▩▩▩------3. 계좌 삭제---------");
		System.out.println("▩▩▩------4. 입금------------");
		System.out.println("▩▩▩------5. 출금------------");
		System.out.println("▩▩▩------6. 이체------------");
		System.out.println("▩▩▩------7. 전쳬 계좌 정보 출력---");
		System.out.println("▩▩▩------8. 종료---------");		
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
	}
}
