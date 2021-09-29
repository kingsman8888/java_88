package ch10;
//432 page   TreeSet 활용하기
public class _16_MemberTreeSetTest {
	
	public static void main(String[] args) {
		
		_16_MemberTreeSet memberTreeSet = new _16_MemberTreeSet();
		
		_16_Member park = new _16_Member(1003,"박서훤");
		_16_Member lee = new _16_Member(1001,"이지원");
		_16_Member son = new _16_Member(1002,"손민국");
		
		
		
		memberTreeSet.addMember(park);
		memberTreeSet.addMember(lee);
		memberTreeSet.addMember(son);
	
		memberTreeSet.showAllMember();
		
		// TreeSet의 요소를 추가할때 어떤 기준비교하여 의무적으로 트리를 비교 구현해야한다.
		// 비교시 사용하는 인터페이스 Comparable 또는 Comparator (오름차순 정렬)
		
		
		// 오류발생 memberTreeSet.showAllMember();
		// _16_Member 클래스가 Comparable 인터페이스를 구현하지 않았다.
//		Exception in thread "main" java.lang.ClassCastException: ch10._16_Member cannot be cast to java.lang.Comparable
//		at java.util.TreeMap.compare(Unknown Source)
//		at java.util.TreeMap.put(Unknown Source)
//		at java.util.TreeSet.add(Unknown Source)
//		at ch10._16_MemberTreeSet.addMember(_16_MemberTreeSet.java:16)
//		at ch10._16_MemberTreeSetTest.main(_16_MemberTreeSetTest.java:16)
		System.out.println("========= ");
		_16_Member hong = new _16_Member(1003,"홍길동");
		
		memberTreeSet.addMember(hong);
		memberTreeSet.showAllMember();
	}

}
