package ch04;

public class _05_StudentMain {
	public static void main(String[] args) {
		
		
		// 인스턴스 생성
		
		_05_Student lee = new _05_Student();
		lee.setStudentName("이철진");
		lee.setStudentID(1);
		System.out.println(_05_Student.serialNum); // 클래스명.static 변수
		System.out.println("serialNum : " + _05_Student.serialNum + ", 이름 : " + lee.studentName + ", 학번 : " + lee.studentID);
		
		
		
	
		
		System.out.println("------------");
		_05_Student iu = new _05_Student();
		iu.setStudentName("아이유");
		iu.setStudentID(2);
		System.out.println(_05_Student.serialNum);
		System.out.println("serialNum : " + _05_Student.serialNum + ", 이름 : " + iu.studentName + ", 학번 : " + iu.studentID);
		
		System.out.println("------------");
		
		
		
		
			
		
	}

}
