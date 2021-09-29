package ch10;
//444page  TreeMap 활용하기
public class _18_MemberTreMapTest {
	
	public static void main(String[] args) {
		
		_18_MemberTreeMap memberHashMap = new _18_MemberTreeMap();
		
		_18_Member park =  new _18_Member(1003,"박서훤");
		_18_Member lee = new _18_Member(1001,"이지원");
		_18_Member hong = new _18_Member(1004,"홍길동");
		_18_Member son = new _18_Member(1002, "손민국");
		
		memberHashMap.addMember(park);
		memberHashMap.addMember(lee);
		memberHashMap.addMember(hong);
		memberHashMap.addMember(son);
		
		System.out.println("===삭제전 조회");
		memberHashMap.showAllMember();
		System.out.println("===1001 삭제후 조회");
		memberHashMap.removeMmeber(1001); // 회원아이디(key 값)가 1001회원 삭제
		memberHashMap.showAllMember();
	}

}
