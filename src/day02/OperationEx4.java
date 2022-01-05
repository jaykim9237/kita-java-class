package day02;

/*import java.lang.* 근데 lang은 예외적으로 쓰지 않아도 돼 
왜냐하면 자바에서 쓰는 당연한 언어를 쓰겠다는 거라서 자연적으로 적용이 되어있어*/


public class OperationEx4 
{

	public static void main(String[] args) 
	{
		int fatherAge = 45;
		int motherAge = 47;

		char /*여기가 String이어야 오류가 생기지 않아*/ ch;
		ch = (fatherAge > motherAge) ? 'T'/*아빠가 연상이에요 이런 거는 문자열이라서 안돼 오류가 생겨*/ : 'F';

		System.out.println(ch);
	}
}
