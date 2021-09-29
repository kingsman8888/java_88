package ch13;

//ch09 06 복사
public class _06_Member {

	private int memberID; // 회원 아이디
	private String memberName; // 회원 이름

	// 매개변수 생성자
	public _06_Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	// getter setter
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
	public String toString() { // Object.toString() => 주소값 출력
		return memberName + "회원님의 아이디는 " + memberID + " 입니다.";
	}

}
