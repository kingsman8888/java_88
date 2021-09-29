package ch02;

public class _21_ForEx {

	public static void main(String[] agrs) {
		
		String str = "no pain no gain";
		int count = 0;
		// str.charAt(i) == 'n' 조건식에 n인지 아닌지 확인하는법  // i는 인덱스(위치)로 0
		// n이 발견되면 count에 누적시키고 n이 아니면 반복문을 타고 다시 n을 
		
		for (int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) !='n')
				continue;  // 아래 문장을 수행하지 않고 다시 for문으로 올라간다.
			count ++;
		}
		
		System.out.println("str의 길이 : " + str.length()); // 15 면 출
		System.out.println("문장에서 발견된 n의 갯수 : " + count);
		
	}
}
