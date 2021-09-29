package ch02;

public class _08_SwitchCaseEx {
	
	public static void main (String[] agrs) {
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
		
		// 숫자 num 기준 => str : 
		// 예) 1 : 하나  2 : 두서넛 3 : 두서넛 4 : 두서넛 , 5~6 대여섯, 많음 
		
		String str = "";
		int num = 6;
		
		switch(num) {
			case 1 : str ="하나";
					 break;     // break를 빼면 아래로 타고 흐른다. break 주면 빠저나간다.
			case 2 : str ="둘";
					 break;
			case 3 : str ="셋";
					 break;
			case 4 : str ="넷";
					 break;
			case 5 : str ="다섯";
					 break;
			case 6 : str ="여섯";
				  	 break;
			default : 
					str = "많음";
		}
		
		System.out.println(num + " : " + str);
		
		System.out.println("==========");
		
		int num1= 3;
		String str1 ="";
		switch(num1) {
		case 1 : str1 ="하나";
				 break;     // break를 빼면 아래로 타고 흐른다. break 주면 빠저나간다.
		case 2 : 
		case 3 : 
		case 4 : str1 ="두서넛";
				 break;
		case 5 : 
		case 6 : str1 ="다여섯";
			  	 break;
		default : 
				 str1 = "많음";
		}
		System.out.println(num1 + " : " + str1);
	}

}
