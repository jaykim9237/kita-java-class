package day07.array;

public class DeepCopy {

	public static void main(String[] args) {
		
	
		int num1 [] = {10,20,30,40,50};
		int num2 [] = new int[num1.length];
		
		System.arraycopy(num1, 0, num2, 0, num1.length);
		
		num1[0] = 1;
		
		System.out.println("=== num1 ===");
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		
		System.out.println( );
		System.out.println("=== num2 ===");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}

}
}//�ٵ� �� ��� ī�Ǵ� �⺻���϶��� �ǹ̰� �ִµ� �������� ���� �ǹ� ���� ���� ī�ǰ� �Ǵ°ž� �ֳ��ϸ� ������ �������� ����ҰŴϱ�
