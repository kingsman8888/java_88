package ch01;

import java.util.Scanner;

public class _08_InOutEx {

	
	public static void main (String[] agrs) {
		/*
		 * https://docs.oracle.com/javase/8/docs/api/
		 * 
		 * 변수
		 * 1. 기초형 (Primitive Type) : 실제값이 저장
		 * 		- 데이터 타입 변수명 = 값;
		 * 			int score = 70;
		 * 2. 참조형 (Reperence Type) : 실제 객체를 가리기는 주소값이 저장된다.
		 * 		- 클래스, 인터페이스, 배열 [면접시 질문하는곳도 있음]
		 * 		- 클래스인 경우
		 * 		// 인스턴스 생성 
		 * 
		 * 		클래스명에 참조변수명 = new 클래스명();
		 * 		
		 * 		예) Scanner input = new Scanner(System.in)
		 * 		- 참조 변수명은 객체(인스턴스)를 가리키는 주소값이 들어있다.
		 * 콘솔창에서 입력 받고 싶으면 환경을 만들어줘야 한다.
		 */
		
		int i = 0 ;  // 스캐너에 올린 두수를 입력 받겠다. 
		int j = 0 ;
		// 두수를 콘솔에서 입력받아 합계를 구하기 
		
		// new의 의미는 힙메모리에 객체(인스턴스)를 생성하고, 그 주소값을 iput에 대입
		Scanner input = new Scanner(System.in);  // 메모리에 올림 input  // Scanner 가상메모리 공간 내보내기  // iput 말로 다른 값 사용 가능 
		// 위 스캐너를 생성하고 사용   // iput에는 스캐너(객체 즉 인스턴트)의 주소값이 있다 // system.in 콘솔에 입력 받겠다 시스템으로부터 입력받겠다.
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		i = input.nextInt();   // 콘솔에 입력하면 nextInt가 읽어서 i 대입 
				
		System.out.print("두번째 숫자를 입력하세요 : ");
		j = input.nextInt(); // 콘솔에 입력하면 nextInt가 읽어서 j 대입 
		
		int sum = i + j;
		
		System.out.println(" 합계 : " + sum);
		
		System.out.println("프로그램 종료 ");
		input.close();  // 자원해제 메모리에 올린것 지우기
	
	}
}
