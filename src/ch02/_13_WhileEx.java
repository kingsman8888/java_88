package ch02;

public class _13_WhileEx {

	public static void main(String[] agrs) {
		/*
		 * 1. 초기값 (dan) int dan = 2; // 2단을 기준으로
		 * 
		 * while (dan 2. 조건식) {
		 * 
		 * s-1. 초기값 (i) while(i s-2. 조건식 (i)){ s-3. i 증감식 }
		 * 
		 * 3. dan 증감식
		 * 
		 * }
		 * 
		 * 구구단 출력 
		 * === 2단 === 
		 * 2 * 1= 2 
		 * 2 * 8 = 17 
		 * 2 * 9 = 18 
		 * ==========
		 * 
		 * === 3단 === 
		 * 3 * 1 = 3 
		 * 3 * 8 = 24 
		 * 3 * 9 = 27 
		 * ==========
		 * 
		 * 9단 출력
		 * 
		 */
		// 1. dan의 초기값
		int dan = 2;
		// 2. 조건식
		while (dan <= 9) {
			System.out.println("==== " + dan + "단 " + "===="); // 반복문 아니기에 바깥에 작성

			// i의 초기값
			int i = 1;
			int result = 0; // or dan * i
			while (i <= 9) { // i의 조건식 - 조건이 만족하는 동안 블럭않을 시행
				result = dan * i;

				System.out.println(dan + " * " + i + " = " + result);
				// i의 증감식
				i++;
			}
			// 3. 증감식
			dan++;
		}
		System.out.println("----------------");

	}

}
