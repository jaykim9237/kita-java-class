package day12.jdbc;

public class MyDB {
	private Query q;
	
	public MyDB() {
		//����ϰ��� �ϴ� DB�� ����̹� �ε�
		q = new Oracle();
	}

	public Query getQuery() {
		return q;
	}
}
