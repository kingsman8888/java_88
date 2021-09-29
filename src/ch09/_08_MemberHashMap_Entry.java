package ch09;

import java.util.HashMap;
import java.util.Map;

public class _08_MemberHashMap_Entry {
	public static void main(String[] args) {
		
		/*
		 * [시험]
		 */

		Map<String, _08_Member> map = new HashMap<String, _08_Member>();
		
		// HashMap에 멤버 정보 추가
		
		
		map.put("member001", new _08_Member(1001,"홍길동"));
		map.put("member002", new _08_Member(1002,"김철수"));
		map.put("member003", new _08_Member(1003,"김영희"));
		
		//순서대로 들어가지 않는다.
		// {member003=이름 : 김영희아이디 : 1003 입니다., member002=이름 : 김철수아이디 : 1002 입니다., member001=이름 : 홍길동아이디 : 1001 입니다.}
		// {key1=value1, key2=value2, key3=value3}
		
			//멤버 삭제
			// map.remove(key)
			map.remove("member002");  // key값을 넣는다.
		System.out.println(map);  //map.toString();
			//{member003=이름 : 김영희아이디 : 1003 입니다., member001=이름 : 홍길동아이디 : 1001 입니다.}

			//멤버변경
			map.put("member003", new _08_Member(1003,"정준하"));
			
			//멤버추가
			map.put("member004", new _08_Member(1004,"유재석"));
		System.out.println(map);
		
		//조회 - key, value
		// Map.Entry<String, _09_Member> => getKey(), getValue()를 가지고 있는 인터페이스
		// map.entrySet() : map에 포함된 매핑 정보를 돌려준다.  그래서 key value를 가져올수 있다.
		for ( Map.Entry<String, _08_Member> str : map.entrySet()) { // map.entrySet() 값을 가져온다.
			
			String key = str.getKey();
			_08_Member value = str.getValue();
			System.out.println("key " + key + ", value : " + value);
			
		}
		
	}
	

}
