package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_FileOutputSteam {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = null;   //파일을 byte단위로 읽겠다.
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("E:\\Dev88\\fileTest\\4_InputStream.txt");
			fos = new FileOutputStream("E:\\Dev88\\fileTest\\4_OutputStream.txt",true);
		
			int i;
			while((i = fis.read()) !=-1) {// input파일 1파이트씩 아스키 코드값으로 변환// 읽어서 i에 대입해 파일에 끝이 아닌동안 
				System.out.print((char)i); // 아스키값을 char형으로 변환후 화면에 출력 i값을 출력
				fos.write(i);  //input파일을 읽어서 output 파일에 출력
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) fis.close();
			if (fos != null) fos.close();
		}
		System.out.println();
		System.out.println("--- end ---");
		System.out.println("정상 종료");
	}
}

/* 콘솔결과
 * Good morning !!
 * --- end ---
 * 정상 종료
 */
/* 
 * 메모장 입력 - Good morning !!
 * 메모장 3번 실행 후 출력 결과 => 
 * Good morning !!Good morning !!Good morning !!Good morning !!Good morning !!Good morning !!Good morning !!Good morning !!
 */
