package ch06;
//자식클래스
public class _05_VipMember extends _05_Member {

	
	//멤버변수
	private String level; //VipMember level
	
	public _05_VipMember() {}
	
	public _05_VipMember(String id, String pwd,String level) {
		super(id,pwd);
		
		this.level = level;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" 등급 : " + level);
	}
}
