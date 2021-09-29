package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _04_IOException {
//JVM Virtual Machine이	main() 호출
	
	public static void main (String[] args)  {
		/*
		 * 501page 예외처리 미루기- throws 
		 * - 예외를 해당메서드에서 처리(try-cath)하지 않고 미룬 후, 메서드를 호출하여 사용하는 부분에서 예외를 처리하는 방법니다.
		 * - throws Exception
		 * 
		 */
		
		
		//throw Exception fis = new Exception();
		
		
		
	}		
	
	public static Class loadClass(String fileName, String classNme) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("1.txt");
		Class c = Class.forName(classNme);
		return c;
	}
		
}
	
		
