package ch07;
// 자식클래스 - 부모클래스 상속받고 인터페이스 구현
public class _07_AppCDInfo extends _07_CDInfo implements _07_Lendable{
	
	private String borrower;     // 대출자  (이름)
	private String checkOutDate; //대출일자 (날짜)
	private int state; //대출여부 
	
	//생성자 
	public _07_AppCDInfo() {}
	
	//디폴트 생성자
	public _07_AppCDInfo(String registerNo,String title,String borrower,String checkOutDate) {
		super(registerNo,title);  //부모 매개변수 생성자 호출
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		state = STATE_NORMAL; // 반납상태(대출가능) ***
	}
	// state = 0;// 반납상태(대출가능 상태)
	
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	
	// 대출하다(반납상태일때 가능)
	@Override
	public void checkOut(String borrower, String checkOutDate) { // 대출하다 
		// 스위치개념 위에서 초기값을 0으로 주었는데 밑에 값
		if(state == STATE_NORMAL) {  // STATE_NORMAL = 0; // 반납상태
			state = STATE_BORRWED; //  STATE_BORRWED = 1; // 대출상태

			this.borrower = borrower;  // 값을 초기화한다.
			this.checkOutDate = checkOutDate; // 값을 초기화한다
			System.out.println("*** 정상 대출 되었습니다. ***");
			System.out.println("책이름 : " + super.getTitle());
			System.out.println("대출인 : " + borrower);
			System.out.println("대출일 : " + checkOutDate);
			//state = STATE_BORRWED; //  STATE_BORRWED = 1; // 대출상태
		} else { // 동일한 책을 대출시
			System.out.println("== 동일한 책을 대출시 ==");
			System.out.println("대출상태 : 대출중");
			System.out.println("대출할 수 없습니다.");
		}
	}

	// 반납하다(대출상태일때 가능)
	@Override  
	public void chcekIn() { //반납
		if (state == STATE_NORMAL) { // STATE_NORMAL = 0; // 반납상태
			System.out.println("해당 도서는 대출 가능합니다.");
		}else {
			System.out.println("대출상태 : 도서가 대출 중입니다.");
			System.out.println("책이름 : " + super.getTitle());
			System.out.println("대출인 : " + getBorrower());
			System.out.println("대출일 : " + getCheckOutDate());
			state = STATE_NORMAL;
			
		}
	}
	
	// 출력  중복은 빼서 줘도 됨 
	// printInfo() {

	
		
	
		
	

}
