package kitadm.bank;

public class BankTest {

	public static void main(String[] args) {

		Account ac1 = new Account("11-11", "홍길동", 500);
		/*System.out.println(ac1);*/
		printAccountInfo(ac1);
		
	//	Account ac2 = new Account("11-12", "ddana");
	//	printAccountInfo(ac2);
	}
	
	//계좌정보출력 코드의 중복을 피하기 위해서 
	
	 public static void printAccountInfo(Account a) {/*원래는 어카운트 타입이 어카운트 타입이어야 하는거지 정수르르 넣으면 정수가 나오는거처럼  a는 ac1과 ac2를 받는거야 */
		 /*System.out.println(a); a가 ac꺼를 받은건지 보려면 같은거를 출력해본거야 */
		 System.out.printf("%s 소유의 계좌의 잔고: %d", a.getAccNo(), a.getBalance(), a.getBalance());
	 }

}
