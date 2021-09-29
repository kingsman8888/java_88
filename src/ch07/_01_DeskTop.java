package ch07;
//자식 클래스 - DeskTop 설계도
public class _01_DeskTop extends _01_Computer{
	// 1. 구현이 되지 않은 메서드를 추가한다. Override (구현이 않된 부모메서드를 그대로 가지고 온다.)
	// 일반메서드로 구체화 하겠다. 구현되지 않은 메서드가 있을시는 추상클래스 모두 구현되면 일반 클래스.
		
	@Override
	public void display() {
		System.out.println("_01_DeskTop - display()");
		
	}

	@Override
	public void typing() {
		System.out.println("_01_DeskTop - typing()");
	}
	
	
	
		
	
}
