package day05;

public class TTest01Answer{
	public static void main(String[] args) 
	{
		int num1;
			for (num1 = 0; num1 < 10 ; num1++)
			{System.out.print(num1 +" ");
			}
		System.out.println(" ");

			for (num1 = 1; num1 <= 10 ; num1++ )
			{System.out.print(num1 +" ");
			}
		System.out.println(" ");

			for (num1 = 1; num1 <= 10 ; num1 *= 2 )
			{System.out.print(num1 +" ");
			}
		System.out.println(" ");

			for (num1 = 1; num1 <=10 ; num1 += 2)
			{System.out.print(num1*2 +" ");
			}
		System.out.println(" ");

			for (num1 = 1; num1 <=10 ; num1++)
			{System.out.print(num1*10 +" ");
			}
		System.out.println(" ");

			for (num1 = 5; num1 >=1 ; num1--)
			{System.out.print(num1 +" ");
			}
		System.out.println(" ");

			for (num1 = 10000; num1 >=1 ; num1/=10)
			{System.out.print(num1 +" ");
			}
	}
}
