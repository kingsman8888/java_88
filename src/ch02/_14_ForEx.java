package ch02;

public class _14_ForEx {

	public static void main(String[] args) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * for문의 기본구조 
		 * for(초기값; 조건식; 증감식){
		 * 		수행문자1;
		 * 		수행문장2;
		 * }
		 */
		// Happy1 Happy2 Happy3 Happy4 Happy5
		
		for (int num=1; num<6 ; num++) {
			System.out.print("Happy" + num + " ");
		}
		
		System.out.println();  // 공백 ln
		
		// Happy5 Happy4 Happy3 Happy2 Happy1
		
		for (int num=5; num>=1 ; num--) {
			System.out.print("Happy" + num + " ");
		}
		
		//Hello~~ 무한루프 .. 멈추려면 Terminate 클릭 
		for( ; ; ) {  // 아무것도 없으면 어떤 조건도 만족하니 실행하라 
			System.out.println("Hello~~");
		}
		
	}
}
