package day08Test;

public class Test03 {

	public static void main(String[] args) {

		//꼭 다시해보자... 최대최소랑 메서드를 만들어서 하는거 틀렸어
		int array []= {10,50,40,60,70,80,90,51,4,6};
		
		System.out.print("[");
		for (int a : array) {
			System.out.print(a +" ");
		}
		System.out.println("]");
		System.out.print("합계: ");
		
		int sum=0;
				
		for (int i = 0; i < array.length; i++) {
			sum += array[i] ;
		}//for1
		
		System.out.println(sum);
		System.out.print("평균: ");
		
		double avg = 0;
		 avg = sum/array.length;
		 System.out.println(avg);
		 
		 System.out.print("최대값: ");
		 
		 
			 int max = 0;
		for{	 
		 }//while
		
		
		
		
		}
		 
	}//main

}//class
