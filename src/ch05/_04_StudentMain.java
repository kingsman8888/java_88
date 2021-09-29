package ch05;

public class _04_StudentMain {
	public static void main(String[] args) {
		
		
		// 3명의 student 정보를 배열로 출력 
		
	_04_Student[] student = new _04_Student[3];
	
	student[0] = new _04_Student("박찬호","45","park@naver.com");
	student[1] = new _04_Student("유희관","35" , "yoo@gmail.com");
	student[2] = new _04_Student("김병현","42", "kim@daum.net");
	
	System.out.println("일반for문");
		for(int i = 0; i<3 ; i++) {
			student[i].showInfo();
		}
		
	System.out.println("");	
	String[] baseball = {"박찬호 "," 45"," park@naver.com"};
	
		for(String pitcher : baseball) {
			System.out.print(pitcher);
		}
	
		
	}
}
