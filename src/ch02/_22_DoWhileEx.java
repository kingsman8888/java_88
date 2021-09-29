package ch02;

public class _22_DoWhileEx {
	
	public static void main(String[] agrs) {
		
		/* [ 1달후 개인플젝 할때 do-while을 모르면 시작도 못한다 ]
		 * do-while문 : 반드시 1번은 수행해야 하는 경우사 사용,
		 * 			   조건이 만족할때 블록을 빠져 나간다.
		 * 			  데이터를 처리하기 전에 사용자로부터 메뉴나 데이터를 입력받아야 하는 경우 많이 사용
		 * 
		 * 
		 * do{
		 * 		수행문1; 
		 * 		수행문2;
		 * 		...
		 * } while(조건식);
		 */
		// 1부터 10까지의 합
		int num = 1;
		int sum = 0;
		do {
			sum += num; // sum = sum + num;
			num++;
		}while (num <=10); 
		System.out.println("1부터10까지의 합 : " + sum);
		
		
		
	}

}
