package ch14;

public class _01_ThreadMain {

	public static void main(String[] args) {

		/*
		 * [면접] Thread 문법 1) Thread 클래스를상속하기
		 * 
		 * 1. Thread 클래스를 상속 받아서 클래스를 작성한다. 
		 * 2. run() 메서드를 재정의(Override) 한다. 
		 * 3. main()  메서드에서 Thread 객체를 생성한다. 
		 * 4. start() 메서드를 호출해서 스레드를 실행한다. ( 호출은 start)로한다. 
		 * 5. run() 메서드가 실행된다.
		 * 
		 */

		_01_MyThread Thread = new _01_MyThread();
		// start(); 호출하면 Thread가 실행되면서 run();메서드를 호출된다.
		Thread.start();

	}

}
