package ch10;

public class _08_InvalidNameException extends Exception {
	
	//멤버변수
	
	private String wrongName;
	
	public _08_InvalidNameException() {}
	
	public _08_InvalidNameException(String message) {
		super(message);
	}
	
	public void setWrongName(String wrongName) {
		this.wrongName = wrongName;
	}
	public String getWrongName() {
		return wrongName;
	}
	
	//에러메세지 출력
	public void showWrongName() {
		System.out.println("잘못 입력된 이름 : " + wrongName);
	}
}
