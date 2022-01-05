package day14.collection;

import java.util.ArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		ArrayList<Member> member = new ArrayList<Member>();
		
		member.add(new Member(1001, "이지원"));
		member.add(new Member(1002, "손민국"));
		member.add(new Member(1003, "박서원"));
		//add의 반환 타음은 블리언이야!
		
		System.out.println(member);
		System.out.println("원소의 개수 :" + member.size());
		System.out.println("1번방 원소" + member.get(1));
		System.out.println("1번방 우너소 삭제" +member.remove(1));
		System.out.println(member);
		
		//모든 우원소 순환
		for(int i=0; i<member.size(); i++) {
			System.out.println(member.get(i));
		}
		for(Member m : member) {
			System.out.println("what");
			System.out.println(m);
		}
	}

}
