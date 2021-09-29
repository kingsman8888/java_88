package ch11;

import java.io.FileWriter;
import java.io.IOException;

//page 538 
public class _06_FileWriteTest {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			fw = new FileWriter("E:\\Dev88\\fileTest\\_6 FileWriter.txt"); // 자동생성
			fw.write('A'); // 문자하나를 출력

			char[] buf = { 'B', 'C', 'D', 'E', 'F', 'G' };
			fw.write(buf); // 배열값을 출력
			fw.write("즐거운 주말되세여~~");
			fw.write(buf, 1, 3); // 배열 일부 출력
			fw.write("88기");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출력완료~");

	}
}
