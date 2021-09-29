package ch13;

import java.util.ArrayList;
import java.util.List;
//482page
public class _05_TravelStreamMain {
	public static void main(String[] args) {

		/*
		 * 예제 시나리오 고객명단을 출력합니다. 여행의 총 비용을 계산합니다. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.
		 * 
		 */

		// 고객생성
		_05_TravelCostomer lee = new _05_TravelCostomer("이순신", 40, 100);
		_05_TravelCostomer kim = new _05_TravelCostomer("김유신", 20, 50);
		_05_TravelCostomer hong = new _05_TravelCostomer("홍길동", 13, 50);

		// Array 리스트 생성
		List<_05_TravelCostomer> list = new ArrayList<_05_TravelCostomer>();

		// 고객추가
		list.add(lee); // ArrayList에 이순신 고객 정보 추가(멤버변수)
		list.add(kim); // ArrayList에 김유신 고객 정보 추가(멤버변수)
		list.add(hong); // ArrayList에 홍길동 고객 정보 추가(멤버변수)

		// 고객 정보명단 (이름,나이,금액) 전체
		System.out.println("=== 고객 명단 추가된 순서대로 정렬하여 출력 ===");
		// List 참조변수 스트림생성.map() 중간연산.forEach() 최종연산
		// map() - 클래스가 가진 자료중 이름만 출력하는 경우 사용
		list.stream().map(c -> c.getName()).sorted().forEach(s -> System.out.print(s + " "));
		// c 참조변수 주소값을 넘겨서 메서드 접근

		System.out.println("");
		// 스트림생성은 참조변수
		// 스트림 생성 // mapToint중간연산 // 최종연산 sum();
		System.out.println("=== 고객명단의 총 여행비용 합계 출력 ===");
		// mapTotint() : map의 값 price를 int형으로 변환
		int Total = list.stream().mapToInt(d -> d.getPrice()).sum();
		System.out.println("총 여행 경비는 " + Total + " 입니다.");

		System.out.println("=== 20세 이상 고객 정보를 정려해서 출력 ===");
		// 스트림생성 . filter(). map(). sorted() 중간연산 . forEach 최종연산.
		// filter() : 조건을 넣고 조건이 참인 경우만 요소를 추출 //이름 추출후 정렬 최종연산
		list.stream().filter(e -> e.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.print(s));

	}
}
