package day07.staticex;


class Count{
	public int serialNumber = 0;
	public static int counter = 0;
	public int nonStatNumber;
	
	public Count() {
		counter++;
		serialNumber = counter;
		nonStatNumber++;
	}
}

public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();//�̶� ī��Ʈ�� �Ǹ����� 2  ����ƽ�� 1�̾� �ֳ��ϸ� �޸𸮷� ���� ���� ���� �ҷ����°Ŵϱ� ���µȴܸ��̾� ���� �ҷ��ö����� 0���� ���۵Ǵ°��� 
		/*c2�� �θ� �� �־� �׷��� Ŭ������ �θ��Ⱑ ��õ�Ǵ°���*/Count.counter++;//����ƽ���� ����� ���̵��� ��ü�� �������� �ʰ� ����� �����ѵ� Ŭ������ �̸����� ����� �� �־� 
		Count c3 = new Count();//����ƽ�� ������ ������ ���� �������ΰ���!!! �״ϱ� ������ �ҷ����� �׶��׶� 1�� �Ǵ°ž� !!!
		
		System.out.println("c1.serialNumber = " + c1.serialNumber);//���� �ͼ� �� �� �ִ� ���� �ƿ��� ����ƽ�ΰž� �ý��� Ŭ������ �̸����� �ҷ� ���ݾ� !!
		System.out.println("c2.serialNumber = " + c2.serialNumber);
		System.out.println("c3.serialNumber = " + c3.serialNumber);
		System.out.println("c2.nonStatNumber = " + c2.nonStatNumber);
		

	}

}
