package day14.collection;

import java.util.ArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		ArrayList<Member> member = new ArrayList<Member>();
		
		member.add(new Member(1001, "������"));
		member.add(new Member(1002, "�չα�"));
		member.add(new Member(1003, "�ڼ���"));
		//add�� ��ȯ Ÿ���� �����̾�!
		
		System.out.println(member);
		System.out.println("������ ���� :" + member.size());
		System.out.println("1���� ����" + member.get(1));
		System.out.println("1���� ��ʼ� ����" +member.remove(1));
		System.out.println(member);
		
		//��� ����� ��ȯ
		for(int i=0; i<member.size(); i++) {
			System.out.println(member.get(i));
		}
		for(Member m : member) {
			System.out.println("what");
			System.out.println(m);
		}
	}

}
