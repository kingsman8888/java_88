package ch02;

public class _03_IfEx {

	public static void main (String[] agrs) {
		
		// score 60점 이상이면 "합격", 60점 미만이면 "불합격", 40점 미만이면 "과락"을 result 변수에 출력
		// 방법.1 IF문 이용
		
		int score = 40;
		String result = "";
		
		if (score >= 60 ) {
			result = " 합격 ";
		} else if ((score > 40) && (score <= 59)) {      // 40~59 논리연산자 사용  // } else if (score < 40) result 변수 않스면 전부 개별출력
			result = " 불합격 ";
		} else {
			result = " 과락 ";
		}
		System.out.println(score + "점은" + result + " 입니다");
		
		// score 60점 이상이면 "합격", 60점 미만이면 "불합격", 40점 미만이면 "과락"을 result 변수에 출력		
		// 방법2. 3항 연산자를 이용해서 출력
		
		int score2 = 40; 
		
		String result4 = (score2 > 40) ? ((score2 >=41) && (score2 <= 59) ?  "불합격" : "합격") : "과락"; 
		// (score >= 60) ? "합격" : ((score >= 40) ? "불합격" : "과락");
		System.out.println(result4);
		
	}
}
