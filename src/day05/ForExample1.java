package day05;

public class ForExample1

{  //�ٽ��ϱ�
	public static void main(String[] args) 
	{
		int i;
		int sum = 0;//sum�� ������ �����ϱ� ������ �ʹݿ� �ʱⰪ�� �����ϴ� ���� ��õ��
		for(i = 1 /*sum = 0*/; i<= 10; i++){
			
			sum += i;
		}//for

		System.out.println("1���� 10������ ���� " +sum+ "�Դϴ�.");
	}
}
