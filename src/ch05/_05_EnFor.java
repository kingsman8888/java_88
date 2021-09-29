package ch05;

public class _05_EnFor {
	public static void main(String[] args) {
	/*
	 * 218 page 
	 * 향상된  for문 => 중요 (향상된  for문과 배열 매우 많이 사용한다. )
	 * 배열의 처음부터 끝까지 모든 요소를 참조할 때 사용하는 반복문
	 * 따로 초기화와 종료조건이 없기 때문에, 모든 배열의 ㅅ작요소부터 끝요소까지 실행한다.
	 * 
	 * for(변수 : 배열명){
	 * 		반복실행문;
	 * }
	 */
		String[] strArray = {"java","oracle","html","javascript","jsp","spring"};
		
		System.out.println("=======일반 for문========");
		for ( int i = 0 ; i<strArray.length ; i++) {
			System.out.println("strArray ["+ i +"] = " + strArray[i]);
		}
		
		System.out.println("=======향상된 for문========");
		for (String language : strArray) { // 변수 String 형을 가지고와서 : 배열을 가지고온다.
				System.out.println(language);
				
		}
		
	}

}
