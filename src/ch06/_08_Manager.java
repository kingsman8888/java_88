package ch06;

public class _08_Manager extends _08_Employee{
	
	//멤버변수
	private int bonus;
	
	// 디폴트생성자
	public _08_Manager() {}
	
	// 매개변수 생성자
	public _08_Manager(String sabun,String name,String deptName,int salary, int bonus) {
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
	public void calBonus() {
		// 연보너스 : salary * 12 + bonus
		System.out.println("연보너스 :" + (super.getSalary() * 12 + bonus));
	
	}
	
	//출력정보
	@Override
	public void printInfo() {
		super.printInfo(); //부모의 참조변수 
		System.out.println("\n보너스 : " + bonus );
	}
}
