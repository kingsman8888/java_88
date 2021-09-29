package ch04;

//181page static 변수, 메서드
public class _06_Student {
	
	// static 변수   // 이해못하믄 플젝을 못만든다.
	
	// public int serialNum = 1000; 일반변수
	public static int serialNum = 1000;    // 메인메서드는 자동으로 메모리에 올라간다. 자바가상머신에 의해
	public static String studentName1;
	
	//멤버변수 
	public int studentID; // 학번
	public String studentName; // 이름
	
	
	// 디폴트생성자
	public _06_Student() {
		studentID = serialNum++;  // 디폴트생성자에서가 아니라 메인에서도 증가가능하다.
		// serialNum++
		// studentID = serialNum;
	
	}
	
	// getter, setter
	public int getStudentID(int studentID) {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName(String studentName) {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// 추가
	
	public static void setSerialNum(int serialNum) {
		_06_Student.serialNum = serialNum;
	}
	
	//static 메서드내에서 멤버변수 사용불가, 인스턴스가 생성될 때 만ㄷ르어지는 인스턴수 변수이므로 
	public static int getSerialNum() {
		// 오류 studentName = "이지원"; // studentName가 인스턴스 변수이므로 오류=>studentName을  static로 바꾸면 OK
		studentName1 = "이지원";  // 로컬변수만 사용가능하나 static 메모리로 등록하면 사용가능
		return serialNum;
	}
	
	
	
	

}
