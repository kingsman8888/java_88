package test;

public class _09_Bank{

	//멤버변수
	private String name;  // 예금주
	private int balance;   // 잔고
	private String accountNumber; // 계좌번호
	private int money; // 입금 

	//생성자
	public _09_Bank (){}

	//인스턴스생성
	private static _09_Bank bank = new _09_Bank();
	//public 메서드
	public static  _09_Bank getBank(){
		return bank;
	}

	//setter, getter
	public String getName(){ // 이름 
	return name;
	}
	public void setName(String name){  
		this.name = name;
	}
	public int getmoney(){
		return money;
	}
	public int getDeposit(){
		return balance;
	}
	public void setDeposit(int balance){  // 잔액
		this.balance = balance;
	}
	public int getMoney(){
		return money;
	}	
	public void setMoney(int money){  // 입금 
		this.money = money;
		this.balance += money;
	}

	public String getAccountNumber(){    
		return accountNumber;  // return 옆에 = 을 넣음
	}
	public void setAccountNumber(String accountNumber){ // 계좌번호
		this.accountNumber = accountNumber;
	}

	//출력
	public void printBankInfo() {
	System.out.println("예금주 : " + name + " 계좌번호 : " + accountNumber + " 잔고 : " + balance);
	// 마지막 ; 세미콜론을 넣지않음.
	}
}