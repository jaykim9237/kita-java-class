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
			case 3 : medalColor ='B';//���࿡ int�� 3�ε� �극��ũ�� 2�� ������ �����?

					break;
			default:
					medalColor = 'A';
		}//switch

		System.out.println(ranking + "�� �޴��� ������ " +medalColor + "�Դϴ�.");
	}
}
