package day.testreview;

//p551
class Person{
	String name;
	String job;
}

public Person impliments Seri () {}
//��... ��¥ ���� ��Ա� ������...
public Person(String name, String job) {
	this.name = name;
	this.job = job;
}

@Override
	public String toString() {
		return name + "," + job;
	}

public class SerializaionTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person PersonAhn = new Person("�����", "��ǥ�̻�");
		Person Personkim = new Person("�����", "��ǥ�̻�");
		
		try(FileOutputStream fod = new File)
	}

}
