package ch14;
// 1) Thread 클래스를 상속하기
public class _01_MyThread extends Thread {
	
	/*
	 * 멀티태스킹 : 여러개의 어플리 케이션을 동시에 실행해서 컴퓨터 시스템의 성을을 높이기 위한 기법이다.
	 * 			태스크 : 하나의 업무처리 단위
	 * 			예) 음악을 들으면서 동시에 운동
	 * 			문서 편집하면서 인터넷에서 파일을 다운로드 
	 * 
	 * 멀티스레딩 : 병렬 작업을 하나의 어플리케이션 안에서 동시에 하는 것을 만한다.
	 * 			스레드 : 각각의 작업.. 실행흐름
	 * 
	 * 멀티스레딩의 장점
	 * - CPU의 사용률을 향상시킨다.
	 * - 자원을 보다 효율적으로 사용할 수 있다.
	 * - 사용자에 대한 응답성이 향상된다.
	 * - 작업이 분리되어 코드가 간결해진다.
	 * 
	 * Thread 문법
	 * 1) Thread 클래스를상속하기 - run() 메소드를 Override
	 * 2) Runnable 인터페이스를 구현하는 방법 - run() 메소드를 Override 
	 */

	// 1) Thread 클래스를 상속하기
	
	@Override
	public void run() {
		for (int i = 1; i<=10;i++) {
			
			System.out.println(i+ "");
		}
	}
	
}
