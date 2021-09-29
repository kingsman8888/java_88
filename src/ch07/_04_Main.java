package ch07;

public class _04_Main {

	public static void main(String[] args) {
		
		//int num1 = 20; 값을 메인에서 주고 출력 OK 
		//int num2 = 10;
		
		System.out.println("===다형성 적용===");
		
		_04_Calc cal = new _04_CompletcCalc();
		
		// cal.showInfo(); ==>에러, 자식클래스의 멤버변수이므로 부모참조변스로 접근불가	
		
		System.out.println
		("add: " + (cal.add(10, 20)) + "\nsudstaract: " + (cal.sudstaract(20, 10)) + "\ntimes: " + (cal.times(20, 10))+"\ndiv : " +(cal.divide(100,0)));
		//다운캐스팅
		if (cal instanceof _04_CompletcCalc) {
			_04_CompletcCalc calcul = (_04_CompletcCalc)cal;
			calcul.showInfo();
		}
		
	}
}
