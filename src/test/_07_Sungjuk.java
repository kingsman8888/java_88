package test;
public class _07_Sungjuk{

	// 멤버변수 
	private int kor;
	private int eng;
	private int math;
	
	//기본생성자
	public _07_Sungjuk(){}

	//setter 메서드
	public void setKor(int kor){  // void 빼먹음 
	this.kor = kor;
	}
	public void setEng(int eng){  // void 빼먹음 
	this.eng = eng;
	}
	public void setMath(int math){  // void 빼먹음 
	this.math = math;
	}

	//getTotal(){
	public int getTotal(){
		return kor + eng + math;
	}

	//getAvg(){}
	public double getAvg(){
		double result = (double)(kor + eng + math) / 3; // ;세미콜론 빼먹음
		return result;   // return 오타
	}
}

