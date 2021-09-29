package test;
	public class _18_Book{

	private int bookNo;   // 101,102,103
	private String title;
	private String author;

	//디폴트생성자
	public _18_Book(){}

	//매개변수생성자
	public _18_Book(int bookNo, String title, String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	//setter getter
	public void setBookNo(int bookNo){
		this.bookNo = bookNo;
	}
	public void setTitle(String  title){
		this. title =  title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public int getBookNo(){
		return bookNo;
	}
	public String  getTitle(){
		return title;
	}
	public String  getAuthor(){
		return author;
	}

	@Override
	public String toString(){
		return " 책번호 :" + bookNo +  ", 책이름 : " + title + ", 작가명 : " + author;   // return을 넣지않음
	}


}