package ch01;

public class _04_VariiableEx {
	
	// 52page
	
	public static void main (String[] agrs) {
	
		/*
		 * 아스키코드값 10진수 값
		 * A : 65
		 * B : 66
		 * C : 67
		 * D : 68
		 * Z : 90
		 * a : 97
		 * z : 122
		 */
		
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1); //A
		
		//A를 변경 인코딩
		System.out.println("A :" + (int)ch1); // 정수로 바꾸려면 정수형 변수 선언 int 
		
		char ch2 = 66;  //앞 정수형 변수 66으로 하면 66출력
		System.out.println("ch2 : " + ch2); // 66을 char로 변경하라 그러면 정해진값 B출력 디코딩
		
		int ch3 = 67;
		System.out.println("ch3 : " + ch3);
		
		// 정수값(아스키코드값)에 해당하는 문자 출력 => 디코딩
		System.out.println("ch3 : " + (char)ch3); // ch3 itn형으로 67이나 char형으로 변경하면 C 출력 형을 변환하여도 출력 가능
		
		System.out.println("---------------------");
		
		char ch4 = 'a';
		System.out.println("ch4 :" + ch4);
		
		
		// 문자에 해당하는 정수값(아스키코드값) 출력 => 인코딩
		System.out.println("ch4 : " + (int)ch4);  // ch4 : 97
		
		char ch5 = 'z';
		System.out.println("ch5 : " + ch5);
		// 문자에 해당하는 정수값(아스키코드값) 출력 => 인코딩
		System.out.println("ch5 :" +(int)ch5);

		
		
	}	
}
