package ch02;

import java.util.Scanner;

public class _09_SwitchCaseEx {

	public static void main (String[] args) {
		
		// _05_IfEx 예제 스위치로 작성
		/*
		 * 학점 구하기
		 * 1. 점수는 score 변수, 학점은 grade 변수
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F
		 * 3. 결과 => 점수 : 80, 학점 : B
		 */
		
		int score = 0;
		char grade = ' ';
		
		Scanner scan=new Scanner(System.in);
		System.out.print("학점을 입력하세요 : ");
		
		score = scan.nextInt();
		
		if(score > 100 || score <= 0) {
			System.out.println("잘못된 점수 입니다. 다시입력하세요!!");
		} else {
			switch(score / 10 ) {    // case 옆 값을 가지고  // 95 /10 9.5 = 9 int / int = int
			case 10 : case 9 : grade = 'A'; // 100~90
					  break;
			case 8 : grade = 'B';
					  break;
			case 7 : grade = 'C';
					  break;
			case 6 : grade = 'D';
					  break;
			default : 
					grade = 'F';
			}
			System.out.println("점수 : " + score  + " 학점 : " + grade);
		} //else

		scan.close(); // 자원해제
	
	}
}
