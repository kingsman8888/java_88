package ch02;

public class _12_WhileEx {

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
		 * 2 * 8 = 16 
		 * 2 * 9 = 18 
		 * ==========
		
		 */

		// 1. 초기값
		int dan = 2;
		int i = 1;
		int result = 0; // or dan * i
		
		while (i <= 9) { // 2. 조건식
			result = dan * i;   // 수행문 

			System.out.println(dan + " * " + i + " = " + result);
			// 3. 증감식
			i++;
		}
		System.out.println("----------------");
	}
}
