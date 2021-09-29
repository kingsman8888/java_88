package test;
public class _10_Worker{
	
	//멤버변수
	private String workerName;
	private int money;
	

	// 매개변수 생성자
	public _10_Worker(String workerName,int money) {
		this.workerName = workerName;
		this.money = money;
	}
	public void buy(int money){
		this.money = money;
	}

	//멤버메서드
	public void buyNotebook(_10_EltronicShop buy){        // 10000 감소
		buy.buy(10000);
		this.money -= 10000; // money 오타
	}
		
	public void  takeoutStake(_10_Emart buy){    // 5000감소 
		buy.buy(5000);
		this.money -= 5000;
	}

	//출력
	public void WorkerInfo(){
	System.out.println("이름 : " + workerName + ", 잔액 : " + money ); 
	}

}