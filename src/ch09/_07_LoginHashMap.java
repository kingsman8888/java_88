package ch09;

import java.util.HashMap;
import java.util.Scanner;

public class _07_LoginHashMap {
	public static void main(String[] args) {
		
		/*[시험]
		 * 
		 * 1. id, pwd 5건을 hashTable에 저장 (hashMap에 저장)
		 * 		id     pwd
		 * 		"hong" "hong1234"
		 * 		"park" "par1234"
		 * 		"lee"  "lee1234"
		 * 		"kim"  "kim1234"
		 * 		"son"  "son1234"	
		 * 
		 * 2. 콘솔로 부터 id, pwd를 입력받는다.(로그인)
		 * 3. 1과 2를 비교해서 
		 *   아이디가 없으면 "입력한 아이디가 존재하지 않습니다." 출력
		 *   아이디가 있으면 비밀번호와 비교해서 
		 *           일치시 "로그인 성공" 출력
		 *           불일치시 "비밀번호가 일치 하지 않습니다." 출력 
		 *          
		 * 4. Q나 q이면 종료          
		 * 
		 */
		
		HashMap<String, String> list = new HashMap<String, String>();
		
		list.put("hong", "hong1234");
		list.put("park", "park1234");
		list.put("lee", "lee1234");
		list.put("kim", "kim1234");
		list.put("son", "son1234");
		
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("아이디를 입력하세요 : ");
			String id = input.next();
			
			if (id.equals("Q")||id.equals("q")) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				if (list.containsKey(id)) {  // 입력받은 아이디를 포함하면 비밀번호 입력 
					System.out.print("비밀번호를 입력하세요 : ");
					String pwd = input.next();
				
					if (pwd.equals(list.get(id))) {  // 키를 통해서 값을 가져온다. 입력한 아이디 키값에 들어있는 값과(pwd)와 동일하면 로그인성공
						System.out.println("로그인 성공");
						break;
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}else {
					System.out.println("입력한 아이디가 확인되지 않습니다.");
				}
			}
		}while(true);
		
		input.close();
		

	}
 }

