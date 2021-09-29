package ch08;
//372page
public class _08_StringBuilder {
		/*
		 * 체크표시 주석 372page
		 * StringBuffer와 StringBuilder는 내부에 변경가능한 (final이 아닌) char[]를 변수를 가지고 있다.
		 * 문자열 변경시 기존에 사용하던 char[] 배열이 확장되므로 추가 메모리를 사용하지 않는다.
		 * 따라서 문자열을 연결하거나 변경할 경우 두 클래스중 하나를 사용한다.
		 * StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장하지만, StringBuilder클래스는 보장되지 않는다.
		 */
	
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		// javaStr 문자열 주소 : 366712642
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리주소 : " + System.identityHashCode(buffer));
		// 연산 전 buffer 메모리주소 : 1829164700
		
		// 문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!!");
		System.out.println("연산 후 buffer 메모리주소 : " + System.identityHashCode(buffer));
		// 연산 후 buffer 메모리주소 : 1829164700
		
		javaStr = buffer.toString(); // 문자열로 반환
		System.out.println(javaStr);
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		// javaStr 문자열 주소 : 2018699554
		
	}
}
