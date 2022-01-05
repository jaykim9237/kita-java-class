package day14.collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSetTest {

	public static void main(String[] args) {
		HashSet<Member> member = new HashSet<Member>();	
		member.add(new Member(1001, "이지원"));
		member.add(new Member(1002, "손민국"));
		member.add(new Member(1003, "박서원"));
		
		System.out.println(member);
		//System.out.println(member.get(1));  //에러
		
		member.add(new Member(1001, "홍길동"));
		System.out.println(member);
		
		//여기는 위치값이 아니고 그 값이야, 만약에 삭제를 하고 싶으면 동일한 데이터를 적어줘야해
		System.out.println(member.remove(1));
		
		
		System.out.println(member.remove(new Member(1003, "박서원")));
		System.out.println(member);
		
		//데이터 순회 포이치를 쓸 수 있어 그런데 데이터 값을 사용하는 인덱스는 사용할 수 없어 
		for(Member m :member) {
			System.out.println(m);
		}
		System.out.println();
		
		//커서로 있냐고 물어봐서 해즈넥스트로 뒤에 값이 있는지 물어봐 있어면 실행해서 나오고 아니면 화일문을 나가는 것이지 
		Iterator<Member> i = member.iterator();
		while(i.hasNext()) {
			Member m = i.next();
			System.out.println(m);
		}
	}

}
