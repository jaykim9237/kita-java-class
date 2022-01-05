package Stream;

public class TravelCustomer implements Comparable<TravelCustomer>{
	private String name;
	private int age;
	private int price;
	
	
	public TravelCustomer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public int getPrice() {
		return price;
	}

	public String toString() {
		return "name : " + name +"age :" + age + "price : " +price;
	}


	@Override
	public int compareTo(TravelCustomer o) {
		return age - o.age;
	}
	
}

