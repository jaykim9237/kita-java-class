package kitadm.bank;

public class BankTest {

	public static void main(String[] args) {

		Account ac1 = new Account("11-11", "ȫ�浿", 500);
		/*System.out.println(ac1);*/
		printAccountInfo(ac1);
		
	//	Account ac2 = new Account("11-12", "ddana");
	//	printAccountInfo(ac2);
	}
	
	//����������� �ڵ��� �ߺ��� ���ϱ� ���ؼ� 
	
	 public static void printAccountInfo(Account a) {/*������ ��ī��Ʈ Ÿ���� ��ī��Ʈ Ÿ���̾�� �ϴ°��� �������� ������ ������ �����°�ó��  a�� ac1�� ac2�� �޴°ž� */
		 /*System.out.println(a); a�� ac���� �������� ������ �����Ÿ� ����غ��ž� */
		 System.out.printf("%s ������ ������ �ܰ�: %d", a.getAccNo(), a.getBalance(), a.getBalance());
	 }

}
