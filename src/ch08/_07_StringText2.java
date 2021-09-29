package ch08;

// 371page String 클래스의 final char[] 변수
public class _07_StringText2 {
	 // value 변수 : private final char[] value => final이므로 한번 생성된 문자열은 변경되지 않는다.
	 // 따라서 값이 변경되거나 추가시 새로운 문자열이 생성된다.
	
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String andriodStr = new String("android");
		
		System.out.println("javaStr : " + javaStr);
		System.out.println("andriodStr : " + andriodStr);
		
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(andriodStr));
		
		javaStr = javaStr.concat(andriodStr); //concat(); 문자열을 연결하여 javaStr에 대입
		
		System.out.println("== 문자열을 conat()으로 연결");
		System.out.println(javaStr);
		System.out.println("문자열 연결 후 주소값 : " + System.identityHashCode(javaStr));
		// 기존값에 문자열을 추가 해새 넣었으나 주소값은 다르다. final이기에 값을 변경 할수 없다.
		
	}
}
