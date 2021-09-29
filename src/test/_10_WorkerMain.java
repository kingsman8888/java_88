package test;
public class _10_WorkerMain{ // class 않넣음
	public static void main(String[] args){  // String 오타
	
	_10_Worker hong = new _10_Worker("홍길동",50000);
	
	hong.WorkerInfo(); 
	_10_EltronicShop buyNotebook = new _10_EltronicShop("삼성전자");
	
	System.out.println("== 홍길동 노트북 구매 ==");
	hong.buyNotebook(buyNotebook); // 참조변수 잘못넣음
	hong.WorkerInfo(); 
	
	System.out.println("== 홍길동 스테이크 구매 ==");
	_10_Emart takeoutStake = new _10_Emart("스테이크");

	hong.takeoutStake(takeoutStake);

	hong.WorkerInfo(); 
	System.out.println("");
	buyNotebook.printShopInfo(); 
	takeoutStake.printEmartInfo(); // ;세미콜론 않넣음 // 참조변수 잘못넣음
	}
}