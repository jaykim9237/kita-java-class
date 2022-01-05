package day12.shipping;

//물류회사에서 관리하는 각종 운송 수단들을 등록/관리
//싱글턴 페턴을 적용
public class Company {
	
	private static Company instance = new Company();
	private Vechicle [] fleet;
	private int v_num = 0;
	
	private Company() {
		fleet = new Vechicle[10];
	}
	
	public static Company getinstance() {
		return instance;
	}

	public void addVehicle(Vechicle v) {
		fleet[v_num++] = v;
	}
	
	public Vechicle getVehicle(int index) {
		return fleet[index];
		//큰일났다,,, 뭐하ㅡㄴ지 하나도 모르겠어...
	}
	
	public int getFleetSize() {
		return v_num;
	}
}
