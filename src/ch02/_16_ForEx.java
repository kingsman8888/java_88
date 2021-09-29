package ch02;

import java.util.Scanner;

public class _16_ForEx {

	public static void main(String[] agrs) {
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * for문의 기본구조 for(초기값; 조건식; 증감식){ 수행문자1; 수행문장2; }
		 */

		// 3단 입력받아 구구단 출력

		/*
		 * // 입력은 몇단 ? -------------- *** 3단 *** -------------- 3 * 1 = 3
		 * 
		 * 3 * 9 = 27 --------------
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print(" 구구단 몇단? : ");
		
		int dan = 0;
		dan = input.nextInt();
		

		System.out.println("------------");
		System.out.println("***" + dan + "단" + "***");
		for (int i =1 ; i <= 9; i++) {

			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		System.out.println("------------");
		input.close();
	}

}
