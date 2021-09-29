package test;
public interface _17_Library {
	//상수 
	int STATE_BORROWED = 0; // 대출상태 
	int STATE_NOMAL = 1; // 반납상태

	// 추상메서드
	public void checkOut(String borrowe, String checkOutdate); //대여자 , 대출일자
	public void checkIn(); //반납
}