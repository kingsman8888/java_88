package ch14;

public class _03_MyRunnableMain {
	public static void main(String[] args) {
		
		
		// 2개의 스레드  A B
		
		_03_MyRunnable t1 = new _03_MyRunnable("A");
		_03_MyRunnable t2 = new _03_MyRunnable("B");
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
	}

}
