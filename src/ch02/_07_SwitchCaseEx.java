package ch02;

public class _07_SwitchCaseEx {
	public static void main(String[] agrs) {
		/*
		 * switch(조건) { // 조건 : 조건식, 변수
		 * 	case 값1 : 수행문1;  // 값1인 경우수행문 1을 수행하라;
		 * 				break;  // 빠져나온다.
		 * 	case 값2 : 수행문2;  
		 * 				break;
		 *  case 값3 : 수행문3; 
		 *  			break;
		 *  default : 수행문4;
		 *  }
		 *  
		 */
		
		// ranking에 따른 메달 색깔 출력 - 1등 : 금메달
		// ranking 1 : 금메달 2: 은메달 3: 동메달 그외 : 참가상
		
		String medal = "";
		int ranking = 1;
		
		switch(ranking) {
			case 1 : medal = "금메달";
					 break;
			case 2 : medal = "은메달";
					 break;
			case 3 : medal = "동메달";
					 break;
			default : 
					medal ="참가상"; // 디폴트는 행을 별도
		}
		
		System.out.println(ranking + "등은 " + medal + " 입니다");
		
	}
}
