package ch05;

public class _01_ArrayEx {
	public static void main(String[] args) {
		
		/*
		 *  * 배열(Array) : 같은 타입의 대량의 데이터를 저장할 수 있는 저장장소이다.
       * 방법1) 선언과 생성을 따로 한다.
       *       int[] scores; // 선언
       *      scores = new int[갯수];   // 생성
       *      scores[index] = 값;
       * 
       * 방법2) 선언과 생성을 동시에 한다... 추천
       *      배열자료형[] 배열명 = new 배열자료형[배열갯수];
       *      배열명[index] = 값;
       *      
       * 방법3)  int[] scores = new int[] {1,2,3,4,5}  // 개수는 생략해야 함   
       *     오류) int[] scores = new int[5]{1,2,3,4,5}; // 갯수가 있으므로 오류발생
       *     int[] 배열명;
       *     배열명 = new 자료형[] {값1, 값2, 값3..값n};  //  new 자료형[] 생략시 오류발생
       * 
       * 방법4) 선언과 할당을 동시에 한다... 제일 많이 사용한다.
       *      배열자료형[] 배열명 = {값1, 값2, 값3..값n};
		 */
		
		// 배열(Array) : 대량의 동일한 데이터를 한꺼번에 순차적으로 저장할 수 있는 저장장소이다.
		
		// 배열자료형[] 배열명 = new 배열자료형[배열갯수]
		
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		// 인덱스 0부터 준다
		// for(초기값; 조건식; 증감식)  // i<5 // 0부터부터 시작하기 때문에 <작다로 
		for (int i = 0 ; i<score.length; i++) { //length속성으로 메서드가 아니기에 ()없다.
			System.out.println("score[" + i + "] = " + score[i]);
		/*
		 * score[0] = 10
			score[1] = 20
			score[2] = 30
			score[3] = 40
			score[4] = 50

		 * 
		 */
		
		}
	}
	
}
