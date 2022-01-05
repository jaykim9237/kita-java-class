package day.testreview;

//p551
class Person{
	String name;
	String job;
}

public Person impliments Seri () {}
//하... 진짜 같이 밥먹기 싫은데...
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
		Person PersonAhn = new Person("안재용", "대표이사");
		Person Personkim = new Person("안재용", "대표이사");
		
		try(FileOutputStream fod = new File)
	}

}
