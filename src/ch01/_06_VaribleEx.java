package ch01;

public class _06_VaribleEx {
	
	public static void main (String[] agrs) {
		
		/*
		 * 형 변환-1  64page
		 * 1. 자동적인 형변환(확대 형변환, 묵시적 형변환)
		 * 	  - 데이터가 손실되지않거나 손실이 제한적인 범위에서 묵시적으로 형변환을 한다.
		 *      자료형이 다른경우에 값을 할당하는 경우 형변환을 생략 할 수 있다.
		 *    - 데이터 큰타입 = 데이터 작은타입;  (예  float f = 10;  // f에 10.0이 대입
		 * 	  - 자료형이 다른 값을 연산하는 경우;  (예  double d = 10.0 + 30; // 자료형이 다를때는 큰타입으로 바꾼다. 
		 *  		   					     double d = 10.0 + 30.0 	// 작->큰 에러x 큰->작 에러o
		 *    - 자료형이 다른 값을 연산하는 경우 하나의 자료형으로 통일 후 할당 (double d = 10.0 + 30.5)
		 * 		 
		 * 2. 강제적인 형변환(축소 형변환, 명시적 형변환)
		 *    - 명시적으로 형변환하는 것을 캐스팅(Casting)이라고 한다.
		 * 	  - Casting은 생략할 수 없으며, 생략시 컴파일 에러가 발생하므로 반드시 명시적으로 형변환 해야한다.
		 *	  
		 *    - 데이터 작은 타입 = (작은타입) 데이터 큰 타입; / 자료손실 나도 할거다 컴파일이 안내 후 명시 (int)
		 *    
		 */
		System.out.println("------ 형변환-1 예제 --------");
		
		// 1. 자동적인 형변환(확대 형변환, 묵시적 형변환) : 데이터 큰타입 = 데이터 작은타입;
		double dVal = 20; // 자동으로 값이 대입되면서 실수형으로 변경 , 자동형변환 
		System.out.println("dVal : " + dVal); // dVal : 20.0
		
		float fVal = 20.5f + 10; // 20.5f + 10.0f; 변경된다   int 10보다 20.5 float 크기때문에 10.0변경되어 출력
		System.out.println("fVal " + fVal);
		
		//2. 강제적인 형변환(축소 형변환, 명시적 형변환) : 데이터 작은 타입 = (작은타입) 데이터 큰 타입
		int iVal = (int)10.5; //기본형 double 왼쪽이 더 작은건데 이것 꼭 넣을건지 컴파일러가 질의함 그래도 넣기위해 (int)로 명시
		// 값손실나도 넣을거라는 명시를 (int)
		System.out.println("iVal : " + iVal); //iVal : 10  (개발자가 손실나도 꼭 대입을 하겠다. 0.5 손실)
		
		/*
		 * 형 변환-2 (교재x) 반드시 알아야
		 * 3. int(4바이트)보다 작은 자료형은 int형으로 형변환 후 계산
		 * 	  예) byte + short -> int + int  자바는 int보다 낮은것은 인정x int로 변경한다.
		 * 
		 * 4. 두개의 피연산자중 표현범위가 큰 쪽에 맞춰서 형 변환후에 계산 	   
		 */
		System.out.println("------ 형변환-2 예제 --------");
		
		
		//int*int = int, int/int = int, int+int = int, int-int= int
		int iVal2; 
		double fVal2;
		
		double mVal2 = 5;
		
		// 5/4 = 1.25
		// int 는 0.25제외하고 1로 표현 / 변경 실제값은 1.25이지만 int / int 1로 표현된다. 대입시에도 int기 때문에 1
		// double은 1.25가 -> 1로 변경 후 대입시점에 -> 대입시는 double 1.0으로 바뀜
		
		
		//1.25
		//1 = 5/4; 1 = 1
		iVal2 = 5/4; // int = int / int  / int; => int iVal2 = 1;  // 1.25 -> 1 -> 1 : int / int는 int로 바뀌어야한다.
		System.out.println("iVal2 : " + iVal2); // iVal2 : 1 <--- 1.25가 아닌
		
		// 1.0 = 5/4; double 형이기대문에 .0이 발생 / 1.25이 나오려면 한쪽이 double 형이어야한다.
		fVal2 = 5/4; // double = int / intl => double fVal2 = 1.0; // 1.25 -> 1 -> 1.0로 바뀜 
		System.out.println("fVal2 : " + fVal2); // fVal2 : 1.0
		
		// 
		fVal2 = mVal2/4; // 1.25이 나오려면 한쪽이 double 형이어야한다.
		System.out.println("fVal2-- : " + fVal2); 
		// 1.25로 값을 출력하기 위해서는 양쪽은 더블값을 5.0 / 4.0 또는 한쪽을 더블값을 넣어 자동형변환시킨다.
		
		
		// 형변환 보다 ()안의 계산이 우선 가로 계산을 하고 (int)적용
		iVal2 = (int)(2.5 + 3.3); // int iVal2 = (int)(double + double); // (int)(5.8) => 5 큰타입으로 작은타입으로 x 손실발생 5.8이나 0.8손실
		System.out.println("iVal2 : " + iVal2);
		
		// iVal2 = (int)2.5 + 3.3; // 컴파일오류 (한쪽만 변환하면 오류발생)
		
		iVal2 = (int) 2.5 + (int)3.3; // 2 + 3 형변환을 먼저하고 더하기
		System.out.println("iVal2 : " + iVal2); // iVal2 : 5
		
		
		System.out.println("===================");
		
		int gg = 1000000;
		int jj = 2000000;
		long ll = 2000000L;
		
				
		int e1 = gg * jj;
		System.out.println("e1 : " + e1); // e1 : -1454759936 // 값의 범위가 초과되기 대문에 (int는 -21억 ~ +21억 )초과
		
		long e2 = gg * jj;
		System.out.println("e2 : " + e2); // e2 : -1454759936 // 연산후에 대입 => long형에 대입되기 전부터 연산결과가 int형 범위 초과
		
		long e3 = (long)(gg * jj); // 가로 연산 후 이미 int초과로 인하여 후에 long으로 변경하기대문에 연산 오류
		System.out.println("e3 : " + e3); // e3 : -1454759936 // 연산 후 형변환 후 대입 => long형 변환 전부터 연산결과가 int형 범위초과
		
		
		// 형변환 -2 적용 4. 두개의 피연산자중 표현범위가 큰 쪽에 맞춰서 형 변환 후에 계산 	
		long e4 = (long)gg * jj; // long * int -> long * long (형전환 이일치해야 연산되기때문에 큰쪽으로 변환) gg를 long으로 변환후 연산
		System.out.println("e4 : " + e4);
		// int를 long형으로 변경 후 연산
		
		
		long e5 = gg * ll; // int * long -> long * long (뒤가 long 라 큰타입으로 변경) 
		System.out.println("e5 : " + e5);
		// long형이 큰타입으로 작은타입을 큰타입으로 변경하여 연산
		
		float e6 = 100000000L; // float 는 4byte이나 값이 더크기때문에 값 e6 : 1.0E9
		System.out.println("e6 : " + e6);
	
		
		
	}
	

}
