package ch11;

import java.io.IOException;

// 516 page
public class _02_ByteInputTest {
	
	public static void main(String[] args) {
		
		System.out.print("알파벳 여러개를 쓰고 [Enter]를 누르세요 : ");
		
		while(true) {  // 무한루프
			try {
				int i = System.in.read();
				if( i == 13) {  // 13 : 줄바꿈 , 13 : Enter
					System.out.println("");
					System.out.println(" 출력 완료 ");
					break;
				}
				System.out.print((char)i);
				
			} catch (IOException e) {
				e.printStackTrace();
			}  //한바이트 씩 읽어서 아스키값으로 출력
		
		}
	}

}
