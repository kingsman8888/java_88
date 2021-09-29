package test;
public class _12_ShinhanBank extends _12_Bank{

	//멤버변수
	String event;   //"금리인하"
	
	//디폴트 생성자 
	public _12_ShinhanBank(){}
	
	public void executeLoan()  {
		System.out.println("신한은행 대출");
	}
	
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent() {
		return event;
	}
	
	
	@Override
	 public void printInfo(){
		super.printInfo();
		System.out.println("신한은행 : " + event);
	}

}