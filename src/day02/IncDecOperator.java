package day02;

class IncDecOperator 
{
	public static void main(String[] args) 
	{
		int i = 10, j = 5, k;
		k = ++i + j--;
		System.out.println("i=" +i+ "j=" +j+ ",k=" +k);
		k = i-- + --j;
		System.out.println("i=" +i+ "j=" +j+ ",k=" +k);

	}
}
