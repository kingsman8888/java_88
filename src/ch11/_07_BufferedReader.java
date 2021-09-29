package ch11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// 543page
public class _07_BufferedReader {

	public static void main(String[] args) throws IOException {
		/*
		 * 보조 스트림 Buffered 스트림은 멤버변수로 8.912 바이트 배열을 가지고 있다. 즉 한번 자료를 읽을 때 8KB정보를 한꺼번에 읽고
		 * 쓸수 있으므로 1바이트씩 읽고 쓸때마다 훨신 수행 속도가 빠르다. 매개변수는 기반 스트림을 주로 사용한다.
		 * 
		 * 
		 */

		BufferedReader in = null;
		PrintWriter out = null; // 교재에는 없음

		try {
			in = new BufferedReader(new FileReader("E:\\Dev88\\fileTest\\_7_fileReader.txt")); // 직접작성
			out = new PrintWriter("E:\\Dev88\\fileTest\\_7_fileWriter.txt"); // 자동생성

			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}

		System.out.println("출력완료");

	}

}
