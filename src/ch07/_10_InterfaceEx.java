package ch07;

public class _10_InterfaceEx {
	public static void main(String[] args) {
		
		A10 a10 = new A10();
		a10.methodA();
	}
}

class A10 {
	public void methodA() {
		// 인터페이스 타입 다형성 적용
		I10 i10 = InterceManager.getInstance();    //오류 않나게 호출   클래스명.메서드명 접근(static)
		  i10.methodB(); // 리턴타입 맞추고 참조변수값 넣는다 (static)
		
	}
}

interface I10 {
	public void methodB();  // 추상메서드
}

class B10 implements I10{  //부모클래스 
	public B10() {  
		System.out.println("B10 디폴트 생성자 호출");
	}

	@Override
	public void methodB() {
		System.out.println("B10 클래스 - methodB()");
	}  
}

class InterceManager {
	/*
	 * 	팩토리 메서드 (facrtory method)
	 *  - 객체를 생성하는 정적 팩토리메서드 이다.
	 *   이것은 디자인 패턴의 하나로 객체를 만드는 부분을 자식 클래스에게 위임하는 패턴이다.
	 *   즉 new 연산자를 호출하여 객체를 생성하는 코드를 자식 클래스에게 위임한다.
	 *   사용하는 이유는 하나의 클래스가 변경 되었을 경우 다른 클래스의 변경을 최소화하기 위함이다.
	 *   
	 *   팩토리 메서드 이름은 많이 사용되는 것은 getInstance()이다.
	 *   인터페이스에서 팩토리 메서드를 제공할때 정적메서드를 사용하게 된다.
	 *   static이므로 클래스명.정적메서드로 접근 
	 */
	//정적 메서드
	public static I10 getInstance() {   // 인스턴스를 생성 하는 메서드 
		return new B10();  // 다형성 적용  //B10의 리턴타입 static을 맞춰준다.  // I10 I10 = new B10();
	}
}