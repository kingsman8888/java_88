package ch05;

public class _02_ArrayEx {
	public static void main(String[] agrs) {
		
		
		//방법2) 선언과 생성을 동시에 한다... 추천
       // 배열자료형[] 배열명 = new 배열자료형[배열갯수];
       //  배열명[index] = 값;
		
		String[] drink = new String[5];  //배열명 drink
		drink[0] = "아메리카노";
		drink[1] = "바닐라라떼";
		drink[2] = "카메모카";
		drink[3] = "오렌지주스";
		drink[4] = "딸기스무디";
		
		for (int i=0 ; i<5; i++) {   // 인덱스를 i로 주고 배열의 길이만큼 or 개수만큼
			System.out.println("drink [" + i + "] = " + drink[i]);
		}
		//방법4) 선언과 할당을 동시에 한다... 제일 많이 사용한다.
	   //    배열자료형[] 배열명 = {값1, 값2, 값3..값n}; 4
		
		System.out.println("=================");
		String[] drink1 = {"포도주스","딸기요거트","라떼","헤이즐넛","딸기주스"};
		
		for (int j = 0; j<5;j++) {
			System.out.println("drink1 [" + j + "] = " + drink1[j]);
		}
	}
}
