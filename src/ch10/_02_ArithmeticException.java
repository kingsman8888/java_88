package ch10;

import java.util.Scanner;
// 실행 예외처리 RuntimeException _ArithmeticException
public class _02_ArithmeticException {
	public static void main(String[] args) {
		/*
		 * 487page
		 * [면접]
		 * 예외처리 목적 : 정상종료 
		 * 
		 * try{
		 *  	// 예외가 발생할 수 있는 부분
		 * } catch{(처리할 예외타입e){
		 *     // try 블록안에서 예외가 발생했을때 예외를 처리하는 부분
		 * } finally{
		 * 	   //항상 수행되는 부분(예외가 발생하지 않어라도),주로 자원해제를 위한close() 문장이온다.
		 * }
		 */
		
		
		System.out.println("=== 두 정수를 입력하세요 ===");
		
		Scanner input = new Scanner(System.in);
		
	    System.out.print("첫번째 값 입력 : ");
		 int num1 = input.nextInt();
		
		 System.out.print("두번째 값 입력 : ");
		 int num2 = input.nextInt();
		 
		 //몫과 나머지를 출력 
		
		 try {
			 System.out.println(num1 / num2); 
			 System.out.println(num1 % num2);
		 }catch(ArithmeticException e){   // java.lang 은 컴파일러가 import하고 넘어간다 (많이 사용하기 때문에)
				System.out.println(e.getMessage()); // / by zero // e.getMessage(); 에러의 원인을 간단히 출력
				System.out.println(e.toString()); // e.toString() : 에러의 Exception 내용과 원인을 출력합니다.
				System.out.println("===");
				//e.printStackTrace(); // e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
		 }finally {
			 System.out.println("무조건 출력");
		 }
		 System.out.println("정상종료");
		 
		 input.close();
		 
	}	
}
