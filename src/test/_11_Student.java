package test;

public class _11_Student {

	private String studentID; // 학번
	private String name; // 이름
	private int age; // 나이
	private String hobby; // 취미

	//디폴트 생성자
	public _11_Student() {
	}

	//매개변수 생성자
	public _11_Student(String studentID,String name,int age,String hobby){
	this.studentID = studentID;
	this.name = name;
	this.age = age; // 매개변수 생성 빼먹음.
	this.hobby = hobby;
	}
	//setter, getter
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	//showInfo()
	public void showInfo() {
		System.out.println
		("학번 : " + studentID + ", 이름 : " + name + ", 나이 : " + age + ", 취미 : " + hobby);
	}
}