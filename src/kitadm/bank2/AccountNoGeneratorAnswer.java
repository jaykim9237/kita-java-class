package kitadm.bank2;

import java.util.HashSet;
import java.util.Random;

public class AccountNoGeneratorAnswer {
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
			
			Random r = new Random();
			
			do {
			int xxx = r.nextInt(100)+100;
			String s_xxx = String.format("%03d", xxx);
			
			int yy = r.nextInt(100);
			String s_yy = String.format("%02d", yy);
			
			int zzzz = r.nextInt(10000-100)+100;
			String s_zzzz = String.format("%04d", zzzz);
					
			accNo = String.format("%s-%s-%s", s_xxx, s_yy, s_zzzz);
			}while(!accountNolist.add(accNo));
			
		
			//add�ؼ� Ʈ��� �׷��� ���忡 ������ ���̴ϱ� �ߺ��� ���� ���ٴ� �����ݾ� ��? �� �� ���߸���
			//���̻� �� �ʿ䰡 ���� �����ݾ� 
			//add �ؼ� ����(�ߺ�)�̾� �׷��� !�� ������ ���� �Ǵϱ� 
			return accNo;
			}
			
			
}
