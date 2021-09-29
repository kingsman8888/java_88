package ch08;
//370 page String 클래스 주소값 비교하기
// str1, str2는 동적메모리 공간인 힙메모리 주소이다.
// String, Integer 클래스는 equals(), hashCode()가 미리 재정의되어있다.
public class _06_StringTesit1 {
	
	
	//String str1 = new String("abc");  // 생성자의 매개변수에 문자열 생성 - str1 <== 힙메모리공간의 주소값
	// 프로그램에서 사용되는 상수값을 저장하는 곳을 상수 풀 (constant pool)
	//String str2 ="test"; // 문자열 상수를 가리키는 방식 - str2 <== 상수풀의 주소값(임시저장된곳)ㄴ
	
	public static void main(String[] args) {
		
		String str1 = new String("abc"); //100번지
		String str2 = new String("abc"); //200번지

		System.out.println("===힙메모리 주소값===");
		System.out.println("str1 == str2 : " + (str1 == str2));// 인스턴스가 각각 생성되어 주소값이 다름
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));// 문자열 값은 같으므로 true 반환
		// str1.equals(str2) : String형을 비교하기 (미리 재정의 되어 있기 때문에 논리적 값 비교 )
		
		String str3 = "abc"; 
		String str4 = "abc";
		System.out.println("===상수풀 주소값===");
		System.out.println("str3 == str4 : " + (str3 == str4)); // 문자열 abc는 상수풀에 저장되어 있어 str3,4가 가리키는 주소값 동일 
		System.out.println("str3.equals(str4): " + str3.equals(str4)); // 문자열 값이 같으므로 true 반환
		
	}
}
	