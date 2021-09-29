package ch04;

public class _07_Company {
	/*
	 * [면접] 싱글톤 패턴 193page
	 * - 동일한 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static을 응용
	 * - 접근할 클래스에 여러 메서드가 있을 때, 외부 클래스가 해당 해당 메서드에 접근할 때마다 
	 *   인스턴스를 생성할 필요없이 getInstance()를 통해 참조변수만 리턴받아서 접근한다.
	 *   열번,백번을 호출해도 하앙 같은 주소의 인스턴스가 반복된다.
	 * 
	 * - 싱글톤 패턴 생성
	 * - 1단계. 생성자를 private으로 만들기.
	 * - 2단계. 클래스 내부에 static으로 유일한 인스턴스를 생성한다.
	 * - 3단계. 외부에서 참조할 수 있는 public 메서드를 만든다.
	 * 
	 * - 호출하는 방법
	 * - 외부클래스명 참조변수 = 외부클래스명.getInstance();
	 * 예) _07_Company company = _07_Company.getINstance();  //클래스명.메서드명
	 */
			
	//멤버변수 
	private String companyName;
	private String address;
	private String telno;

	// - 1단계. 생성자를 private으로 만들기.
	private _07_Company() {}

	// - 2단계. 클래스 내부에 static으로 유일한 인스턴스를 생성한다.
	private static _07_Company instance = new _07_Company();
	
	//- 3단계. 외부에서 참조할 수 있는 public 메서드를 만든다.
	public static _07_Company getInstance() { //참조변수를 돌려주겠다. // static넣으면 오류 위 접근 instance도 static으로 
		if(instance == null) {    // 2단계가 생성되지 않은경우 여기서 만들겠다.
			instance = new _07_Company();   // 형식상으로 한다 보통 없어도 무관하나 (뜻 / 없을때 새로 만들어라)
		}
		return instance;
	}
	
	//멤버메서드
	public String GetCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String address() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String telno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	public void printInfo(){
		System.out.println("회사명 : " + companyName + ", 회사주소 : " + address + " 전화번호 : " + telno);
	
	}
	
}
