package ch14;

public class _02_ThreadMain {

	public static void main(String[] args) {
		
		/*
		 * [면접]
		 * Thread 생성과 실행
		 * 2) Runnable 인터페이스를 구현하는 방법
		 * 
		 * 1. Runnable 인터페이스를 implements 받아서 클래스를 작성한다.
		 * 2. run() 메서드를 재정의(Override) 한다.
		 * 3. main() 메서드에서 Thread 객체를 생성한다, 이때 implements 받은 클래스 객체를 매개변수로 전달한다.
		 * 4. start() 메서드를 호출해서 스레드를 실행한다.	 ( 호출은 start)로한다.
		 * 5. run() 메서드가 실행된다.
		 */
		 
		
		Thread Thread = new Thread(new _02_MyThread());
		
		Thread.start();
	}
}
