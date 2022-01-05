package day13.string;

public class StringBufferTest {
	public static void main(String[] args) {
		String str = "select";
		int lasting	= 100;
		
		//����� ��Ʈ������ �� ���� ���̰� 
		long startTime = System.currentTimeMillis();
		String newStr = "";
		for (int i = 0; i < lasting; i++) {
			newStr += str;
		}
		long endTime = System.currentTimeMillis();
		//�� ���� �����̶� �������� ������ �ð��� ������ �� ���̰� �ɸ� �ð��� ������ 
		System.out.println("[String +]" + (endTime - startTime));
		
		
		//����� ��Ʈ�����۸� ����ϴ� ���� ������ 
		startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < lasting; i++) {
			buffer.append(str);
		}
		endTime = System.currentTimeMillis();
		//�� ���� �����̶� �������� ������ �ð��� ������ �� ���̰� �ɸ� �ð��� ������ 
		System.out.println("[String +]" + (endTime - startTime));
		
	}
}
