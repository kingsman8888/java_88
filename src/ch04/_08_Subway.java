package ch04;

public class _08_Subway {
	
	//멤버변수
	int lineNumber;   // 지하철 노선
	int passengerCount; // 승객수
	int money;
	
	// 디폴트 생성자
	public _08_Subway(int lineNumber) { // 생성자 오버로드
		this.lineNumber = lineNumber;
	}

	// 매개변수 생성자
	public _08_Subway(int lineNumber, int passengerCount, int money) {
		this.money = money;
		this.lineNumber = lineNumber;
		this.money = money;
	}

	public void take(int money) {  //1500
		this.money += money;  // 두번째사람이 오면 또 1500원 증가시켜 누적 
		passengerCount++;
	}

	// 출력
	public void showInfo() {
		System.out.println("지하철 노선 : " + lineNumber + " 승객수 : " + passengerCount + " 수입 : " + money);

	}

}
