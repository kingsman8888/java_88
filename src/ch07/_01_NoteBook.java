package ch07;
// 자식클래스 
public abstract class _01_NoteBook extends _01_Computer {
	//1. 부모클래스 상속 후 구현되지 않은 메서드를 추가한다.
	//추상메서드가 1개라도 있으면 추상클래스에 abstract를 붙여 추상클래스임을 알려야한다. 
	
	@Override
	public void display() {
		System.out.println("_01_NoteBook - display()");
	}

	
	//public void typing(); 이 구현이 않되어 있으므로 abstract 클래스가 된다.
	
	
	
	
}
