package ch07;
// 메인
public class _01_Main {

	public static void main(String[] args) {
		// 부모클래스 참조변수 = new 자식클래스(); 다형성
		_01_Computer desktop = new _01_DeskTop();
		
		// 다형성 적용 
		desktop.display();  //부모메서드를 재정의해서 자식메서드가 호출 (오버라이드)
		desktop.typing();   // 오버라이드에 의해 자식메서드 호출
		desktop.turnOn();
		desktop.turnOn();
		
		// 불완전한 메서드 완벽하지 않기 때문에 힙메모리에 올릴수 없다. 오류
		// 추상클래스는 인스턴스를 생성할 수 없다.(추상클래스가 가지고 있는 추상메서드는 구현않된 불완전 메서드 이므로)
		//_01_Computer desktop1 = new _01_Computer; ==> 오류
		
		_01_Computer mynote = new _01_MyNoteBook();
		mynote.turnOff();
		mynote.turnOn();
		mynote.display();
		mynote.typing();
		
		
		
		
		
		
	}

}
