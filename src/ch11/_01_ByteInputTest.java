package ch11;

import java.io.IOException;
// 515page
public class _01_ByteInputTest {

	public static void main(String[] args) {

		System.out.print("알파벳 하나를 쓰고 [Enter]를 누르세요 : ");

		try {
			int i = System.in.read(); // read();메서드는 콘솔창에서 1byte만 읽음
			System.out.println("i : " + i); // 아스키값 출력 : 65
			System.out.println((char) i); // A

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
