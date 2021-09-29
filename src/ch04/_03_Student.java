package ch04;

public class _03_Student {
	
	// 멤버변수
	private String studentID; // 학번 : 200101
	private String studentName; // 이름 :  홍길동
	private int Score; // 성적 : 90
	
	// 디폴트 생성자
	// 디폴트 생성자는 컴파일러가 자동으로 생성(생성자가 하나도 없는 경우에만 해당) setter와 매개변수 모두 만들시 디폴트생성자가 없으면 오류가 난다.
	// 디폴트 생성자가 없을 경우 컴파일러가 자동으로 생성하는데 
	// 매개변수가 없고, 멤버변수 초기화할수 있다.
	public _03_Student() {}		//값설정은 디폴드값 0 ,디폴트값 주석처리 하면 오류. 메인에서 호출하기때문
	
	// 매개변수 생성자 = > 디폴트 생성자를 먼저 생성 후에 매개변수 생성자를 만든다.
//	생성자 오버로드 : 생성자가 두개 이상 제공되는 경우를 생성자 오버로드라고 한다.
//	오버로드 : 메서드나 생성자의 매개변수 갯수가 다르거나, 매개변수 타입이 다른경우 말한다.( 단 리턴타입은 무관한다.)
	public _03_Student(String studentID,String studentName,int Score) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.Score = Score;
	}

	// 멤버메서드(setter, getter)   // 기본이다 
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setScore(int Score) {
		this.Score = Score;
	}
	
	//getter
	public String getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getScore() {
		return Score;
	}
	
	// 멤버메서드
	// printInfo() - 멤버변수로도 출력, 멤버메서드  2가지로 출력 
	public void printInfo() {
		System.out.println("--- 멤버변수 ---");
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("성적 : " + Score);
		System.out.println("--- 멤버메서드 ---");
		System.out.println("학번 : " + getStudentID());
		System.out.println("이름 : " + getStudentName());
		System.out.println("점수 : " + getScore());
		
		System.out.println("=======");
		System.out.println(this);
		
	
	}

}
