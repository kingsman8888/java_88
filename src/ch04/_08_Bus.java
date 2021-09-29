package ch04;

public class _08_Bus {
	
	//멤버변수
	int busNumber;   // 버스번호
	int passengerCount; // 승객수
	int money; // 수입
	
	// 디폴트 생성자
	public _08_Bus() {}
	
	// 매개변수 생성자
	public _08_Bus(int busNumber) {
		this.busNumber = busNumber; // 100
	}
	
	public _08_Bus(int busNumber,int passengerCount,int money) {
		this.busNumber = busNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	// 멤버메서드 - 버스타다
	public void take(int money) {
		this.money += money;  //버스 수입 증가 1000
		passengerCount++;
	}
	//출력
	public void showInfo() {
		System.out.println("버스번호 : " + busNumber + " 승객수 : " + passengerCount +" 수입 : " + money  );
	}
	
	

}
