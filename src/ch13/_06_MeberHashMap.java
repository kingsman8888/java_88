package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//ch09 06 복사
public class _06_MeberHashMap {

	private HashMap<Integer, _06_Member> map;

	public _06_MeberHashMap() {
		map = new HashMap<Integer, _06_Member>();

	}

	// 회원추가
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

		while (ir.hasNext()) {
			int key = ir.next(); // 입력을 받아서 key에 담자
			_06_Member member = map.get(key); // key의 값을 get으로 가져온다.
			System.out.println(member);
		}

	}
	
	//위는 add를 사용하여 추가 
	//create()를 이용하는 새로운 회원정보 추가 방법
	// 매개변수로 멤버의 멤버로 가져온다 
	
	public int create(_06_Member member) {
		// Optional : null처리를 직접하지 않고 Optional 클래스에 위임하기 위해 사용
		// 개발자가 직접 처리 하지 않고 Optional클래스가 판단해서 처리(많이 사용)
		// ()에 들오올 값을 ofNullable판단하겠다.
		// key 회원 ID가 null이면 
		Optional.ofNullable(map.get(member.getMemberID()))
				.ifPresent(tragetMember-> { // ifPresent 현재 존재하는지 의미
					throw new _06_MemberIdDupExeption("이미 존재하는 회원입니다.");
				});
			
			
		
		map.put(member.getMemberID(), member); //map.put(key, value)
		return member.getMemberID(); // 생성시점에 키값을 리턴
	}
	
	//한명의 회원 정보를 조회  
	// 매개변수로 넘어온 이름과 멤버변수에 있는 3명의 정보와 같은지 확인 (filter로 조건이 일치하는지)
	public List<_06_Member> selectByName(String name){
		return map.values().stream().filter(member -> member.getMemberName().equals(name)).collect(Collectors.toList());
	}
	
	//한명의 회원 정보를 아이디로 조회
	public _06_Member selectByID(int id){
		return map.get(id);
				
				
	}
}
