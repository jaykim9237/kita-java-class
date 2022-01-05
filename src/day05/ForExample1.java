package day05;

public class ForExample1

{  //다시하기
	public static void main(String[] args) 
	{
		int i;
		int sum = 0;//sum은 변수와 무관하기 때문에 초반에 초기값을 지정하는 것을 추천해
		for(i = 1 /*sum = 0*/; i<= 10; i++){
			
			sum += i;
		}//for

		System.out.println("1부터 10까지의 합은 " +sum+ "입니다.");
	}
}
