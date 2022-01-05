package kitadm.bank2;

import java.util.HashSet;
import java.util.Random;

public final class AccountNoGenerator {
	
	
	//�츮�� ���¹�ȣ�� �ִ� ���� �ƴ϶� �������� ������ �Ұž�
	//�ٵ� �̶� �ߺ����� �ʾƾ߰���
	
	private static HashSet<String> accountNolist = new HashSet<String>(); 
	
	//����ƽ�̴ϱ� ��ü�� �����ؼ� ȣ���ϴ� ���� �ƴ϶� Ŭ������ ȣ���� �ؾ��� 
	
		/*������ ������ ���¹�ȣ�� �ߺ����� ���� ���¹�ȣ���� �����Ͽ� ��ȯ�Ѵ�.
		 * ������ ������ ���¹�ȣ�� ��������� AccountNoList�� ����Ǿ��ִ�.
		 * ���¹�ȣ ������Ģ
		 * ���� : XXX-YY-ZZZ  �ϳ��� ���ڿ��� ���� �Ǿ ������ �Ǿ����
				XXX: 100-199
				YY: 0-99
				ZZZZ: 100-9999
				���ĺ� �� ��ġ�� �ش��ϴ� ���ڴ� �����ϰ� �����Ѵ�.*/
		public static String genAccountNo() {
		String accNo = null;
		//������ �ڸ��� ���߱�
		//���� �Ἥ %03�ϸ� ���ڸ� ���� ���߰� �տ���� 0���� ä��°ž� 
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
		}//���� �����ϴ� ���� �¾Ҵµ� �����ϴ� ���� ���߾� 
		
		public static void main(String[] args) {
			System.out.println(AccountNoGenerator.genAccountNo());
	}
}
