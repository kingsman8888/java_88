package ch03;


// setter. getter => DTO (Data Transfer Object) 사용
// 회원가입시 가입 후 데이터를 setter에 값설정 후 getter에서 디비에 저장 -> 이후 getter에서 불러온다.
public class _04_Worker {
	
	// 멤버변수 - 속성
	private String sabun; // 사번 : 1001
	private String name; // 이름 : 박명수
	private int salary; // 급여 : 1000000
	
	//기본생성자
	public _04_Worker() {}
	
	
	// 멤버메서드 - setter - 메인에서 값을 받아 멤버변수에 설정 
	// 1. main에서 값 전달 -> 2. 매개변수 -> 3. 멤버변수
	public void setSabun(String sabun) {
		this.sabun = sabun;   // 멤버변수  = 매개변수
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//getter -  sabun을 get하겠다. 값을 되돌려 줄때 사용. 돌려줄꺼기 때문에 매개변수 필요없다.
	public String getSabun() {
		 return sabun;
	}
	public String getName() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	
	// 멤버메서드 - 출력기능
//	public void prinInfo() {
//		System.out.println("사번 : " + sabun);
//		System.out.println("이름 : " + name);
//		System.out.println("급여 : " + salary);
//		
//		System.out.println("사번 : " + getSabun());
//		System.out.println("이름 : " + getName());
//		System.out.println("급여 : " + getsalary());
//	}

}
