package ch04;

public class _08_Taxi {
	
	// 김철수 : 15,000
	//택시 모범택시 : 7,000
	
	String taxi;
	String name;
	int perCount;
	int money;

	public _08_Taxi(String taxi, String name) {
		this.taxi = taxi;
		this.name = name;
	}

	public void takeTaxi(int money) {
		this.money += money;
		perCount++;
	}

	public void showInfo() {
		System.out.println(" 택시 : " + taxi + " 승객 : " + perCount + " 수입 : " + money);
	}

}
