package day14.generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPinter<Powder> powderPrinter = new GenericPinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		//���࿡ �̷����� �ö��ƽ�� ������ ������ ����°ž� ��Ÿ���� �ƴϰ� �������� ��
	}
	
	//��ݾ��� ��Ʈ���� ���ü��� ���ݾ� �׷��� �ȵ��� �츮�� �Ŀ�� �̰ų� �ö�ƽ�̾���� �׷��ϱ� �������� �� �ִ°ž�. Ư�� Ʋ������ ������ �ϰ���� �� extends�� ����ϴ°���
	//������ ���ž� �ֳ��ϸ� ���͸����� ������ �ȴ��̱� ������ 
	//GenericPinter<String> p = new GenericPinter<String>();
}
