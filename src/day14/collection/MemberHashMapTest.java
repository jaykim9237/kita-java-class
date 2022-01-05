package day14.collection;

import java.util.HashMap;
import java.util.Set;

public class MemberHashMapTest {

	public static void main(String[] args) {
			//Ű�� ����� �� �ΰ��� �޾�
			HashMap<Integer, Member> member = new HashMap<Integer, Member>();
			
			member.put(1001, new Member(1001, "������"));
			member.put(1002, new Member(1002, "�ڼ���"));
			member.put(1003, new Member(1003, "�չα�"));
			
			System.out.println(member);
			System.out.println(member.get(1001));
			System.out.println(member.remove(1003));
			System.out.println(member);
			
			System.out.println();
			Set<Integer> keys =member.keySet();
			for(Integer key : keys) {
				System.out.println(key + ":" + member.get(key));
			}
	}

}
