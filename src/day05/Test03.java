package day05;

public class Test03 
{
	public static void main(String[] args) 
	{

     for (int i = 0 ; i <= 4 ; i++ )

		{for(int j = i + 1; j <= i + 5; j++)
			{System.out.print(j +" ");
			}//for1-2
			
			System.out.println(" ");
		}//for1-1


	System.out.println("----------");

	
	for (int k = 0; k < 5 ; k++)

		{for (int l = 0; l < 5 ; l++)//숫자 늘어나야해
			{ System.out.print(l + " ");
			}//for2-2-1

		 for (int m = 4 ; m < 0 ; m--)//공백을 만들거야
			{ System.out.print(" ");
			}//for2-2-2

		System.out.println(" ");
		}//for2-1
	}//main
}//class