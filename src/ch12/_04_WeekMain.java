package ch12;

public class _04_WeekMain {

	/*
	 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다. 2. 작성방법 : enum 열거형명{상수1, 상수2, 상수3} 3. 용도 :
	 * 제한된 상수값만을 사용하고자 할 대 4. 접근방법 : 열거형명.상수 접근방법 : 열거형명.상수.ordinal() => index
	 * 
	 * 5. 특징 : switch(변수/수식)에서 변수타입으로 enum을 사용할 수 있다. ordinal() 메서드를 이용해서 순서값을 얻어 올수
	 * 있다. ordinal() 메서드를0부터 시작한다.
	 */

	public static void main(String[] args) {

		System.out.println(_04_Week.SUN);
		System.out.println(_04_Week.SUN.ordinal()); // 0
		System.out.println(_04_Week.MON.ordinal()); // 1
		System.out.println(_04_Week.SAT.ordinal()); // 6

		System.out.println("=========");

		// switch case문에서 switch(index값)을 이용해서 요일을 출력

		String weekend = "";
		switch (_04_Week.SAT.ordinal()) {
		case 0:
			weekend = "일요일";
			break;
		case 1:
			weekend = "월요일";
			break;
		case 2:
			weekend = "화요일";
			break;
		case 3:
			weekend = "수요일";
			break;
		case 4:
			weekend = "목요일";
			break;
		case 5:
			weekend = "금요일";
			break;
		case 6:
			weekend = "토요일";
			break;
		}
		System.out.println("요일은 : " + weekend);

		// 바꿔서 상수값으로 결과출력
		String weekend1 = "";
		switch (_04_Week.SAT) {
		case SUN:
			weekend1 = "일요일";
			break;
		case MON:
			weekend1 = "월요일";
			break;
		case TUES:
			weekend1 = "화요일";
			break;
		case WEN:
			weekend1 = "수요일";
			break;
		case THR:
			weekend1 = "목요일";
			break;
		case FRI:
			weekend1 = "금요일";
			break;
		case SAT:
			weekend1 = "토요일";
			break;
		}
		System.out.println("요일은 : " + weekend1);

	}

}
