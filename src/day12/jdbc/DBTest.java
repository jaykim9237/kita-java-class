package day12.jdbc;

public class DBTest {

	public static void main(String[] args) {

		MyDB db = new MyDB();
		Query sql = db.getQuery();
		System.out.println(sql.selectQuery());
	}

}
