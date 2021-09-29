package ch04;

public class _06_StudentMain {
	public static void main(String[] args) {
		
		
		// 인스턴스 생성  // 스태틱 메서드를 호출하는 예제 
		
		_06_Student lee = new _06_Student();
		lee.setStudentName("이철진");
		lee.setStudentID(1);
		System.out.println(_06_Student.getSerialNum()); // 클래스명.static 변수  // get은 돌려주기때문에 get으로 호출해도된다. 메서드 호출
		System.out.println("serialNum : " + _06_Student.serialNum + ", 이름 : " + lee.studentName + ", 학번 : " + lee.studentID);
		
		
		lee.setStudentID(1);
	
		
		System.out.println("------------");
		_06_Student iu = new _06_Student();
		iu.setStudentName("아이유");
		iu.setStudentID(2);
		System.out.println(_06_Student.getSerialNum());
		System.out.println("serialNum : " + _06_Student.serialNum + ", 이름 : " + iu.studentName + ", 학번 : " + iu.studentID);
		
		System.out.println("------------");
		
		
		
		
			
		
	}

}
