package day02;

/*import java.lang.* �ٵ� lang�� ���������� ���� �ʾƵ� �� 
�ֳ��ϸ� �ڹٿ��� ���� �翬�� �� ���ڴٴ� �Ŷ� �ڿ������� ������ �Ǿ��־�*/


public class OperationEx4 
{

	public static void main(String[] args) 
	{
		int fatherAge = 45;
		int motherAge = 47;

		char /*���Ⱑ String�̾�� ������ ������ �ʾ�*/ ch;
		ch = (fatherAge > motherAge) ? 'T'/*�ƺ��� �����̿��� �̷� �Ŵ� ���ڿ��̶� �ȵ� ������ ����*/ : 'F';

		System.out.println(ch);
	}
}
