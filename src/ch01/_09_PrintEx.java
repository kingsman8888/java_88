package ch01;

public class _09_PrintEx {
	public static void main(String[] agrs) {
		/*
		 * printf(형식지정자, 값 또는 변수)
		 * - 형식지정자
		 * %d : 정수를 출력한다. 예) System.out.prinf("%d", 10 );
		 * %f : 실수를 출력한다. 예) System.out.prinf("%f", 3.14f);  // 실수 6자리
		 * %c : 한문자를 출력한다. 예) System.out.prinf("%c", 'a'); 
		 * %s : 문자열을 출력한다. 예) System.out.printf("%s", "Good Luck");
		 */
		
		
			double value = 1.0/3.0;
			System.out.println("value : " + value);
			
			System.out.printf("value :" + " %f", value); //,를 줘야함   float형으로 출력해라 
			
			System.out.println("");
			
			//float형으로 출력하도 소수점 이하 2째자리 
			System.out.printf("value :" + "%6.2f", value ); // 0.33 // 앞의 2자리가 공백으로 채워짐
			// printf("%전체자릿수.나머지자릿수f" , value) ==> 자리수 부족시 공백으로 채운다.
			
			System.out.println();
			
			
	}

}
