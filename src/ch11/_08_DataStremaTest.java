package ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 588 page
public class _08_DataStremaTest {
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		
		try { 
			fos = new FileOutputStream("E:\\Dev88\\fileTest\\8_data.txt");
			dos = new DataOutputStream(fos); // 보조스트림

		// 각 자료형에 맞게 data를 작성
		//fos 경로에 자동생해서 읽는다 
		//읽은것을 DataInputStream 리드한다 
			
			dos.writeByte(50);
			dos.writeChar('B');
			dos.writeInt(30);
			dos.writeFloat(3.14f);
			dos.writeUTF("Hello");
			
			fis = new FileInputStream("E:\\Dev88\\fileTest\\8_data.txt"); // 파일이름이 동일해야한다.(작성된 파일을 읽어야됨으로.
			dis = new DataInputStream(fis); // 보조스트림
		
			// 각 자료형에 맞에 data를 읽어서 콘솔에 출력
			// 파일에 쓴 순서와 같은순서, 같은 메서드로 읽어야 합니다.
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // 자동생성.. 기반스트림
		
		/*
		 * 50
			B
			30
			3.14
			Hello

		 */
	}
}
