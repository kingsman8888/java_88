package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_ArraryList {
	public static void main(String[] args) {
		
		// 기존 선언
		// String[] arr = new int[3];
		// ===== ArrayList
		// 클래스명 참조변수 = new 클래스명();
		// 어떤 자료형을 표현해줘야한다. <> 안에 자료형을 넣는다. <> 다이아몬드 연산자 390page
		// 자바에서 제공하기 때문에 import 한다.
		// 객체형이기 때문에 클래스만 들어간다. int형은 Integer 	
		ArrayList<String> list = new ArrayList<String>();    // ArrList는 클래스이다.
		
		//추가 : add ()메서드
		list.add("살치살");   // 0번째
		list.add("주먹고기");  // 1번째
		list.add("돼지갈비");  // 2번째
		list.add("삼겹살");
		list.add(0, "갈비살");  // 0번째로 들어가라 <갈비살 살치살 주먹고기 돼지갈비 삼겹살>
		list.add(1, "바나나우유"); // 인덱스값이 우선이다. <갈비살 바나나우유 살치살 주먹고기 돼지갈비 삼겹살>
		list.add(2, "떡볶이"); // 인덱스값이 우선이다.  앞 인덱스는 해당위치에 추가 나머지는 뒤로 밀려난다.
		list.set(2, "어묵");  // 해당위치의 값이 변경된다.
		list.set(0, "포카리스웨트");
		list.remove(2);
		
		// 방법1. for문
		System.out.println("=== 방법1. for문 ===");
		for (int i = 0; i<list.size(); i++) {
			System.out.print(" " + list.get(i));  // 가져올때 key값;
			
		}
		System.out.println();
		// 방법2. 향상된 for문
		System.out.println("=== 방법2. 향상된 for문 ===");
		for (String str : list) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		// 방법3. 반복자(Iterator)사용하기
		System.out.println("=== 방법3. 반복자(Interator)사용하기 ===");
		
		/*
		 * 반복자(Interator)
		 * - 사용목적 : 반복자는 java.util 패키지에 정의되어 있는 Iteragtor 인터페이스를 구현하는 객체이다.
		 * 			즉 컬렉션의 원소들에 접근하는 것이 목적이다.
		 * 
		 * - 사용메서드
		 *  - hasNext() : 아직 접근하지 않은 요소가 있으면 true를 반환.
		 *  - next() : 다음 요소를 반환.. Object 타입으로 반환=> (어떤 요소가 올지 모르기때문)
		 *  - remove() : 최근에 반환된 요소를 삭제한다.
		 */
		
		//다형성적용 가능  부모 자식
		List<String> season = new ArrayList<String>();
		
		
		season.add("봄");
		season.add("여름");
		season.add("가을");
		season.add("겨울");
		//모든 자료형의 부모는 Object
		
		//Iterator 인터페이스 참조형 참조변수를 통해 메서드를 접근 hasNext() 가지고있기대문에
		
		Iterator<String> interator = season.iterator(); // 인터페이스기 때문에 생성 불가 // import
		// 인터페이스에서 가지고 있는 메서드를 접근하기 위해 선언 후에 참조변수를 통해 접근
		// 값이 존재하는 동안 이동해 가면서 출력 (값이 존재하는동안) 
		// ArrayList의 값이 존재하는지 체크, 리턴타입이 boolean;
		while(interator.hasNext()) { // interator가지고 있는 메서드를 참조변수로 접근
			 // String str = (String)Object; 명시적 형변환 // Objest형 자료형 => interator.next(); 큰자료형에서 작은 String으로 가기때문에 오류발생
			String str = (String)interator.next(); //interator.next()는 Object형을 반환.. 봄      //첫번째값 // interator.next(); -> 콘솔창 nextInt와 동일. 다음 값이 존재하니 그 값을 가지고 와라.
				System.out.print(str + "");
			}
		
			System.out.println("");
			System.out.println("=====");
			
		
		List<String> dream = new ArrayList<String>();
		
		// 1. add 값을 추가
		dream.add("자산가");
		dream.add("개발자");
		dream.add("건물주");
		dream.add("파일럿");
		dream.add("레이서");
		
		// 2. 값이 있는동안 돌도록   iterator 메서드를 사용위해 참조변수로 접근
		Iterator<String> iter = dream.iterator();
		
		while(iter.hasNext()) { // 값이 있으면 받겠다.
			String d = (String)iter.next();  // 값을 읽어서 해당값을 d로 넣어라. 리턴값으로 형변환을 해준다.
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
	}
}
