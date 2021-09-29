package ch12;

public class _02_StringEx {
	public static void main(String[] args) {
		
		
		String str = "A Barking dog"; //상수풀
		String s1, s2 ,s3 ,s4 ,s5;
	
		// 문자열 길이 : length()
		System.out.println("문자열 길이 : " + str.length());
		
		//문자열 결합 : concat("연결한 문자열")
		str = str.concat(" i love");
		System.out.println(str);
		
		//문자 교환 replace(oldChar, newChar)
		s2 = str.replace('B', 'b');
		System.out.println("s2 : " + s2);
		
		// 부분문자열 : substring(beginIndex, endIndex)..beginIndex(<=), endInds(<)
		s3= s2.substring(5,9);
		System.out.println("s3: " + s3);
		
		// 대문자로 변환 : toUpper
		//s2.toLowerCase("s4 : " + s4);
		
		// 소문자로변환 : toLower();  
		s5 = s2.toLowerCase();
		System.out.println("s5 : " + s5);
	}
}
