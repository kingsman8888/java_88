package test;

public class _07_SungjukMain { // 클래스명 띄어쓰기 않함
	public static void main(String[] agrs){  // static 오타
	int kor = 70;
	int eng = 80;
	int math = 77;

	_07_Sungjuk sung = new _07_Sungjuk();  // 생성자 () 빼먹음

	sung.setKor(70);
	sung.setEng(80);
	sung.setMath(77);

	System.out.println(" 국어 : " + kor);  // System s소문자로 넣음
	System.out.println(" 영어 : " + eng); // System s소문자로 넣음
	System.out.println(" 수학 : " + math); // System s소문자로 넣음
	System.out.println(" 합계 : " + sung.getTotal()); // System s소문자로 넣음
	System.out.printf(" 평균 : " + "%6.2f",sung.getAvg()); // System s소문자로 넣음


	}
} // 블럭 않넣음