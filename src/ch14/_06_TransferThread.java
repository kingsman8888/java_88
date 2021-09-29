package ch14;

//Thread 클래스를 상속 - 계죄이체 스레드
public class _06_TransferThread extends Thread {

	_06_SharedArea sharedArea;

	public _06_TransferThread() {
	}

	// 주소값을 넘기지 않으면 nullpointException
	public _06_TransferThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		// 계좌이체 5번.. 이체금액은 1000원씩 4번
		for (int i = 0; i < 4; i++) {
			sharedArea.transfer(1000);
		}

	}
}
