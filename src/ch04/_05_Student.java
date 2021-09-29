package ch04;

//181page static 변수, 메서드
public class _05_Student {
	
	// static 변수   // 이해못하믄 플젝을 못만든다.
	
	// public int serialNum = 1000; 일반변수
	public static int serialNum = 1000;    // 메인메서드는 자동으로 메모리에 올라간다. 자바가상머신에 의해
	
	//멤버변수 
	public int studentID; // 학번
	public String studentName; // 이름
	
	
	// 디폴트생성자
	public _05_Student() {
		studentID = serialNum++;  // 디폴트생성자에서가 아니라 메인에서도 증가가능하다.
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
	
	
	
	

}
