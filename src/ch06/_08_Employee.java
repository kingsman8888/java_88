package ch06;
//부모클래스 
public class _08_Employee {
	
	// 4. 멤버변수
	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	// 디폴트생성자
	public _08_Employee() {
		System.out.println("부모 디폴트생성자");
	}

	// 3. 매개변수 생성자 
	public _08_Employee(String sabun,String name,String deptName,int salary) {
		System.out.println("부모 매개변수생성자");
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	
	// 멤버메서드(setter, getter)
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
	
	//5-1 출력 printInfo()
	public void printInfo() {
		System.out.print("사번 : " + sabun + "\n이름 :" + name + "\n부서명 : " + deptName + "\n급여 : " + salary);
	}
}
