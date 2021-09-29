package ch10;

public class _09_Main {
	public static void main(String[] args) {

		/*
		 * [면접] - 왜사용하는지 ? 장점이 뭔지 
		 * 제네릭 : 여러 참조자료형이 쓰일 수 있는 곳에 특정한 자료형을 지정하지 않고 
		 * 		제네릭 클래스의 인스턴스 생성시점에 어떤 자료형을 사요할 것인지 지정하는 방식
		 * 		T자료형이 결정되는 시점보다 static이 빠르므로 static에서는 사용할 수 없다.
		 *
		 * 		T : Type parameter
		 * 		E : element
		 * 		K : Key
		 * 		V : Value
		 * 
		 * - 제네릭으로 구현하면 형변환을 하지 않아도 된다.(매개변수의 다형성, 다운캐스팅을 않해도 된다.)
		 * => 제네릭 클래스를 사용하면 컴파일러는 일단 대입된 자료형이 잘 쓰였는지확인한다.
		 * class 파일을 생성할 때 T를 사용한 곳에 지정된 자료형에 따라 컴파일 하므로
		 * 단 제네릭 클래스가 static이면 예외
		 */
		
		_09_GenericPrint<_09_Powder> powderP = new _09_GenericPrint<_09_Powder>();
		
		powderP.setMeterial(new _09_Powder()); // _09_Powder meterial
	
		_09_Powder a = powderP.getMeterial();
		
		a.doPrintg();
		
		powderP.getMeterial();
		System.out.println(a.toString());
		
		_09_GenericPrint<_09_Plastic> plasticP = new _09_GenericPrint<_09_Plastic>();
		
		plasticP.setMeterial(new _09_Plastic());
		
		_09_Plastic b = plasticP.getMeterial();
		
		b.doPrintg();
		
		System.out.println(b.toString());
	
	}
}
