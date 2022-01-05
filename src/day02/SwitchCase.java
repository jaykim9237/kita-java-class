package day02;

public class SwitchCase
{
	public static void main(String[] args) 
	{
		int ranking = 1;
		char medalColor;
		switch(ranking){
			case 1 : medalColor = 'G';
					break;
			case 2 : medalColor = 'S';
					break;
			case 3 : medalColor ='B';//만약에 int가 3인데 브레이크가 2에 있으면 어떻게해?

					break;
			default:
					medalColor = 'A';
		}//switch

		System.out.println(ranking + "등 메달의 색깔은 " +medalColor + "입니다.");
	}
}
