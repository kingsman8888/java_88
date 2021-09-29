package ch06;

public class _02_Car {
	
	//멤버변수
	private String kind;
	private int speed;
	
	//생성자
	public _02_Car() {}
	
	//매개변수 생성자
	public _02_Car(String kind,int speed) {
		this.kind = kind;
		this.speed = speed;
	}	
	//setter getter
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//멤버메서드
	public void carInfo() {
		System.out.println("kind : " + kind + ",speed : " + speed);
		
	}
}
