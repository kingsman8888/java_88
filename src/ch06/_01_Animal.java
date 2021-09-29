package ch06;

//부모클래스 ( 하위클래스와 공통인것 ex) 멤버변수 )
public class _01_Animal {
	
	//멤버변수        - 하위클래스와 공통으로 사용 
	private String kind;  //종류
	private int legs;   //다리
	
	//디폴트생성자
	public _01_Animal() {}
	
	// 매개변수 생성자
	public _01_Animal(String kind,int legs) {
		this.kind = kind;
		this.legs = legs;
	}
	
	// 멤버메서드 (setter getter)
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLegs() {
		return legs;
	}
	// 공통메서드 
	public void eat() {
		System.out.println("먹다~~");
	}
	public void sleep() {
		System.out.println("자다~~");
	}
	public void play() {
		System.out.println("놀다~~");
	}
	
	
	
	// 멤버메서드
	public void printInfo() {
		System.out.println("kind : " + kind + " legs : " + legs);
	}
	
	

}
