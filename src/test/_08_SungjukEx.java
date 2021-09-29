package test;

public class _08_SungjukEx{

	// 멤버변수
	private int kor;
	private int eng;
	private int math;
	private String grade;

	// 디폴트생성자
	public _08_SungjukEx() {
	}

	// 매개변수 생성자
	public _08_SungjukEx(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// setter , getter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) { // { 블럭 빼먹음
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// getTotal() 합계
	public int getTotal() {
		return kor + eng + math;
	}

	// getAvg() 평균
	public double getAvg() {
//		return (kor + eng + math) / 3.0;
		return (double) (kor + eng + math) / 3; // 일반적인 사용방법 
	}

	// getGrade() 학점
	public String getGrade() {

		switch ((int)getAvg()/10) { // swtich 변수값 잘못넣음 //위에서변경했으니 아래는 형변환 해줘야함(int)

		case 10:
		case 9:
			grade = "A";
			break; // 브레이크 빼먹음
		case 8:
			grade = "B";
			break; // 브레이크 빼먹음
		case 7:
			grade = "C";
			break; // 브레이크 빼먹음
		case 6:
			grade = "D";
			break; // 브레이크 빼먹음
		default:
			grade = "F";
		}

		return grade; // 변수 String grade 생성 새로함
	} // 블럭 넣지않음

	public void printInfo() { // void 옆에 print를 넣음
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + getTotal());
		System.out.printf("평균 : " + "%6.2f",getAvg());  // 소수점 2재자리 까지 출력
		System.out.println("");
		System.out.println("학점 : " + getGrade());
	}

}