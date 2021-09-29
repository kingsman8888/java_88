package ch10;

import java.util.Iterator;
import java.util.TreeMap;

//443page
public class _18_MemberTreeMap {
	
	private TreeMap<Integer,_18_Member> treeMap;
	
	public _18_MemberTreeMap() {
		treeMap = new TreeMap<Integer,_18_Member>();  //디폴트생성자에서 인스턴스 생성
	}
	
	public void addMember(_18_Member member) { //회원추가 put(key-vale) 쌍으로 추가
		treeMap.put(member.getMemberId(), member); 
	}
	
	public boolean removeMmeber(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);  //key값에 맞는 자료 삭제
			return true;
		}
		System.out.println("존재 하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			_18_Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
	}
