package day12.shipping;

//����ȸ�翡�� �����ϴ� ���� ��� ���ܵ��� ���/����
//�̱��� ������ ����
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
		//ū�ϳ���,,, ���ϤѤ��� �ϳ��� �𸣰ھ�...
	}
	
	public int getFleetSize() {
		return v_num;
	}
}
