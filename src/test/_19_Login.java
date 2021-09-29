package test;

import java.util.HashMap;
import java.util.Scanner;

	public class _19_Login{
		
		public static void main(String[] args) {  //메인 빼먹음
			
			HashMap<String, String> log = new HashMap<String, String>();

			log.put("aaa", "aaa123");
			log.put("bbb", "bbb123");
			log.put("ccc", "ccc123");

				Scanner input = new Scanner(System.in);

			do{
				System.out.print("아이디를 입력하세요 : ");
				 String id = input.next();

				if ( id.equals("E") || id.equals("e")){  // ) 빼먹음
					System.out.println("프로그램 종료");  // 세미콜론 빼먹음
					break;
				} else {
					if ( log.containsKey(id)){  // containsKey 오타 , ) 빼먹음
						System.out.print("비밀번호를 입력하세요 : ");
						String pwd = input.next();
						
						if (pwd.equals(log.get(id))){   // getKey로 오타
							System.out.println("로그인 성공");
							break;
						}else{
							System.out.println("비밀번호가 틀렸습니다.");
						}	
						
					}else {
					System.out.println("아이디가 없습니다.");
					}	
				}
			}while(true);
			input.close();  // close 빼먹음
		}
}