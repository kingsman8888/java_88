package ch08;

//367page
/*
 * 마커 인터페이스 : 구현할 메서드가 없는 인터페이스
 * 예) Cloneable : 객체를 복제할 때 사용하는 인터페이스로서, Cloneable 인터페이스에서 구현
 * 하지만 clone()을 하지 않으면 복제 되지 않는다.
 * 
 */
public class _05_Circle implements Cloneable {

	_05_Point point;
	int radius;

	public _05_Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new _05_Point(x, y); // 생성시점에 포인트도 생성했다.
		// point로 호출하면 된다.
	}

	@Override
	public String toString() {
		return "원점은" + point + " 이고, " + radius;
	}

	// 복제메서드
	// CloneNotSupportedException : 클래스의 clone() 메서드가 지원되지 않았을 경우 예외클래스

	@Override
	protected Object clone() throws CloneNotSupportedException { // throws : 상위메서드에게 예외를 떠넘긴다.)
		return super.clone(); // super => Object
	}
}
