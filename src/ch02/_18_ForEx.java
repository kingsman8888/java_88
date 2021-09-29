package ch02;

public class _18_ForEx {
	
	public static void main(String[] agrs) {
		
		// 2~20까지 짝수값만 더해서 합계 
		
		int sum = 0;
		
		// 1=, sum= 
		for (int i = 2 ; i<=20 ; i+=2) {
			sum = sum + i ;
			
			System.out.println("i = " + i + " sum = " + sum);
		}
		
		
		
	}
}
