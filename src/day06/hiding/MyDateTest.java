package day06.hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate(2021, 11, 30);
		System.out.printf("%d�� %d�� %d��%n",md.getYear(), md.getMonth(), md.getDay());
		System.out.println(md);
		
		md.setDay(29);//��ȿ�� ���� �ƴ��ݾ� 32�� �����ϱ� , ������ ���� �����ڸ� ���������°��� �װ� get, set
		System.out.printf("%d�� %d�� %d��%n",md.getYear(), md.getMonth(), md.getDay());
		
	}

}
