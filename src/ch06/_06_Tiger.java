package ch06;

public class _06_Tiger extends _06_Animal {
	
	public _06_Tiger() {}
	
	@Override    // 상속을 해야 오류 않난다 // 부모메서드를 재정의 한다.
	public void move() {  // 똑같으니까 재정의 된다고 알려야한다.
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}
