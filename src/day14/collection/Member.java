package day14.collection;

//���⿡ ���ø���Ʈ�� �־��� �� ������ �����ž� �׶� ctrl 1�� ������ �ذ��� �﷯ �������̵� ���ִ� ������ 
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	@Override
	public String toString() {
		return String.format("[ID:%d, Name:%s]", memberId, memberName);
		
	
	
	}
	
	
	//���ϼ����θ� �˱����ؼ� ���� �������̵�
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memberId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memberId != other.memberId)
			return false;
		return true;
	}

	@Override
	public int compareTo(Member o) {
		
		return memberName.compareTo(o.memberName);
		//��Ʈ���� �ִ� ���� ������ ���� ���̾�.. ��Ʈ���� ��������� ������ ���� ������ 
	/*	return this.memberId - o.memberId;
		//������������ �迭�ϴ� ���̾�
		
		//���ؼ� ������ 1�� ���� ���� �� ũ�� ���� ������ ������ ���� ������ ������ ������ �Ǵ� ������ 
		 * 
		 */
	}
	
	
	
}
