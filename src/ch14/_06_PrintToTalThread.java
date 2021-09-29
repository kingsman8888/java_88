package ch14;

// Thread 클래스를 상속 - 잔액 합계 스레드
public class _06_PrintToTalThread extends Thread { // 상속 받는다

	_06_SharedArea sharedArea;

	// 디폴트 생성자
	public _06_PrintToTalThread() {
	}

	// 매개변수 생성자
	public _06_PrintToTalThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int cnt = 0; cnt < 3; cnt++) { // 3번돌고
			// 잔액 합계 구해서 출력
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계 : " + sum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

		}
	}

}
