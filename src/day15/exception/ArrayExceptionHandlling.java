package day15.exception;

public class ArrayExceptionHandlling {

	public static void main(String[] args) {
		int [] arr = new int [5];
		
		try {
			for(int i = 0; i <= 5;  i++) {
				arr [i] = i;
				//방은 5개 인데 6개 들어가는거지 오류가 빵터지지
				
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예오ㅓㅣ 처리 부분");
		}
		System.out.println("프로그램 종효");
	}

}
