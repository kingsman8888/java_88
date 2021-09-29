package ch07;

/*
 * 래퍼선스 타입 자료형
 * - 배열, 클래스, 인터페이스 
 */

public class _09_InterfaceEx {
	public static void main(String[] args) {
		
		A09 a09 = new A09();
		a09.autoplay(new B09());  // I09 i09 = new B09(); (래퍼런스 자료형 인터페이스 가능)
		a09.playstop(new B09());
	}
}

class A09 {
	public void autoplay(I09 i09) {  // 매개변수의 다형성.. 다형성이 적용된 call by reference
		// 인터페이스의 추상메서드 호출 
		i09.play();
	}
	public void playstop(M09 m09) { // 매개변수에 클래스명 참조병 --> 부모클래스 참조변수 = new 자식클래스(매개변수의 다형성) 
		m09.stop();
	}
}
interface I09{
	void play(); // 추상메서드
}

interface M09{
	void stop();
}


 // I09 인터페이스 구현
class B09 implements I09,M09 {
	@Override
	public void play() {
		System.out.println("B09클래스 - play()");
	}

	@Override
	public void stop() {
		System.out.println("B09클래스 - stop()");
	}

}

