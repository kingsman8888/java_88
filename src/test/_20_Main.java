package test;  // ; 세미콜론 빼먹음
import java.util.Scanner;
public class _20_Main{  //class 오타남 
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){

		_20_Student student = new _20_Student();

		try {
			student = callStudentInfo();
			student.printStudentInfo();
		} catch (Exception e) {
			System.out.println(e.getMessage()); // e.getMessage 오타남
		} finally {
			sc.close();
		}
		System.out.println("종료");// 종료문 않적음

	}
		
	public static int callScore() throws _20_InvalidScoreException {
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if (score < 0) {
			_20_InvalidScoreException s = new _20_InvalidScoreException("점수는 0점 이상 입력하세요");
			s.setWrongScore(score);
			s.showWrongScore();
			throw s;
		}
		return score;
	}

	public static String callName() throws _20_InvalidNameException {
		System.out.print("이름을 입력하세요 : " );
		String name = sc.next();
		if ( name == null){  // (name.length()로 넣음 오류)
			_20_InvalidNameException nn =  new _20_InvalidNameException ("이름은 null이 될수없습니다.");
		nn.setWorongName(name);
		nn.showWrongName();
		throw nn;
		} else if ( name.length() < 2 || name.length()>12){  // length() 않넣음
			_20_InvalidNameException nn1 = new _20_InvalidNameException ("이름은 4자 이상 12자이하로 입력하세요");
		nn1.setWorongName(name);
		nn1.showWrongName();
		throw nn1;
		} 
		return name;
	}

	public static _20_Student callStudentInfo() throws Exception { // throws Exception 않넣음
		String name = callName();
		int score = callScore();
		return new _20_Student(name, score);
	}
}