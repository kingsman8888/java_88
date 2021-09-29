package ch02;

import java.util.Scanner;

public class _05_IfEx {
	
	public static void main (String[] agrs) {
		/*
		 * 학점 구하기
		 * 
		 * 1. 점수는 score 변수, 학점은 grade 변수
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F
		 * 3. 결과 => 점수 : 80, 학점 : B
		 */
		
		
		// _04_IfEx 스캐너사용한 학점구하기 
		// 객체주소현황 
		
		char grade6 = ' '; 
		int score6 = 0;  // 여기서 바로 int 스코어 줘도 됨
		
		
		// 힙메모리에 Scanner (객체 즉 인스턴스)를 생성하고, 그 주소값을 scan에 대입
		// 클래스명 참조변수 = new 클래스명(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		// 참조변수.메서드명
		// nextInt() : 콘솔에서 입력받은 정수를 읽어드림
		score6 = scan.nextInt();
		
		// 100보다 큰 경우 이고 0보다 작은경우 " 잘못된 점수입니다. 다시입력하세요!!"
		// || : 논리합 ==> or(또는)
		// && : 논리곱 ==> and(이면서)
		if (score6 > 100 || score6 <= 0 ) { // 둘중에 하나만 일치하면 참. 
			System.out.println(" 잘못된 점수입니다. 다시입력하세요!!"); 
		} else {
			if (score6 >=90) {
				grade6 = 'A';
			}else if (score6 >=80) {
				grade6 = 'B';
			}else if (score6 >=70) {
				grade6 = 'C';
			}else if (score6 >=60) {
				grade6 = 'D';
			}else {
				grade6 = 'F';
			}
		}
		
		// 항상수행
		System.out.println("점수 : " + score6 +  " 학점 : " + grade6);
		scan.close(); // 자원해제
	
	}

}
