package day08Test;

public class Test05Answer2 {

	public static void main(String[] args) {
		
		int array [] = new int[6];
		
		int size = 0; //중복되지 않은 난수 발생 개수
				
		while(true) {
			boolean duplicate = false;
			int r = (int)(Math.random()*45+1);
			
			for(int i = 0; i < size; i++) {
				if(r == array[i])
					duplicate = true;
			}//for
			
			if(!duplicate) {
				array[size] = r;
				size++;
			if(size==6) break;
			}
			
		}//while
	}

}
