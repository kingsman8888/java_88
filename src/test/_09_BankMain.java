package test;
public class _09_BankMain{
	public static void main(String[] agrs){

	_09_Bank wooriBank = _09_Bank.getBank();  // 참조변수 빼먹음

	wooriBank.setName("박찬호");
	wooriBank.setAccountNumber("1002-050-447308");
	wooriBank.setDeposit(7000);  // 현재잔고
	
	wooriBank.setMoney(8000); // 입금액
	wooriBank.setMoney(5000); // 입금액
	
	wooriBank.printBankInfo();{
	System.out.println();
	}

	_09_Bank shinBank = _09_Bank.getBank();  // 참조변수 옆에 . 을 넣음

	shinBank.setName("김병현");
	shinBank.setAccountNumber("110-584-35485"); // s빼먹음
	shinBank.setDeposit(10000);  // 현재잔고

	shinBank.setMoney(5000);	// 입금액
	

	shinBank.printBankInfo();
	System.out.println("김병현 신한은행 9000원 입금");
	shinBank.setMoney(9000);
	shinBank.printBankInfo();
	System.out.println();	
	}
}