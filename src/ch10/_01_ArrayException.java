package ch10;
//실행 예외처리 RuntimeException _ArrayOtuBoundsException
public class _01_ArrayException {
	public static void main(String[] args) {
		
		/*
		 * 487page
		 * [면접]
		 * 예외처리 목적 : 정상종료 
		 * 
		 * try{
		 *  	// 예외가 발생할 수 있는 부분
		 * } catch{(처리할 예이타입e){
		 *   // try 블록안에서 예외가 발생했을때 예외를 처리하는 부분
		 * } finally{
		 * 	   //항상 수행되는 부분(예외가 발생하지 않어라도),주로 자원해제를 위한close() 문장이온다.
		 * }
		 */
		
		int[] array = new int[5];
		
		try {
			for ( int i=0; i<=array.length; i++) {
				array[i] = i;
				System.out.println(array[i]);  // 0~4개
			}
		}catch(ArrayIndexOutOfBoundsException e) { // 예외를 모르면 다형성에 의해 부모 Exception를 넣어줘도 문제없다.
			System.out.println("=== 예외 처리 부분 ==="); // 문제가 있을때만 탄다.
			System.out.println("e.getMessage() : " + e.getMessage()); 
			// e.printStackTrace(); // <== 어떤 Exception종료인지 알려준다.
		}finally {
			System.out.println("====finally 부분 ====");  //예외가 발생하지 않더라도 무조건 출력.
			
		}
		System.out.println("정상 종료 ");
	}
}
