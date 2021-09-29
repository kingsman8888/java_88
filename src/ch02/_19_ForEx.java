package ch02;

public class _19_ForEx {
	
	public static void main(String[] args) {
		
		/*
		 * continue문 예제
		 * continue문은 반목문과 함께 쓰인다.
		 * 반복문안에서 continue문을 만나면, 그 이후에 문장은 수행하지 않는다.
		 * for문의 처음으로 돌아가 증감식을 수행한다.
		 */
		// 1~100가지의 홀수 합계 : total
		
		int total = 0;
		
		for(int num = 1 ; num<=100 ; num++) {
			if(num % 2 == 0) continue;
			total += num;
			System.out.println(" num = " + num + " total : " +  total);
			
		}
		System.out.println("total : " + total);
		
	}

}
