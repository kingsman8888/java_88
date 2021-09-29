package ch02;

import java.util.Scanner;

public class _04_IfEx {
	
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
		
		int score = 59;
		String grade = "";
		
		if (score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("점수 : " + score + " 학점 : " + grade);
		
		// 문자형도 되나 문자를 표기하기에 CHAR형으로 변경 
		
		
		int score1 = 90;
		char grade1 =' ';
		
		if (score1 >=90) {
			grade1 = 'A';
		} else if (score1 >=80) {
			grade1 = 'B';
		} else if (score1 >=70) {
			grade1 = 'C';
		} else if (score1 >=60) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}
		
		// 항상수행 
		System.out.println("score1 : " + score1 + "  grade1 : " + grade1);
				
		
		// _04_IfEx 스캐너사용한 학점구하기 
		// 객체주소현황 
		
		char grade6 = ' '; 
		int score6 = 0;  // 여기서 바로 int 스코어 줘도 됨 
		
		// 힙메모리에 Scanner (객체 즉 인스턴스)를 생성하고, 그 주소값을 scan에 대입
		// 클래스명 참조변수 = new 클래스명(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100점) : ");
		
		// 참조변수.메서드명
		// nextInt() : 콘솔에서 입력받은 정수를 읽어드림
		score6 = scan.nextInt();
		
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
			
		System.out.println("점수 : " + score6 +  " 학점 : " + grade6);
		System.out.println(" 이번학기 수고 하셨습니다 ");
		scan.close();
		
		
			
			
			
		
		
	
	}

}
