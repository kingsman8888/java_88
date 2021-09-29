package ch10;

import java.util.ArrayList;

//420page ArrayList로 큐 구현하기
public class _12_MyQueue {
	
	/*
	 * 가장많이 사용하는 자료구조 선착순
	 * 줄을 선 대기열처럼 먼저 추가된 데이터부터 꺼내서 사용하는 방식 FIFO
	 */

	private ArrayList<String> arrayQueue = new ArrayList<String>();

	public void enQueue(String data) {
		arrayQueue.add(data); // 큐의 맨 뒤에 추가
	}

	public String dQueue() { // 큐의 맨 앞에서 꺼낸다.

		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		return arrayQueue.remove(0); // 맨앞의 자료를 반환하고 배열에서 제거

	}

}
