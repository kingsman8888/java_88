package ch09;

public class _08_Member {

	//멤버변수
	private int memberID;  //회원 아이디
	private String memberName; //회원 이름
	
	//매개변수 생성자
	public _08_Member(int memberID,String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	//getter setter
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	
	@Override
	public String toString() {   // Object.toString() => 주소값 출력
		return "이름 : " + memberName + ", 아이디 : " + memberID + " 입니다.";
	}
	
	
}
