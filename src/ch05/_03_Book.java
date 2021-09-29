package ch05;

public class _03_Book {
	
	//3. 멤버변수 
	private String bookName;
	private String author;
	
	//디폴트 생성자
	public _03_Book() {}
	
	//2. 매개변수 생성자에서 멤버변수에 값 전달 
	public _03_Book(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	//멤버메서드 (setter,getter)
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 멤버메서드 showBookInfo();  
	public void showBookInfo() { //참조변수를 통해 출력하기때문에 주소값이 전달된 library로 호출
		System.out.println( " 책 이름 : " + bookName + ", 작가이름 : " + author);
	}
}