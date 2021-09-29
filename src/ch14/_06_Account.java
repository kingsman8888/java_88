package ch14;

//a가 b에게 입금 했다. a계좌는 돈빠저나가고b는 입금이 된다.
//계좌정보
public class _06_Account {

	// 매개변수
	private String accountNo; // 계좌번호
	private String ownerName; // 예금주 이름
	private int balance; // 잔액

	public _06_Account() {
	}

	public _06_Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	// 입금
	public void deposit(int amount) {
		balance += amount; // 입금 누적
	}

	// 인출
	public int withdraw(int amount) {

		// 들어온 돈보다 balance가 더 작으면
		if (balance < amount)
			return 0;
		balance -= amount;
		return balance;
	}

}
