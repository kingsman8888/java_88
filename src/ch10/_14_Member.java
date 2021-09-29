package ch10;
// 427page
// hashCode(), equals() 재정의
public class _14_Member {
	
	private int memberId;
	private String memberName;
	
	
	public _14_Member() {}
	
	public _14_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof _14_Member) {
			_14_Member mm = (_14_Member)obj;
			if (this.memberId == mm.memberId)
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() { // 메서드가 회원 아이디를 반환하도록 재정의
		return memberId;
	}
	
	@Override
	public String toString() {
		return "memberId : " + memberId + ", memberName: " + memberName;
	}

}
