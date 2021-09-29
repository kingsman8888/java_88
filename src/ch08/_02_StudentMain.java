package ch08;

//호출해서 예제 돌아가도록 
public class _02_StudentMain {

	public static void main(String[] args) {

		_02_Student lee = new _02_Student(100, "유치훈");
		_02_Student lee2 = lee; // 참조변수값
		_02_Student yoo = new _02_Student(100, "유치훈");

		// 동일한 주소 인스턴스 비교
		if (lee == lee2) { // 기호로 비교
			System.out.println("lee와 lee2의 주소는 같습니다.");
		} else {
			System.out.println("lee와 lee2는 주소가 다릅니다.");
		}
		if (lee.equals(lee2)) { // 오버라이드 했을때 Objcet의 equals 메서드호출
			// 오버라이드(재정의)가 되지 않았기 때문에 주소값 비교(물리적비교가 된다)
			System.out.println("lee와 lee2는 동일합니다.");
		} else { // equals()메서드로 비교
			System.out.println("lee와 lee2는 다릅니다.");
		}

		if (lee == yoo) {
			System.out.println("lee와 yoo의 주소는 같습니다.");
		} else {
			System.out.println("lee와 yoo의 주소는 다릅니다.");
		}
		if (lee.equals(yoo)) { // 값을 비교해야하나 재정의가 되지 않아 주소값을 비교 (false)
			System.out.println("lee와 yoo는 동일합니다.");
		} else { // 동일인 이지만 인스턴스 주소가 다른경우
			System.out.println("lee와yoo는 다릅니다.");
		}
		
		System.out.println("lee의 hashCode : " + lee.hashCode());
		System.out.println("yoo의 hashCode : " + yoo.hashCode());
		
		System.out.println(" lee의 실제 주소값 : " + System.identityHashCode(lee));
		System.out.println(" ll2의 실제 주소값 : " + System.identityHashCode(lee2));
		System.out.println(" yoo의 실제 주소값 : " + System.identityHashCode(yoo));

	}
}
