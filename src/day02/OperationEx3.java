package day02;

public class OperationEx3
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int i =2;

		boolean value =((num1 = num1 + 10)< 10) && ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //여기가 실행이 되지 않았을거야 위에가 어차피 실행이 되지 않았을 것이기 때문에 

		//이미 물린을 선언했기 때문에 또 하지 않아 에러가 나와 
		value = ((num1 = num1 + 10) > 10) || ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //두개짜리 하나로 해서 해보기
	}
}
