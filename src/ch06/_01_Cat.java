
package ch06;

public class _01_Cat extends _01_Animal{

	//멤버변수 (공통) 부모에게 맡겨놓음(내가 소유한거랑 동일)
	//private String kind;  //종류
	//private int legs;   //다리
	
	//생성자
	public _01_Cat() {}
	
	//멤버메서드 getter setter 부모에게 맡겨놓음(내가 소유한거랑 동일)
	
	
	//멤버밴서드 (공통) 부모에게 맡겨놓음(내가 소유한거랑 동일)
	/*public void eat() {
		System.out.println("먹다~~");
	}
	public void sleep() {
		System.out.println("놀다~~");
	}
	public void play() {
		System.out.println("놀다~~");
	}
	*/
	public void cry() {
		System.out.println("야오옹~~");
	}
	
}
