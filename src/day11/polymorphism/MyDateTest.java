package day11.polymorphism;

public class MyDateTest {

	public static void main(String[] args) {
		//����Ʈ�� �ż��带 ��Ʈ��Ŭ������ �°� �������̵� , �����Ǹ� �߱� �����̾� 
		String s1 = new String("hello");
		System.out.println(s1);
		String s2 = new String("hello");
		//?? ����Ʈ���� ����?
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		
		
		
		MyDate md1 = new MyDate(2021, 12, 8	);
		MyDate md2 = new MyDate(2021, 12, 8	);
		//������ �� ��η� ������ �̰Ŵ� ��¥�� �ȳ����� �������� ���°���? �ƴ� ��� ���°���? ������Ʈ���� �°��� ! ���� Ŭ������ �������� ������ �־���ϴ� ���� ������ �־� ������Ʈ��
		System.out.println(md1.toString());
		//���� �����ϱ� �������� �ٸ����� ! �Ź� ���ο� �޸𸮸� ����Ŵϱ� 
		//���࿡ ���� �Ϸ��� ���̵���Ʈ�� �°Բ� ������ ������� 
		System.out.println(md1.equals(md2));
		
		
		

	}//main

}
