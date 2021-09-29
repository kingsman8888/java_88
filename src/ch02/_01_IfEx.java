package ch02;

public class _01_IfEx {
	
	public static void main (String[] agrs) {
		/*
		 * if - else if - else문
		 * if(조건식 1) {  // 조건식 1이 참인경우 수행
		 * 		수행문1;
		 * } else if(조건식2){ // 조건식2가 참인 경우 수행
		 * 		수행문2;
		 * } else if(조건식3){ // 조건식3이 참인경우 수행
		 * 		수행문3;
		 * } else {          // 위의 조건이 모두 해당되지 않을때 수행
		 * 		수행문4;
		 * }
		 * 수행문5;  // if문 밖이나 위 무언가 수행하고 나와서 ** 반드시 수행한다.
		 */

		
		int age = 5;
		// 8살 이상이면 "학교에 다닌다", 그렇지 않으면 "학교에 다니지 않는다." 출력
		
			if (age >= 8) {
				System.out.println("학교에다닌다.");
			}  else {
				System.out.println("학교에 다니지 않는다.");
			}
		
		
	}

}
