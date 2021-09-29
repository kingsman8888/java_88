package ch10;

import java.util.ArrayList;

public class _11_MyStack { // push, pop 구현
	
	/*
	 * 스택은 상자를 쌓듯이 잘를 관리하는 방식
	 * 자료추기(push), 자료삭제(pop)
	 * 자료를 꺼낼시 맨 나중에 추가된 데이터를 먼저 꺼내는 LIFO 방식
	 * stack에서 가장 최근에 추가된 자료의 위치를 top이라 한다.
	 * statck은 가장 최근에 추가된 자료부터 반환을 한다.
	 * 가장 최근 검색어나 장기,체스같은 게임에서 무를 때도 응용가능.
	 */

	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data); // 스택의 맨 뒤에 요소를 추가 top
	}

	public String pop() { // 스택의 맨 뒤에 요소를 꺼낸다.
		int len = arrayStack.size(); // ArrayList에 저장된 유효한 자료의 개수
		if (len == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return arrayStack.remove(len-1); // 맨뒤에 있는 자료를 반환하고 배열에서 제거
	}
}
