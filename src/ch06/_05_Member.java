package ch06;
//부모 클래스 
public class _05_Member {
	
	// 멤버변수
	private String id;
	private String pwd;
	
	// 디폴트 생성자
	public _05_Member() {}
		
	// 매개변수 생성자
	public _05_Member(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	// printInfo()
	public void printInfo() {
		System.out.println("아이디 : \t" + id + ", \t패스워드 : " + pwd);
	}

}
