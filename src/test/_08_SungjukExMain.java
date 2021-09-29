package test;

public class _08_SungjukExMain {
	public static void main(String[] args) {

		System.out.println("====매개변수생성자====");
		_08_SungjukEx score = new _08_SungjukEx(34, 23, 34);

		score.printInfo();

		System.out.println("====디폴트 생성자====");
		_08_SungjukEx score1 = new _08_SungjukEx();

		score1.setKor(80);
		score1.setEng(90);
		score1.setMath(100);

		score1.printInfo();

	}
}