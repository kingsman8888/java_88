package ch09;

import java.util.HashMap;
import java.util.Iterator;

public class _06_MeberHashMap {
	
	private HashMap<Integer, _06_Member> map; 
	
	public _06_MeberHashMap() {
		map = new HashMap<Integer, _06_Member>();
		
	}
	
	//회원추가
	public void addMember(_06_Member member) {
		map.put(member.getMemberID(), member); // key는 Id value는 Id와 name;
	}
	
	public boolean removeMember(int memberId) {
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			return true;
		}
		System.out.println(memberId + "존재 하지 않습니다.");
		return false;
	}	
		
	public void showAllMember() {
		Iterator<Integer> ir = map.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();  //입력을 받아서 key에 담자
			_06_Member member = map.get(key);  // key의 값을 get으로 가져온다.
			System.out.println(member);
		}
		
		
		
		
	}
	

}
