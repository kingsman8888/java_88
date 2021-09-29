package ch07;
// 부모 클래스  // 추상클래스 
public abstract class _06_PDA implements _06_Mobile,_06_MP3 {
	// 2. 자식클래스에 상속시키고 인터페이스에 구현시킨다.
	
	public int calculate(int x, int y) {
		return x + y; 
	}
	

}
