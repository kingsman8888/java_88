package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 536page
public class _05_FileReaderTtest {

	public static void main(String[] args) throws IOException  {
		
		FileReader fr = null;
		
		try {
			// 파일 직접 생성(새로만들기 - 텍스트문서).. 저장시 인코딩을 UTF8	저장 
			fr = new FileReader("E:\\Dev88\\fileTest\\_5_FileReader.txt");
			
			int i;
			while((i = fr.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fr !=null) fr.close();
		}
		System.out.println();
		System.out.println("--- end ---");
		System.out.println("정상종료");
		
	}
}

/* 한글이 않깨지고 콘솔에 제대로 출력됨
 * 
 * 현재시작 12시20분

	1시간 후 점심시간이다 
	--- end ---
	정상종료
 */
