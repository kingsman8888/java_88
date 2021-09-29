package ch01;

public class _07_OperatorEx {
	public static void main(String[] agrs){
	
		/*
		 * 연산
		 * 1. 사칙연산자 
		 */
		System.out.println("=== 사칙 연산자 예제 ===");
		
		int num1 = 8; // 변수선언, 초기화
		int num2 = 4; // 변수선언, 초기화
		
		int addR = num1 + num2;
		int subR = num1 - num2;
		int	mulR = num1 * num2;
		int divR = num1 / num2;
		int	modR = num1 % num2;
		
		System.out.println("addR : " + addR);
		System.out.println("subR : " + subR);
		System.out.println("mulR : " + mulR);
		System.out.println("divR : " + divR);
		System.out.println("modR : " + modR);
		
		System.out.println(addR + ","+ subR+ "," +mulR+","+ divR + "," +modR);

		/*
		 * 2. 증감연산자  74page 
		 * 1) 전위연산자 : y = ++x; ==> ++x; y = x;
		 *   1. x값을 1증가한 후 2. 증가값을 y에 대입한다.
		 * 2) 후위연산자 : y = x++; ==> y = x; x++;
		 *	 2. x값을 먼저 y에 대입한 후 2. x값을 증가시킨다.
		 */
		System.out.println("=== 증감 연산자 예제 ===");
		
		
		// 전위연산자
		int c = 5;
		int nextC = ++c; // ++c => c = c + 1;  / 6 = 5 + 1
		System.out.println("nextC : " + nextC); // nextC = 6
		
		
		// 후위연산자
		int d = 5;
		int nextD = d++; // nextD = d++; ==> next에 d를 대입, 후에 d를 1증가
		System.out.println("d : " + d); // d : 6 => 증가된 값을 출력시킨다.
		System.out.println("nextD : " + nextD); //NextD : 5
		
		int e=2, f=3, result=0;  // 메인메서드 밖으로 나가면 값은 0이된다. (또다른 메서드)
		
		System.out.println(++e + --f * e--);  // 3 + 2 * 3 = 9   
		System.out.println("e = " + e); // 2  / 후위연산자 작동
		System.out.println("f = " + f); // 2
		
		// 위변수값에서 이어진다. 영향을 받은게 이어진다.
		result = ++e + --f * e--;
		System.out.println("result = " + result); // 3 + 1 * 3 
		System.out.println("e = " + e); // 2 / 후위연산자 작동
		System.out.println("f = " + f); // 1
		
		//변수 : 같은공간에서 값이 계속 변경된다.
		int h = 2, i = 3;
		System.out.println(h++ + --i * h--); // 2 + 2 * 3 = 8 / 맨앞 h변수의 후위연산자 작동  / 후위연산자 h++에서 2였다가 넘어가면서 h++ 본인값 1증가 후 3으로 h-- 이후 h가없기대문에 다음에 후위처리 아래출력 2
		System.out.println("h : " + h); // 2 / 후위연산자 작동
		System.out.println("i : " + i); // 2
		
		/*
		 * 연산 page76
		 * 3. 관계연산자 : 같다(==), 같지 않다(!=), >, <, >=, <=
		 *    - 결과값은 boolean 타입 : 참(true) 거짓(false)  
		 */
		
		System.out.println("==== 관계 연산자 예제 ===");
		int c1 = 10;
		int c2 = 20;
		
		System.out.println("c1 == c2 : " + (c1 == c2)); // false
		System.out.println("c1 != c2 : " + (c1 != c2)); // true
		System.out.println("c1 > c2 : " + (c1 > c2)); // false
		System.out.println("c1 < c2 : " + (c1 < c2)); // true
		System.out.println("c1 >= c2 : " + (c1 >= c2)); // false
		System.out.println("c1 <= c2 : " + (c1 <= c2)); // true
		
		/*
		 * 4. 복합 연산자 page80 5/12
		 */
		
		System.out.println("=== 복합연산자 예제 ===");
		
		int ii = 5; 
		ii += 10; // ii = ii + 10; // 대입은 가장 늦게 대입
		
		System.out.println(" ii = " + ii);
		
		// ii = ii - 10 복합 연산자로만들어보자.
		
		// 상수는 한번 선언된곳에서 한번 바꾸면 되나 변수는 계속 변하기대문에 위 ii => 15기때문에 15로 시작 
		ii -= 10; // ii = ii - 10
		System.out.println(" ii = " + ii); // 5 = 15 - 10
		
		
		ii *= 10; //ii = ii * 10;;  대입을 먼저 *
		System.out.println(" ii = " + ii); // 50 = 5 * 10
		
		ii /= 10; //ii = ii / 10; 
		System.out.println(" ii = " + ii); // 5
				
		/* 77page
		 * 5. 논리 연산자 : 1 => 참(True), 0 => 거짓(false)  
		 * &&(논리곱) : x && y => x와y 모두 참이면 참, 그렇지 않으면 거짓
		 * ||(논리합) : x || y => x와y중에서 하나만 참이면 모두 참, 모두 거짓이면 거짓 
		 * 		
		 */
		
		System.out.println("=== 논리 연산자 예제 ===");
		
		int z1 = 4, y1 = 5;
		
		// 논리 곱
		System.out.println((z1 == 4) && (y1 == 5)); // T && T ==> true
		System.out.println((z1 == 4) && (y1 == 10)); // T && F ==> false
		
		// 논리 합
		System.out.println((z1 == 4) || (y1 == 8)); // T || F ==> true 1 + 0 = 1
		System.out.println((z1 == 8) || (y1 == 10)); // F || F ==> false 0 + 0 = 0
		
		// 논리 부정
		System.out.println("논리 부정 : " + !(z1 == 4)); //  T => 1 => 0 = false
		
		
		/*
		 * 연산
		 * 6. 삼항연산자 : 항이 3개인 연산자를 의미한다. (if문 배우고 다시)
		 * 				결과 = 조건식? 결과1 : 결과 2;
		 * 				조건식이 참이면 결과1을 수행해서 결과에 대입하고, 거짓이면 결과2를 수행해서 결과에 대입한다.
		 */
		
		int score = 90;
		
		// 결과 = 조건식? 참결과1 : 거짓결과2 
		String resultStr = (score >=60) ? "합격" : "불합격";
		System.out.println("rsultStr : " + resultStr);
		
		// 방법2. 3항 연산자를 이용해서 출력
		
		// score 60점 이상이면 "합격", 60점 미만이면 "불합격", 40점 미만이면 "과락"을 result 변수에 출력
		
		
		int score2 = 40; 
			
		String result1 = (score2 > 40) ? ((score2 >=41) && (score2 <= 59) ?  "불합격" : "합격") : "과락"; 
		// (score >= 60) ? "합격" : ((score >= 40) ? "불합격" : "과락");
		System.out.println(result1);
		
		int score9 = 55;
		String result2 = (score9 > 40) ? ((score9 >=60) ? "합격" : "불합격") : "과락";
		System.out.print(result2);
		
		
		
		
	}

}
