package ch14;

// 2) Runnable 인터페이스를 구현하는 방법
public class _02_MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 11; i++) {

			System.out.println(i + "");
		}

	}
}
