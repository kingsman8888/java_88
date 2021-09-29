package test;  // package 오타

public class _14_Manager extends _14_Employee{  // extends 빼먹음 

	//멤버변수
	private int bonus;
	
	//디폴트생성자
	public _14_Manager(){}

	//매개변수생성자 
	public _14_Manager(String sabun,String name,String deptName,int salary,int bonus){
		super(sabun,name,deptName,salary);
		this.bonus = bonus;
	}
	//receiveBonus - 자식꺼
	public void receiveBonus(){    // 조건문에 한글이 가능한줄 모르고 작성 못함.
		if (super.getDeptName() == "기획부") {
			System.out.println("부서별 보너스 : " + (int)(super.getSalary() * 0.05));
		} else if (super.getDeptName() == "전산부") {
			System.out.println("부서별 보너스 : " + (int)(super.getSalary() * 0.1));
		} else {
			System.out.println("부서별 보너스 : " + (int)(super.getSalary() * 0.15));
		}
	}
	
	//printInfo()
	@Override
	public void printInfo(){
	super.printInfo();
	System.out.println("기본 보너스 : " + bonus);
	}

}