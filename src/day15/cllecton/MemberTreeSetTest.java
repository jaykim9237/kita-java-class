package day15.cllecton;

import java.util.TreeSet;

import day14.collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		TreeSet<Member> ts = new TreeSet<Member>();
		ts.add(new Member(1001, "������"));
		ts.add(new Member(1002, "�չα�"));
		ts.add(new Member(1003, "�ڼ���"));
		
		System.out.println(ts);
		
	}
}
