package ch07;
// 자식클래스
public class _03_ManualCar extends _03_Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정차를 합니다.");
	}

	@Override
	public void wipe() {
		System.out.println("사람이 빠르기를 조절합니다.");
	}
}
