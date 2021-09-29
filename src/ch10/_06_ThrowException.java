package ch10;

import java.util.Scanner;
public class _06_ThrowException {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		// readAge() : 나이를 입력 받아 출력
		// 입력받은 나이가 0세 미만이면 예외를 발생 : Arithmatic Exception 발생
	
		try {
			int age = readAge();
			System.out.println("나이 : " + age);
		} catch (Exception e) {
			System.out.println("예외: " + e.getMessage());
			e.printStackTrace();
		}finally {
			input.close();
		}
		System.out.println("종료");
		
		
	}
	static int readAge() throws Exception {
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		if ( age <= 0) {
			throw new Exception("나이는 0세이상 "); 
		}else {
			return age;
		}
	}
	
}
