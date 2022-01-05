package day08Test;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		double r = Math.random();// [0,1) - 0이상 1미만이라는 뜻이야 
		System.out.println(r);
	
 //1~10사이의 랜덤한 정수 발생
	int i = (int)(Math.random()*10)+1;//1을 더주는 이유는 1을 나오게 하려고 !! 10도 나오게 하면서 동시에 1도 나오려면 !
	System.out.println(i);	
	}
	//난수를 가지고는 싶으나 그 범위를 한정 짓고 싶을 수 있잖아 아니면 컴퓨터의 시간을 이용해서 진짜 난수를 발생시키는 것이거덩 
/*	
	Random random = new Random();
	int j = random.nextInt(10); // [0,10)
	System.out.println(j);
	//예시일뿐 오류인 아니야!
	}*/
}
