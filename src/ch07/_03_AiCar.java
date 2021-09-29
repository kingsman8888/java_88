package ch07;
// 자식클래스   템플릿 메서드
public class _03_AiCar extends _03_Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void wipe() {
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절 됩니다.");
	}
}
