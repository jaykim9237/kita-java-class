package day08Test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		double r = Math.random();// [0,1) - 0�̻� 1�̸��̶�� ���̾� 
		System.out.println(r);
	
 //1~10������ ������ ���� �߻�
	int i = (int)(Math.random()*10)+1;//1�� ���ִ� ������ 1�� ������ �Ϸ��� !! 10�� ������ �ϸ鼭 ���ÿ� 1�� �������� !
	System.out.println(i);	
	}
	//������ ������� ������ �� ������ ���� ���� ���� �� ���ݾ� �ƴϸ� ��ǻ���� �ð��� �̿��ؼ� ��¥ ������ �߻���Ű�� ���̰ŵ� 
/*	
	Random random = new Random();
	int j = random.nextInt(10); // [0,10)
	System.out.println(j);
	//�����ϻ� ������ �ƴϾ�!
	}*/
}
