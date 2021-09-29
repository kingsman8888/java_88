package ch06;

// 자식 클래스
public class _01_Dog extends _01_Animal  {

	// 생성자  (만들어서 힙메모리에 올림) 메인에서 인스턴스 생성
	public _01_Dog() {}
	
	public void bark() {
		System.out.println("멍멍~멍");
	}
	
	
}
