package ch07;

public class _06_Main {
	public static void main(String[] args) {
		
		//각 인스턴스생성 후 출력
		_06_SmartPhone smart = new _06_SmartPhone();
		smart.calculate(10,5);
		
		smart.sendSMS();
		smart.receiveSMS();
		smart.play();
		smart.stop();
		
		// 다형성으로 출력 
	}
}
