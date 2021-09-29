package ch05;

public class _06_ArrayEx {
	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3} // 0행
				,{4,5,6} // 1행
				};
		
		for (int i=0; i<2; i++) { //행 ->i < 배열의 길이
			for (int j=0; j<3; j++) {  // 열 -> j < 행의 길이
				System.out.println(arr[i][j]);  // 0행일때 3바퀴 돌아라 
			}
			System.out.println("");
		}
		
		System.out.println("=====================");
		for (int i=0; i<arr.length; i++) { //행 ->i < 배열의 길이
			for (int j=0; j<arr[i].length; j++) {  // 열 -> j < 행의 길이
				System.out.println(arr[i][j]);  // 0행일때 3바퀴 돌아라 
			}
			System.out.println("");
		}
		
			
	}
}
