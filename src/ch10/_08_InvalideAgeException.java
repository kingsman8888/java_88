package ch10;
// 사용자 정의 Eception - Exception 상속
public class _08_InvalideAgeException extends Exception{

		// 멤버변수
		private int wrongAge;
		
		//디폴트생성자
		public _08_InvalideAgeException() {}
		
		//매개변수 생성자
		public _08_InvalideAgeException(String message) {
			super(message);
		}
		
		public void setWrongAge(int wrongAge) {
			this.wrongAge = wrongAge;
		}
		public int getWrongAge() {
			return wrongAge;
		}
		
		// 에러메세지 출력
		public void showWrongAge() {
			System.out.println("잘못 입력된 나이 : " + wrongAge);
		}
}
