package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _09_ImageCopy {
	// 교재에 없으나 많이 사용한다.
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		System.out.print("원본파일명을 입력하세요 : "); // 경로포함
		String inputFileName = input.next(); // file명을 읽는다.

		System.out.print("복사 파일명을 입력하세요 : ");
		String outputFileName = input.next();

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(inputFileName);
			fos = new FileOutputStream(outputFileName);

			int i; // 파일을 읽는다.
			while ((i = fis.read()) != -1) { // at end 까지 읽어라.
				fos.write(i);
			}
			System.out.print(inputFileName + "를 " + outputFileName + "으로 복사하였습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			input.close();
		}

	}

}
/* 실행 
 1) kakaomask.png 이미지 파일을 다운 받는다.
 실행 : 
 원본 파일명을 입력하세요 : 
 복사 파일명을 입력하세요 : 
 ==> kakaomask.png 파일이 복사됨
 */
