package ch10;

// 419page ArrayList로 Stack 구현하기
public class _11_StackTest {

	/*
	 * 스택은 상자를 쌓듯이 잘를 관리하는 방식 자료추기(push), 자료삭제(pop) 자료를 꺼낼시 맨 나중에 추가된 데이터를 먼저 꺼내는
	 * LIFO 방식 stack에서 가장 최근에 추가된 자료의 위치를 top이라 한다. statck은 가장 최근에 추가된 자료부터 반환을 한다.
	 * 가장 최근 검색어나 장기,체스같은 게임에서 무를 때도 응용가능.
	 */

	public static void main(String[] args) {
		_11_MyStack stack = new _11_MyStack();

		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
