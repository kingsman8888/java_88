package ch10;

import java.util.Scanner;

public class _05_ThrowsException {

	static Scanner input = new Scanner(System.in);  // 양쪽에서 입력받기 위해 밖으로 뺀다.
	
	public static void main(String[] args) {  // throws Exception // 3.JVM에게 예외처리를 미룬다 
		
		/* 1. 예외 발생 					-> 2. 예외 던지기 			-> 3. 예외처리 (내가 직접처리 하지 않고 상위로 넘긴다) 
		 * throw new Exception(메세지);   -> throws Exception		-> catch(던진 Exception) {e.getMessage()} 1.에서 메세지를 전달하기위해 ( 3에서 getMessage에 출력시킬)
		 * ↑ 1. 예외발생 (메세지를 주고 던지겠다. ( 3번에서 출력하기 위해 ) 메세지를 입력하고 
		 * 
		 * 
		 */
		
		// 입력받은 이름이 2자미만이면 예외를 발생해라 
		
		
		// 3. 예외처리 : try ~~ cacth ~~ finally
		
			try {
				String name = readName();
				System.out.println("이름 : " + name);
				
			} catch (Exception e) { // Exception e = new Exception();
				System.out.println("예외메세지 : " + e.getMessage());
				e.printStackTrace();
			}finally {
				input.close();
			}
			System.out.println("정상종료");
	
		
	}													//try catch 를 미루겠따.
	static String readName() throws Exception   { // 2. 상위 메서드에서 예외처리를 미루는 throw Exception;
		System.out.print("이름을 입력하세요 : ");
		 String name = input.next(); // 입력받은값을 변수에 담는다.
		 if (name.length() < 2) {  //문자의 길이 2자니 정상 
			throw new Exception("이름은 2글자 이상");//1. 강제 예외 발생 : throw new Excption(message);  //디폴트 생성자를 강제로 만들어라
			  // Exception 클래스의 매개변수 생성자를 호출하여 ..message로 전달한다.
			 //매개변수 생성자로 메세지를 전달 3번에
		 } else {
			 return name;
		 }
	} 
}
