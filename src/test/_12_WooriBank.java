package test;   // c를 빼먹음
public class _12_WooriBank extends _12_Bank{  //블럭 빼먹음

	// 멤버변수
	String vipMember;   // vip

	//디폴트생성자
	public _12_WooriBank(){}
	
	public void makeWooriProduct(){  //void 빼먹음
	System.out.println("이율 높은 상품 출시");
	}
	
	public void setVipMember(String vipMember) {  //setter 빼먹음
		this.vipMember = vipMember;
	}
	public String vipMember() {
		return vipMember;
	}
	
	@Override
	public void printInfo(){
	super.printInfo();
	System.out.println("우리은행 :" + vipMember);
	}
	
} // 블럭 빼먹음