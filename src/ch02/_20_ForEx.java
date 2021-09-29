package ch02;

public class _20_ForEx {
	
	public static void main(String[] args){
		/*
		 * break문 예제
		 * - 반복문의 중첩되어 있을 경우 break;문은 가장 가까운 반복문만 종료 
		 * - 바깥쪽 반복문 까지 종료 시키려면 반복문의 이름(라벨)을 붙이고, "break 이름;" 라벨을 사용
		 * - 반복문안에서 continue문을 만나면, 그 이후에 문장은 수행하지 않고 다음 반복문 수행,
		 *   break문은 반복문을 더 이상 수행하지 않고 빠져나올때 사용한다.
		 */ // page 121
		
		// sum이 100이상 이면 빠져나온다. break사용
		
		int sum = 0;
		for (int i = 1 ;  ; i++) {  // 반복횟수가 없는 대신 조건식을 생략하고 break;를 사용한다.
			sum += i;
			if (sum >= 100)
				break;	
			System.out.println(" i : " + i + " sum : " + sum);
		}
	}
}
