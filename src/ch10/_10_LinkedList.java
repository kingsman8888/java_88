package ch10;

import java.util.LinkedList;

// LinkedList 클래스 사용하기
// 416page
public class _10_LinkedList {

	public static void main(String[] args) {
		
		// 사용하는 자료의 변동(삽입,삭제)이 많은 경우에 사용

		LinkedList<String> myList = new LinkedList<String>();
		
		// 링크드 리스트에 요소추가
		myList.add("A");   // 자료형 LinkedList<String>
		myList.add("B");  
		myList.add("D");
		
		System.out.println("myList 리스트 전체출력 : " + myList); 
		// myList 리스트 전체출력 : [A, B, D]
		myList.add(2,"C");
		System.out.println("myList 2위치 추가 : " + myList );
		// myList 2번에 추가 : [A, B, C, D]
		
		myList.addFirst("0");
		System.out.println("myList 맨앞에 0 추가 : " + myList);
		//myList 맨앞에 0 추가 : [0, A, B, C, D]
		myList.addLast("5");
		System.out.println("myList 맨앞에 5추가 :  " + myList);
		//myList 맨앞에 5추가 :  [0, A, B, C, D, 5]
		myList.remove(1);
		System.out.println("myList 1위치 삭제 : " + myList);
		// myList 1번 삭제 : [0, B, C, D, 5]
		myList.removeFirst();
		myList.removeLast();
		System.out.println("myList 첫번재,마지막 삭제 : " + myList);
		//myList.add(4, " "); 오류 발생 IndexOutOfBoundsException
	}
}
