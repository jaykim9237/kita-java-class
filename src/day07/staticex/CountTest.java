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
		Count c2 = new Count();//이때 카운트랑 실리알은 2  논스태틱은 1이야 왜냐하면 메모리로 가서 뉴로 새로 불러오는거니까 리셋된단말이야 새로 불러올때마다 0에서 시작되는거지 
		/*c2로 부를 수 있어 그런데 클래스로 부르기가 추천되는거지*/Count.counter++;//스태틱으로 선언된 아이들은 객체를 생성하지 않고도 사용이 가능한데 클래스의 이름으로 사용할 수 있어 
		Count c3 = new Count();//스태틱이 없으면 각각의 뉴는 독립적인거지!!! 그니까 논스택은 불러오면 그때그때 1이 되는거야 !!!
		
		System.out.println("c1.serialNumber = " + c1.serialNumber);//이제 와서 알 수 있는 것이 아웃도 스태틱인거야 시스템 클래스의 이름으로 불러 왔잖아 !!
		System.out.println("c2.serialNumber = " + c2.serialNumber);
		System.out.println("c3.serialNumber = " + c3.serialNumber);
		System.out.println("c2.nonStatNumber = " + c2.nonStatNumber);
		

	}

}
