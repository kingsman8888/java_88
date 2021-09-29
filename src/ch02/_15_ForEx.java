package ch02;

public class _15_ForEx {
	
	public static void main(String[] agrs) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * for문의 기본구조 
		 * for(초기값; 조건식; 증감식){
		 * 		수행문자1;
		 * 		수행문장2;
		 * }
		 */
		
		// 1~10까지의 합
		int sum = 0;
		
/*
 num=1, sum=1
 num=2, sum=3
 ..
 num=10, sum=55
 
 1~10까지의 합 : 55
 */
		for(int num=1 ; num<=10 ; num++) {
			sum = sum + num;
			System.out.println("num = " + num + "," + " sum = " + sum );
		}
			System.out.println("==================");
			System.out.println(" 1~10까지의 합 : " + sum);
	}
}
