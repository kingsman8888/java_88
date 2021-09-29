package ch10;
//page 444 
public class _18_Member {
	
	private int memberId;
	private String memberName;
	
	
	public _18_Member() {}
	
	public _18_Member(int memberId, String memberName) {
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
		return  memberName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberId + "   " +  memberName;
	}

}
