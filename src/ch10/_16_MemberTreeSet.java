package ch10;
// 431page  TreeSet 활용하기
import java.util.Iterator;
import java.util.TreeSet;

public class _16_MemberTreeSet {
	
	private TreeSet<_16_Member> treeSet;
	
	public _16_MemberTreeSet() {
		
		treeSet = new TreeSet<_16_Member>();
	}
	
	public void addMember(_16_Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMeber(int memberId) {
		Iterator<_16_Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			_16_Member member = ir.next();
			
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
			System.out.println(memberId + "가 존재하지 않습니다.");
		}
		return false;
	}
	
	public void showAllMember() {
		for (_16_Member member : treeSet) {
			System.out.println(member);
		}
	}

}
