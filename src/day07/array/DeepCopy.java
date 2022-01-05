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
}//근데 이 어레이 카피는 기본형일때는 의미가 있는데 참조형일 때는 의미 없이 얕은 카피가 되는거야 왜냐하면 어차피 참도형을 사용할거니까
