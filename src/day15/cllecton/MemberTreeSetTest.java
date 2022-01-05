package day15.cllecton;

import java.util.TreeSet;

import day14.collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		TreeSet<Member> ts = new TreeSet<Member>();
		ts.add(new Member(1001, "이지원"));
		ts.add(new Member(1002, "손민국"));
		ts.add(new Member(1003, "박서원"));
		
		System.out.println(ts);
		
	}
}
