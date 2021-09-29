package ch10;
//426page
// 순서도 없고 중복값도 없다.
public class _14_MemberHashSetTest {
	
	// equals() 메서드가 재정의 되어 있지 않으므로 주소값을 비교한다.
	// [1003, 박서훤]과 [1003,홍길동]의 값은 주소값이 다르므로 서로 다른 객체로 인식한다.
	// 따라서 HashSet은 중복값을 허용하지 않지만, 서로 다른 객채로 인식하므로 중복추가가된다.
	// 따라서 재정의를 하면 주소가 달라도 key(학번)이 동일하면 같은 데이터로 인식되어 중복 추가가 않된다.
	// String, Integer 데이터 의미 equals(), hashCode()가 재정의 되어 있으므로 같은 같은 중복추가가 않된다.
	
	
	public static void main(String[] args) {
		
		_14_MemberHashSet memberHashSet = new _14_MemberHashSet();
		
		_14_Member park = new _14_Member(1001,"이지원");
		_14_Member son = new _14_Member(1002,"손민국");
		_14_Member kang = new _14_Member(1003,"박서훤");
		
		memberHashSet.addMember(park);
		memberHashSet.addMember(son);
		memberHashSet.addMember(kang);
		
		memberHashSet.showAllMember();
		
		System.out.println("회원추가");
		_14_Member jang = new _14_Member(1003,"홍길동");
		
		memberHashSet.showAllMember();
		
	}
}
