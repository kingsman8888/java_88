package ch02;

public class _11_WhileEx {

	public static void main (String[] args) {
		/*
		 * 반목문 : 조건식이 참인 동안 반복(while문,for문)
		 *		1. 초기값 -> 2. 조건식 -> 3.증감식  (실행순서) 
		 *
		 * 
		 * 초기값
		 * while(조건식) {
		 * 	수행문1;
		 * 	수행문2;........수행문 여러개
		 * 	증감식;
		 * }
		 * 	수행문3;
		 */
		
		// 1~10까지 출력 => 1 2 3 4 5 6 7 8 9 10 합계
		// 1. 초기값
		int i = 1;
		int sum1 = 0;
		
		while(i<=10) { 			// 2. 조건식
			sum1 = sum1 + i;
			System.out.println("숫자 : " + i);
			
			// 3. 증감식
			i++;   
		}
		System.out.println("1~10까지 합계 = " + sum1);
		System.out.println("끝");
		
		System.out.println("--------------");
		
		int j = 1;
		int sum = 0;
		
		//1~10까지 합계 출력 => 1~10까지 합계 : 55
		while(j<=10) {          // 범위
			sum = j + sum;
			// System.out.println(sum); 여기서 출력하면 한번만 출력
			
			j++;
			// System.out.println("1~10까지 합계 :" + sum);  각 누적 각각 출력 
		}
		System.out.println("1~10까지 합계 :" + sum); // 최종마지막 출력 
		
	}
}
