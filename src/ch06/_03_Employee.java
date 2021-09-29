package ch06;

public class _03_Employee {
	
	// 멤버변수
	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	//디폴트생성자
	public _03_Employee() {}
	
	//매개변수생성자
	public _03_Employee(String sabun,String name,int deptName,int salary) {
		
	}
	
	//setter getter
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	//멤버메서드
	public void printInfo() {
		System.out.println
		("사번 : " + sabun + "\n이름 : " + name + "\n부서명 : " + deptName + "\n급여 : " + salary);
	}

}
