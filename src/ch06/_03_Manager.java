package ch06;

public class _03_Manager extends _03_Employee {

	//멤버변수
	private int bonus;
	
	//디폴트생성자
	public _03_Manager() {}
	
	public _03_Manager(int bonus) {}
	
	//setter getter
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	//멤버메서드
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : " + bonus);
	}
	
	
}
