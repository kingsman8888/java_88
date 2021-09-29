package ch04;

public class _02_SungjukMain {
	public static void main(String[] agrs) {
		
		int kor = 80;
		int eng = 90;
		int math = 100;
		
		// 방법1. 생성자
		_02_Sungjuk sung = new _02_Sungjuk(kor,eng,math);
		
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sung.getToTAL());
		System.out.println("평균 : " + sung.getAvg());
		
		System.out.println("==================");
		
		//방법2. setter
		
		_02_Sungjuk sung1 = new _02_Sungjuk();
		
		sung1.setKorScore(kor);
		sung1.setEngScore(eng);
		sung1.setMathScore(math);
		
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sung1.getToTAL());
		System.out.println("평균 : " + sung1.getAvg());
	}

}
