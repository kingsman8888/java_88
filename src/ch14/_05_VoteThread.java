package ch14;

import java.util.Random;

// 지역별 개표율 현황
public class _05_VoteThread implements Runnable {

	int sum = 0; // 총 개표율
	int tagetNum = 100;
	Random random = new Random(); // 개표율 속도

	@Override
	public void run() {
		StringBuffer sb = new StringBuffer(); // *모양의 그래프를 출력하기 위함 =>개표율을 * 개수로 출력(%만큼 %를 그린다)

		while (true) { // Random 값을 무작위로 발생시킨다.
			sum += random.nextInt(10); // 1~10까지의 난수 발생숫자를 누적시킨다.
			sb.delete(0, sb.length()); // delete를 이용해 초기화 , *의 길이만큼

			if (sum >= tagetNum) {
				sum = 100; // 100으로
				for (int i = 0; i < sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
				break; // 타겟보다 100이전까지
			} else {
				for (int i = 0; i < sum; i++) {
					sb.append('*');
					System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
				}
				try { // sleep(1000밀리초) : 1초
					Thread.sleep(500); // 속도조절 (별이 출력 후 보일수 있도록)
					// 0.5초 // cpu의 시간을 다른 스레드에게 넘겨주는 효율적인 방법. 현작업을 중지하고 넘겨준다.
				} catch (InterruptedException e) {

				}
			}
		}

	}
}
