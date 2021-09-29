package ch10;
//사용자 정의 Eception - Exception 상속  506 507 page
	public class _07_IDFormatException extends Exception{

		public _07_IDFormatException(String message) {  // 생성자의 매개변수로 예외 상황 메세지를 받음
			super(message); //반드시 상속을 받아야 구현할 수 있다.
		}
	}
