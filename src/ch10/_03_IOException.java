package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//실행 예외처리 
public class _03_IOException {

	public static void main(String[] args) {
		
		FileInputStream fis = null;  
		
		try {
			fis = new FileInputStream("1.txt"); // 예외가 발생할 수 있는 가능성
		} catch (FileNotFoundException e) {
			System.out.println("getMessage() => " + e.getMessage());  // 에러의 원인을 간단히 출력
			e.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
			return ;  // return을 보내서 함수종료 : "정상종료~~" 출력않됨, finally는 작동 
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally 문장이므로 항상 수행");
		}
		System.out.println("정상종료");
		
	}
}
