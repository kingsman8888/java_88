package ch06;
//자식클래스
public class _05_GoldMember extends _05_Member {

	
	//멤버변수
	private String event;   //GoldMember event;
	
	//디폴트생성자
	public _05_GoldMember() {}
	
	//매개변수생성자
	public _05_GoldMember(String id, String pwd,String event) {
		super (id,pwd);
		
		this.event = event;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" 행사 : " + event);
	}
}
