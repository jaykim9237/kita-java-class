package day05;

public class Test03Answer //다 못 받아적움

{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5 ; i++)
			{ for (int k=i; k<=i+4 ; k++)
				{System.out.print(k + " ");
				}//inner for
			System.out.println();
			}//outer for

			System.out.println("----------");

		for (int i=0; i<=4 ; i++)
			{ for (int k=0; k<=i ; k++)
				{System.out.print(k + " ");
				}//inner for
			    System.out.println();
			}//outer for

			System.out.println("----------");

		for (int i=1; i<=5 ; i++)
			{ for (int k=i; k<=5 ; k++)
				{System.out.print(k + " ");
				}//inner for
			    System.out.println();
			}//outer for

			System.out.println("----------");

		for (int i=1; i<=5 ; i++){ 
			for (int k=1; k<=5 ; k++)
				{
			System.out.print(k + " ");
				}//inner for
			    System.out.println();
			}//outer for
	}
}
