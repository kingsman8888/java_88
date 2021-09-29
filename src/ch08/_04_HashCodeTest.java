package ch08;

//364page String과 Integer 클래스의 hashCode() 메서드
public class _04_HashCodeTest {

	public static void main(String[] args) {

		String st1 = new String("aaa");
		String st2 = new String("aaa");

		System.out.println("st1 == st2 : " + (st1 == st2)); // 두 인스턴스 주소값이 같은지 비교

		System.out.println("st1.equals(st2) : " + (st1.equals(st2))); // equals값이 true인경우
		// String클래스는 같은 문자열인경우 hashCode메서드는 동일한 해시코드값 반환
		// 예) 학번이 논리적으로 동일하면 그때 같은 해시코드값 반환
		System.out.println("st1.hashCode() : " + st1.hashCode());
		System.out.println("st2.hashCode() : " + st2.hashCode());

		Integer in1 = new Integer(456);
		Integer in2 = new Integer(456);

		System.out.println("in1 == in2 : " + (in1 == in2));

		// Integer클래스는 hashCode를 정수로 반환하도록 재정의 되어있다.
		System.out.println("in1.hashCode() : " + in1.hashCode());
		System.out.println("in2.hashCode() : " + in2.hashCode());

		// Object의 equals()메서드의 원래 기능은 두 인스턴스의 주소를 비교
		// 같은 주소 true, 다른주소 false
	}
}
