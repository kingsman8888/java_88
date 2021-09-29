package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// 525page
public class _03_FileInputStream {
	
	public static void main(String[] args) throws IOException {
		// 3_InputStream.txt를 byte 단위로 읽어서 콘솔에 출력.. 한글은 2바이트이므로 깨진다.
		// 주의사항 : 탐색기 파일 확장명이 보이도록 체크한다.
		// 메모장 저장시 UTF-8로 선택 되어야한다.
		
		
		FileInputStream fis = null;  // FileInputStream 바이트 단위 
		// 예외발생 => try-> catch -> finally
		// 예외발생 않하면=> catch -> finally
		
		try {
			fis = new FileInputStream("E:\\filetest\\input.txt"); // 먼저 txt파일을 작성하고 경로를 복사 
			// 파일은 UTF-8로 인코딩을 해서 저장 해야한다.
			int i;      // throws JVM 에게 전달 
			while((i = fis.read()) != -1) { // 참조변수를 1바이트로 읽어서 read를 i에 대입해서 묶는다. -1이 아닌동안 돌아서 읽어서 문자로 변경한다.
				// fis를 읽어서 i변수에 대입해서 그 대입한 값을 -1이 아닌동안(파일의 끝이 아닌동안)도달하면 -1을 반환
			System.out.print((char)i); // 출력
			}  // 예외를 IOException 넘기고 또 발생되며 다시 넘기던 거기서 try catch를 한다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fis.close();  // 자원해제 반복문에 있으면 열고 닫기하니 주의
		}
		System.out.println("--- end ---");
		System.out.println("=== 정상 종료 ===");
	}

}
