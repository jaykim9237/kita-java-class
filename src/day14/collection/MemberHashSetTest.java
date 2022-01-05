package day14.collection;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSetTest {

	public static void main(String[] args) {
		HashSet<Member> member = new HashSet<Member>();	
		member.add(new Member(1001, "������"));
		member.add(new Member(1002, "�չα�"));
		member.add(new Member(1003, "�ڼ���"));
		
		System.out.println(member);
		//System.out.println(member.get(1));  //����
		
		member.add(new Member(1001, "ȫ�浿"));
		System.out.println(member);
		
		//����� ��ġ���� �ƴϰ� �� ���̾�, ���࿡ ������ �ϰ� ������ ������ �����͸� ���������
		System.out.println(member.remove(1));
		
		
		System.out.println(member.remove(new Member(1003, "�ڼ���")));
		System.out.println(member);
		
		//������ ��ȸ ����ġ�� �� �� �־� �׷��� ������ ���� ����ϴ� �ε����� ����� �� ���� 
		for(Member m :member) {
			System.out.println(m);
		}
		System.out.println();
		
		//Ŀ���� �ֳİ� ������� ����ؽ�Ʈ�� �ڿ� ���� �ִ��� ����� �־�� �����ؼ� ������ �ƴϸ� ȭ�Ϲ��� ������ ������ 
		Iterator<Member> i = member.iterator();
		while(i.hasNext()) {
			Member m = i.next();
			System.out.println(m);
		}
	}

}
