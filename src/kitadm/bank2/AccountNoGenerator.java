package kitadm.bank2;

import java.util.HashSet;
import java.util.Random;

public final class AccountNoGenerator {
	
	
	//우리가 계좌번호를 주는 것이 아니라 랜덤으로 나오게 할거야
	//근데 이때 중복되지 않아야겠지
	
	private static HashSet<String> accountNolist = new HashSet<String>(); 
	
	//스테틱이니까 객체를 생성해서 호출하는 것이 아니라 클래스로 호출을 해야해 
	
		/*기존에 생성된 계좌번호랑 중복되지 않은 계좌번호르르 생성하여 반환한다.
		 * 기존에 생성된 계좌번호는 멤버변수인 AccountNoList에 저장되어있다.
		 * 계좌번호 생성규칙
		 * 형식 : XXX-YY-ZZZ  하나의 문자열로 정의 되어서 저장이 되어야해
				XXX: 100-199
				YY: 0-99
				ZZZZ: 100-9999
				형식별 각 위치에 해당하는 숫자는 랜덤하게 생성한다.*/
		public static String genAccountNo() {
		String accNo = null;
		//정수의 자리수 맞추기
		//포맷 써서 %03하면 세자리 수로 맞추고 앞에비면 0으로 채우는거야 
		//accNo = String.format("%03d", 1);
		
	/*double r = Math.random();
	int i = (int)(r*1000)+1;
	System.out.println(i);*/
		
		Random random = new Random();
		int i = random.nextInt(100);
		int x = i+100;
		System.out.println(x); 
		
		int y = random.nextInt(100);
		System.out.println(y);
		
		int j = random.nextInt(10000-100);
		int z = j+100;
		System.out.println(z);
		
		accNo =(x + "-" + y +"-"+ z);
		accNo = String.format("%03d-%02d-%04d", x, y, z);
		return accNo;
		}//수를 생성하는 것은 맞았는데 저장하는 것을 못했어 
		
		public static void main(String[] args) {
			System.out.println(AccountNoGenerator.genAccountNo());
	}
}
