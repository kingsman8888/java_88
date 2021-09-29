package ch08;

//360page // String과 Integer 클래스의 equals() 메서드
public class _03_StringEquals {

	public static void main(String[] args) {
		
		String st1 = new String("aaa");
		String st2 = new String("aaa");

		System.out.println("st1 == st2 : " + (st1 == st2)); // 두 인스턴스 주소값이 같은지 비교
		
		System.out.println("st1.equals(st2) : " + (st1.equals(st2))); // equals값이 true인경우

		Integer in1 = new Integer(456);
		Integer in2 = new Integer(456);
		
		System.out.println("in1 == in2 : " + (in1 == in2));
		System.out.println("in1.equals(in2) : " +  in1.equals(in2));

		// Object의 equals()메서드의 원래 기능은 두 인스턴스의 주소를 비교
		// 같은 주소 true, 다른주소 false
	}
}
