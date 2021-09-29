package ch09;

import java.util.HashMap;

public class _05_HashMap {
	
	/*
	 * [면접] 439page
	 * 해싱(hasing) : 키를 이용해서 해시테이블로부터 데이터를 가져오는 과정
	 * 
	 * 
	 * HashMap
	 * 1) 특징
	 * 	- 데이터의 순서르 ㄹ보장하지 않는다.
	 *  - key와 value 쌍으로 저장한다.
	 *  - key는 중복되면 않된다.
	 *  - key를 이용해서 value를 가져 올 수 있다.
	 *  - List 계열과 달린 index가 없ㄴ다.
	 *  - Map라는 인터페이스를 구현한 클래스이다.
	 *  
	 *  2) 선언
	 *  - HashMapkey<key 타입, value타입> map = new HashMap <key 타입, value타입>;
	 *  - Map<key 타입, value타입> map = new HashMap <key 타입, value타입>();// 다형성 적용
	 *  
	 *  3) 메서드
	 *  - 데이터 추가 : put(key, value);
	 *  - 데이터 가져오기 : get(key);
	 *  - 데이터 삭제 : remove(key);
	 *  - 데이터가 비어있는지 여부: isEmpay();
	 *  - 해당키가 있는지 여부 : containsKey(key);
	 *  - 해당 값이 있는지 여부 : containsValue(value);
	 *  - 해당 갯수 : size()
	 *  
	 */
	
	public static void main(String[] args) {
		
		// map 생성
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			
		// 데이터 추가 : put(key, value); 
			map.put(0, "김소현");
			map.put(1, "정우성");
			map.put(2, "송승헌");
			map.put(3, "박명수");
			map.put(4, "강부자");
			
		for (int i=0; i<map.size(); i++) {
			System.out.print(map.get(i));
		}
		
		System.out.println("444");
		
		// 데이터 가져오기 : get(key)
		System.out.println(map.get(4));
		
		// - 해당 갯수 : size()
		System.out.println("삭제 전 map size =>" + map.size());
		// 데이터 삭제 : remove(key)
		map.remove(3);
		System.out.println("삭제 후 map size =>" + map.size());
		// map 전체 출력
		for (int i = 0; i<=map.size(); i++) {
			System.out.print(map.get(i));  
		}  // 김소현정우성송승헌null강부자 // 중간 삭제시 데이터가 당겨지지가 않고 null로 초기화된다.
		System.out.println("");
		// 데이터가 비어있는지 여부 : isEmpay();
		System.out.println(map.isEmpty());
		
		
		
		System.out.println();
		System.out.println("===== 해당 키가 있는지 여부 containsKey(); ==== ");
		System.out.print(map.containsKey(0)+ " ");// 
		System.out.print(map.containsKey(1)+ " ");// 
		System.out.print(map.containsKey(2)+ " ");// 
		System.out.print(map.containsKey(3)+ " ");// 
		System.out.print(map.containsKey(4)+ " ");// 
		
		System.out.println("");
		System.out.println("===== 해당 값이 있는지 여부 containsValue(); ==== ");
		System.out.print(map.containsValue("김소현")+ " ");// 
		System.out.print(map.containsValue("정우성")+ " ");// 
		System.out.print(map.containsValue("송승헌")+ " ");// 
		System.out.print(map.containsValue("박명수")+ " ");// 
		System.out.print(map.containsValue("강부자")+ " ");// 
		
		System.out.println("==== 해당 갯수 : size()");
		System.out.println(map.size());
		
		
		
		
		
	}
	
		
	
		
	
	
	
	
		
		
		
		
	
		
		

}
