package ch07;

public class _07_Main {
	public static void main(String[] args) {
		// 자식 매개변수 생성자를 통해서 값을 전달 하라 
		// 대출, 반납 정보를 호출
		
		_07_AppCDInfo showinfo = new _07_AppCDInfo("A101","노인과 바다","","");
		showinfo.checkOut("홍길동", "2021-05-26"); // *** 정상 대출되었습니다. *** : if
		//showinfo.checkOut("홍길동", "2021-05-26"); // *** 동일한 책을 대출시 *** : else
		//showinfo.checkOut("홍길동", "2021-05-26"); // *** 동일한 책을 대출시 *** : else
		System.out.println("================");
		
		showinfo.chcekIn();  // 반납상태 : else
		//showinfo.chcekIn();  // 반납상태 : if
		
	}
}
