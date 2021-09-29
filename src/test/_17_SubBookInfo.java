package test;
public class _17_SubBookInfo extends _17_BookInfo implements _17_Library  {
	//멤버변수
	private String borrower; // 대출자
	private String checkOutDate; // 대출일자
	private int state; //대출여부   주석 // 않붙임
	
	//디폴트생성자
	public _17_SubBookInfo(){}
	//매개변수 생성자
	public _17_SubBookInfo (String registerNo, String title, String author, String borrower, String checkOutDate){
		super(registerNo, title, author);
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		state = STATE_NOMAL;
	}
	// setter getter
	public void setBorrower(String borrower){  // borrower() 오타
		this.borrower = borrower;
	}
	public String getBoorower(){ // borrower() 오타
		return borrower;
	}
	public void setCheckOutDate(String checkOutDate){ // CheckOutDate오타
		this.checkOutDate = checkOutDate;
	}
	public String getCheckOutDate(){ // CheckOutDate오타
		return checkOutDate;
	}
	
	//추상메서드
	public void checkOut(String borrower, String checkOutDate){ //대여자 , 대출일자
		if ( state == STATE_NOMAL){
			this.borrower = borrower; // 초기화 하지않음
			this.checkOutDate = checkOutDate;
		System.out.println("*** 정상 대출 되었습니다. ***");
		System.out.println("책이름 : " + super.getTitle());
		System.out.println("작가명 : " + super.getAuthor());
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
		state = STATE_BORROWED;
		} else {
		System.out.println("*** 동일한 책을 대출시 ***");
		System.out.println("대출할 수 없습니다");
		}	
		
	} 
	public void checkIn(){   //반납
		if ( state == STATE_NOMAL){
		System.out.println("*** 정상 반납 되었습니다.***");	 //세미콜론 빼먹음	
		} else {
		System.out.println("대출상태 : 대여가능");  //세미콜론 빼먹음
		System.out.println("책이름 : " + super.getTitle());
		System.out.println("작가명 : " + super.getAuthor());
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + checkOutDate);
		System.out.println("*** 이미 반납되었습니다. ***");   // " 빼먹음
		
		}
		
	}
	
}		// } 블럭 빼먹음