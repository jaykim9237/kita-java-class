package day05;

public class BreakExample1
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 0;

		for(num = 0; ; num++){
			sum += num;
			if(sum >= 100)
				break;
		}//for
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

	}
}
//나는 이게 쌓여서 더해지는건지 그냥 더해지는 건지 모르겟어...