package myself;

public class Ms113002 {

	public static void main(String[] args) {

	
		for (int i = 1; i <= 7; i+=2) {
			for (int j = i; j < 7; j++) {
				System.out.print("@"); /*�̷� ��쿡 �� �տ��� 2ĭ���� (i,j)�̸� (1,1)(1,3)(1,5)�ƴѰ�? �׷� 3ĭ...��! 
				�ƴϸ� (1,1) ������  (1,4)�� �Ǵ°ǰ�?  �ι�°�� �Ʒ� ��!!!!(1,1)(1,4)(1.7)?? �³�? ++�̶� 1�� �þ ���·� ..?3�� Ŀ����*/
				j++ ;
			}
			for (int j = 1; j <=i ; j++) {
				
				System.out.print("*");				
			}//for2
			System.out.println(" ");
		}//for1
	}//main

}//class
