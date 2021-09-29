package test;
	public class _20_InvalidNameException extends Exception{
	
	//멤버변수	
	private String worongName;

	//생성자
	public _20_InvalidNameException(String message){
		super(message);
	}
	//setter/getter
	public void setWorongName(String worongName){
		this.worongName = worongName;
	}
	public String WorongName(){
		return worongName;
	}

	public void showWrongName(){
		System.out.println("잘못된 이름 : " + worongName);
	}
}