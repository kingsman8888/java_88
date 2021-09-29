package ch03;

public class _03_Car {
	
	// 멤버변수가 private이면 메인에서 값 할당 불가
	// => 1. 생성자로 초기화, 2. setter 메서드로 초기화
	// 값 초기화 불가
	// 멤버변수
	
	// 멤버변수
	private String company;
	private String model;
	private int speed;
	private String color;
	
	
	//생성자
	public _03_Car() {}
	
	// setter - 값 설정
	// String company = "현대자동차";
	
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// 멤버메서드
	public void showInfo() {
		System.out.println("회사이름 : " + company);
		System.out.println("차모델명 : " + model);
		System.out.println("차량속도 : " + speed);
		System.out.println("차량색상 : " + color);
	}
}
