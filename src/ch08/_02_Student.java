package ch08;

public class _02_Student {

	// 물리적 동일(주소 동일) : 1000 1000 .. 100, 이상원 => Object의 equals() : 주소값 비교 => 물리적 동일
	// : "==", 오버라이드 안된 equals()
	// 논리적 동일(값 동일) : 2000 ... 100, 이상원 => 오버라이드 : 값 비교 => 논리적 동일(값 동일) : 오버라이드된
	// equals()

	// 359page + 361 => equals() 오버라이드해서 lee와 sang이 동일하게 나오도록
	// 365 page => hashCode()오버라이드해서 학번 리턴 (equals 밑에 넣는다)

	private int studentId;
	private String studentName;

	public _02_Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override // 오버라이드된 equals스가 호출
	public boolean equals(Object obj) { // 다형성 비교객체가 Object
		if (obj instanceof _02_Student) {
			_02_Student s = (_02_Student) obj; // equals()메서드의 재정의 다운캐스팅
			if (this.studentId == s.studentId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() { // 해시코드 값으로 학번을 반환 하도록 메서드 재정의
		return studentId;
	}

	@Override
	public String toString() {
		return " studentId : " + studentId + "studentName : " + studentName;
	}
}
