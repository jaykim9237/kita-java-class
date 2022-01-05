package day02;

public class ExplicitConversion 
{
	public static void main(String[] args) 
	{
		double dNum1 = 1.2;
		float fNum2 = 0.9F;

		int iNum3 = (int)dNum1 + (int)fNum2; //혼자 이해 다시해보기 전부
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
