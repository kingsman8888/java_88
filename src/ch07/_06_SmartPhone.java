package ch07;

public class _06_SmartPhone extends _06_PDA {

	@Override
	public void sendSMS() {
		System.out.println("문자를 보낸다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받는다.");
	}

	@Override
	public void play() {
		System.out.println("음악은 연주하다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 멈추다.");
	}
	@Override
	public int calculate(int x, int y) {
		System.out.println(x + y);
		return x+y;
	}
	// 1. 클래스와 클래스를 상속시킨다.

	
}
