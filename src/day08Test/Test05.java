package day08Test;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		
			
		for (int i = 1; i <=6; i++) {
			int j = random.nextInt(46);		
			int k = random.nextInt(46);
			
			if(j==k)
				continue;
			
			System.out.print(k+ " ");
		}
	}

}
