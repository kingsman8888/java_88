package ch14;

// 2) Runnable 인터페이스를 구현하는 방법
public class _03_MyRunnable implements Runnable {

	// 멤버변수
	private String threadName;

	// 디폴트 생성자
	public _03_MyRunnable() {
	}

	// 매개변수 생성자
	public _03_MyRunnable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		// A10 A9 ...A1
		// B10 B9 ...B1

		for (int i = 10; i >0; i--) {
			System.out.print(threadName + i + "");
		}

	}

}
