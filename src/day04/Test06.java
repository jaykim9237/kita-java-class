package day04;

import java.util.Scanner;

public class Test06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �ظ� �Է��ϼ��� : ");
		int birth = sc.nextInt();

 //���뵿�� ��ȭ �����϶� ����...���߾�..
		
		String ddi = "�߸��Է��ϼ̽��ϴ�."; //null : ������ �������� �⺻��

		switch((birth-3)%12){
			case 1: ddi = "��";
				break;
			case 2: ddi = "��";
				break;
			case 3: ddi = "ȣ����";
				break;
			case 4: ddi = "�䳢";
				break;
			case 5: ddi = "��";
				break;
			case 6: ddi = "��";
				break;
			case 7: ddi = "��";
				break;
			case 8: ddi = "��";
				break;
			case 9: ddi = "������";
				break;
			case 10: ddi = "��";
				break;
			case 11: ddi = "��";
				break;
			case 12: ddi = "����";
				break;

			}//switch

		System.out.printf("�Է��Ͻ� %d���� ��� %s�Դϴ�.%n", birth, ddi);

	}
}
