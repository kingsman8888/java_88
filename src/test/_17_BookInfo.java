package test;
public class _17_BookInfo {
	//멤버변수 
	private String registerNo; // 등록번호
	private String title; // 타이틀
	private String author; // 작가
	
	//디폴트 생성자
	public _17_BookInfo (){}

	//매개변수 생성자
	public _17_BookInfo (String registerNo, String title, String author){
		this.registerNo = registerNo;
		this.title = title;
		this.author = author;
	}
	// setter, getter
	public void setRegisterNo(String registerNo){
		this.registerNo = registerNo;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getRegisterNo(){
		return registerNo;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}


}