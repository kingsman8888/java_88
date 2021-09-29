package test;  // package 오타

public class _14_Sawon extends _14_Employee{
	
	//멤버변수
	int sudang;
	
	//디폴트생성자
	public _14_Sawon(){}

	//매개변수생성자
	public _14_Sawon(String sabun,String name,String deptName,int salary,int sudang){
		super(sabun,name,deptName,salary);
		this.sudang = sudang;
	}
	//setter getter
	public void setSudang(int sudang){
		this.sudang = sudang;
	}

	public int getSudang(){
	return sudang;
	}
	
	//receiveBonus - 자식꺼
	public void receiveSudang(){ // 조건문에 한글이 가능한줄 모르고 작성 못함.
		int receiveSudang = 0;
		switch(super.getDeptName()) {
		case "기획부" : 
			receiveSudang = (int)(super.getSalary() * 0.05);
			break;
		case "전산부" :
			receiveSudang = (int)(super.getSalary() * 0.1);
			break;
		case "영업부" :
			receiveSudang = (int)(super.getSalary() * 0.15);
		}
		System.out.println("부서별 수당 : " + receiveSudang);
	}
		
	//출력
	@Override
	public void printInfo(){
	super.printInfo();
	System.out.println("수당 : " +  sudang);
	}
}