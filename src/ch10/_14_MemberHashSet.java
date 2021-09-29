package ch10;

import java.util.HashSet;
import java.util.Iterator;

// 424pages HashSet을 활용한 회원관리 프로그램 구현하기
public class _14_MemberHashSet {

	private HashSet<_14_Member> hashSet; // HashSet  선언

	public _14_MemberHashSet() {
		hashSet = new HashSet<_14_Member>(); // HashSet 생성
	}

	public void addMember(_14_Member member) { // Hash 회원추가  참조변수로 추가
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) { // 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
		Iterator<_14_Member> ir = hashSet.iterator(); // Iterator로 순회를 한다

		while (ir.hasNext()) { // 값이 존재하면 true를 넘긴다 없으면 false
			_14_Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true; // 함수종료
			}
		}
		System.out.println(memberId + " 회원이 없습니다.");
		return false;
	}

	public void showAllMember() { // 모든 회원 출력
		for (_14_Member member : hashSet) {
			System.out.println(member);
		}
	}

}
