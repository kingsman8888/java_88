package ch13;

public interface _01_Main {
	
	public static void main(String[] args) {
		
		String str1 = "NICE";
		String str2 = "good";
		
		// 인터페이스명의 참조변수 = (매개변수1, 매개변수2, ... ) -> 구현부
		
		_01_StringConcat concat = (s1, s2) -> System.out.println(s1 + " , " + s2); 
		
		concat.makeString(str1, str2);
		
	}

}
