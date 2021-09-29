package ch06;

//자식 클래스 
public class _06_Human extends _06_Animal{

	
	//디폴트생성자
	public _06_Human () {}
	
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	
}
