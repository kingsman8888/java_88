package ch06;

public class _07_Main {
	public static void main(String[] args) {
		
		// 부모클래스 참조변수 = new 부모클래스();
		
		_07_Animal animal = new _07_Animal();
		animal.move();
		
		// 자식 클래스 참조변수 = new 자식클래스();
		_07_Human human = new _07_Human();
		human.move();
		human.readBook();
		
		System.out.println("==== 다형성을 적용하여 인스턴스 생성======");
		
		System.out.println("-------- Human --------");
		//부모클래스 참조변수 = new 자식클래스(); 
		_07_Animal hanimal = new _07_Human();
		
		hanimal.move();  //오버라이드(재정의)가 되어서 자식 메서드 호출  : 사람이 움직입니다.
		
		// hanimal.readbook(); // 에러..readbook()은 자식메서드이므로
		// 오버라이드 하기전 다운캐스팅 확인 
		if ( hanimal instanceof _07_Human) {
			_07_Human human1 = (_07_Human)hanimal;
			human1.readBook();  //그래야 하위클래스의 메서드도 접근가능하다.
		}
		System.out.println("-------- Eagle --------");
		_07_Animal eanimal = new _07_Eagle();
		eanimal.move();
		
		//형변환 다운캐스팅
		if (eanimal instanceof _07_Eagle) {
			_07_Eagle eagle = (_07_Eagle)eanimal;
			eagle.flying();
		}
		
		System.out.println("-------- Tiger --------");
		_07_Animal tanimal = new _07_Tiger();
		
		tanimal.move();
		if (tanimal instanceof _07_Tiger) {
			_07_Tiger tiger = (_07_Tiger)tanimal;
			tiger.hunting();
		}
		
		
		
		
		
	}
	
	
}
