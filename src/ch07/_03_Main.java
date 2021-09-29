package ch07;

public class _03_Main {
	
	/*
	 *  템플릿 메서드 291page
	 *  - 메서드 실행순서와 시나리오를 정의하는 것이다.
	 *  - 로직 흐름이 이미 정해저 있는 프레임워크에서 많이 사용하는 구현 방법이다.
	 *  - final로 선언한 이유는 모든 하위클래스가 공통으로 사용하고, 코드를 변경하면 않되기 때문에 final로 선언함
	 *  final 메서드형 : 상속받은 하위 클래스가 부모 메서드를 재정의 할 수 없다.
	 * 
	 * final 305page
	 * - 변수 => 상수  : 변수에 값 대입 불가
	 * - 메서드 => 재정의 불가 
	 * - 클래스 => 상속 불가 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("=== 자율주행하는 자동차 ====");
		_03_Car aicar = new _03_AiCar();
		
		// 기존방식 참조변수.메서드 호출
//		aicar.starCar();
//		aicar.drive();
//		aicar.stop();
//		aicar.turnOff();
		
		aicar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ====");
		_03_Car manualcar = new _03_ManualCar();
		
		// 기존방식 참조변수.메서드 호출
//		manualcar.starCar();
//		manualcar.drive();
//		manualcar.stop();
//		manualcar.turnOff();
		
		manualcar.run();
	}
}
