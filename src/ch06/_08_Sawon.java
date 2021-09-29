package ch06;
//자식클래스
public class _08_Sawon extends _08_Employee {

	//멤버변수
	private int sudang;
	
	//디폴트생성자
	public _08_Sawon() {   // 자식 디폴트 생성자 호출하면 부모먼저 호출하기 때문에 오류난다 생성자 막아서 확인하면 오류 
		System.out.println("자식의 디폴트 생성자");
	}
	
	// 매개변수 생성자
	public _08_Sawon(String sabun,String name,String deptName,int salary,int sudang) {
		//2. 자식의 매개변수 생성자 -> 부모의 매개변수 생성자 호출
		super(sabun, name, deptName, salary);  //부모의 매개변수 생성자 호출, 반드시 첫번째 줄에 작성
		// 생성시점에 호출 해야 하기때문에 호출전에 앞에 변수값을 넣을 수 있기 때문에 허용하지 않기 위해 
		System.out.println("자식의 매개변수 생성자");
		//2. 부모의 매개변수 생성자 호출 
		 // 매개변수 값을 부의 생성자로 넘겼다
		this.sudang = sudang;
	}
	
	//setter getter
	public void setSudnang(int sudang) {
		this.sudang = sudang;
	}
	public int getSudang() {
		return sudang;
	}
	
	public void calSudang() {
		// 연수당 : salary * 12 + sudang
		System.out.println(" 연수당 : " + (super.getSalary() *12 + sudang));
	}
	
	//멤버메서드
	@Override
	// 5-2 호출
	public void printInfo() {
		super.printInfo();  // 부모 참조변수.멤버메서드();
		System.out.println("\n수 당 : " + sudang);
	}
}
