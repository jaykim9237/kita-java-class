package day14.collection;

//여기에 임플리먼트를 넣었을 때 오류가 났을거야 그때 ctrl 1을 눌러서 해결을 울러 오버라이딩 해주는 것이지 
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
	
	
	//동일성여부를 알기위해서 넣은 오버라이딩
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
		//스트링에 있는 것을 가져다 쓰는 것이야.. 스트링의 컴페어투를 가져다 쓰는 것이지 
	/*	return this.memberId - o.memberId;
		//오름차순으로 배열하는 것이야
		
		//비교해서 같으면 1을 들어온 것이 더 크면 음의 정수를 작으면 양의 정수를 값으로 나오면 되는 것이지 
		 * 
		 */
	}
	
	
	
}
