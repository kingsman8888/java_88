package ch10;
// 434 page  Comparable 인터페이스 구현하기
public class _16_Member implements Comparable<_16_Member>{
	
	/* Comparable 인터페이스
	 * - comparTo() 추상메서드가 포함
	 * - 오름차순으로 정렬을 한다.
	 * - 구현하는 클래스에스는 comparTo()메서드를 구현 재정의 해야한다
	 * 
	 */
	
	private int memberId;
	private String memberName;
	
	
	public _16_Member() {}
	
	public _16_Member(int memberId, String memberName) {
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
		return "memberId : " + memberId + ", memberName : " + memberName;
	}

	// 오름차순으로 정렬하기 위해 추상메서드를 재정의 한다.
	@Override
	public int compareTo(_16_Member member) {
		
		return (this.memberId - member.memberId);
	} // 매개변수를 통해서 생성시점에 들어온 정보과 기존에 있는 정보와 비교

}
