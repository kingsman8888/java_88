package ch06;

public class _02_Main {
	public static void main(String[] args) {
		
		//FireCar 힙메모리생성
		
		_02_FireCar fire = new _02_FireCar();
		
		// fire.kind = "소방차"; //멤버변수에 접근하기 위해서 접근제어자 protected String kind; => 상속관계에서 자식이 접근가능
		
		fire.setKind("소방차");
		fire.setSpeed(5000);
		fire.carInfo();
		
		fire.water();
		
		//_02_PoliceCar 힙메모리생성
		
		_02_PoliceCar police = new _02_PoliceCar();
		
		police.setKind("경찰차");
		police.setSpeed(3000);
		police.carInfo();
		
		police.siren();
		
		
		
	}
}
