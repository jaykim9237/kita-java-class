package day12.jdbc;

public class MyDB {
	private Query q;
	
	public MyDB() {
		//사용하고자 하는 DB의 드라이버 로딩
		q = new Oracle();
	}

	public Query getQuery() {
		return q;
	}
}
