package test;

public class _12_Bank{
 
	//멤버변수
	 String bankName;    //은행명
	 String accountNumber;  // 계좌번호
	 double rate;   //이율

	// 디폴트생성자
	public _12_Bank(){}

	//매개변수 생성자
	public _12_Bank(String bankName, String accountNumber, double rate){
	this.bankName = bankName;
	this.accountNumber = accountNumber;
	this.rate = rate;
	}

	//setter getter
	public void setBankName(String bankName){  // 매개변수명을 대문자로 작성
	this.bankName = bankName;
	}
	public String getBankName(){
	return bankName;
	}
	public void setAccountNumber(String accountNumber){
	this.accountNumber = accountNumber;
	}
	public String getAccountNumber(){
	return accountNumber;
	}
	
	public void setRate(double rate){
	this.rate = rate;
	}
	public double getRate(){
	return rate;
	}
	
	public void printInfo(){
	System.out.println(" 은행명: "+ bankName + ",계좌번호: " + accountNumber + ",이율: " + rate);
	}	


}