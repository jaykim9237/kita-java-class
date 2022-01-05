package myself;

public class Ms113002 {

	public static void main(String[] args) {

	
		for (int i = 1; i <= 7; i+=2) {
			for (int j = i; j < 7; j++) {
				System.out.print("@"); /*이럴 경우에 왜 앞에서 2칸이지 (i,j)이면 (1,1)(1,3)(1,5)아닌가? 그럼 3칸...아! 
				아니면 (1,1) 다음에  (1,4)가 되는건가?  두번째로 아래 아!!!!(1,1)(1,4)(1.7)?? 맞나? ++이라서 1이 늘어난 상태로 ..?3씩 커지나*/
				j++ ;
			}
			for (int j = 1; j <=i ; j++) {
				
				System.out.print("*");				
			}//for2
			System.out.println(" ");
		}//for1
	}//main

}//class
