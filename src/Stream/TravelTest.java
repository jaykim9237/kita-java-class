package Stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("==�� ���� �߰� �� ������� ���==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���� ����� :" + total + "�Դϴ�.");
		
		System.out.println("20�� �̻� �̻� �� ��� �����Ͽ� ���");
		customerList.stream().filter(c->c.getAge() >= 20).map(c -> c.getAge()).sorted().forEach(s->System.out.println(s));
		
		System.out.println("���̼����� �����غ���");
		/*customerList.stream().map(c->c.getAge()).forEach(s->System.out.println(s));*/
		customerList.stream().sorted((t1, t2) -> t1.getAge() - t2.getAge()).forEach(c->System.out.println(c));
		
		//�̹� ������ �Ǿ��ִµ� �ϳ� �� ������ �ϰ� ���� ���� ���ݾ� �׷�  �� ����ϴ� ���� ���о��� �Լ��� 
	}
	
	

}
