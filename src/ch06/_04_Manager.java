package ch06;

public class _04_Manager extends _04_Employee{
	
	
	//멤버변수
	private int bonus;
	
	// 디폴트생성자
	public _04_Manager() {}
	
	// 매개변수 생성자
	public _04_Manager(String sabun,String name,String deptName,int salary, int bonus) {
		super(sabun, name, deptName, salary);  // 상속을 하지 않으면 오류 발생
		//부모의 참조 메서드 
		this.bonus = bonus;
	}
	
	//setter getter
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	//출력정보
	@Override
	public void printInfo() {
		super.printInfo(); //부모의 참조변수 
		System.out.println("\n보너스 : " + bonus);
	}
}
