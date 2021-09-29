package ch09;

public class _04_Main {
	
	public static void main(String[] args) {
		//회원 추가하기 위해 힙메모리 등록
		_04_MemberArrayList memberlist = new _04_MemberArrayList();
		
		//매개변수 생성자 호출 -> 멤버변수에 전달
		_04_Member lee = new _04_Member(1001,"이지원"); // lee에 주소값 100
		_04_Member son = new _04_Member(1002,"손민국"); // son에 주소값 200
		_04_Member park = new _04_Member(1003,"박서훤"); // park에 주소값 300
		_04_Member hong = new _04_Member(1004,"홍길동"); // hong에 주소값 400
		
		
		
		//회원추가
		memberlist.addMember(lee);
		memberlist.addMember(son);
		memberlist.addMember(park);
		memberlist.addMember(hong);// hong에 주소값 400
		
		memberlist.removeMember(hong.getMemberID());
		
		// 회원정보 출력
		memberlist.showAllMember();
	}

}
