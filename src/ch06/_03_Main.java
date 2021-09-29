package ch06;

public class _03_Main {
	
	public static void main(String[] args) {
		
		
		_03_Sawon sawon = new _03_Sawon();
		
		sawon.setSabun("202101");
		sawon.setName("김병현");
		sawon.setDeptName("총무팀");
		sawon.setSalary(100000); // 급여
		sawon.setSudang(50000); // 수당
		sawon.printInfo();
		
		
		System.out.println("===");
		_03_Manager manager = new _03_Manager();
		
		manager.setSabun("201501");
		manager.setName("박찬호");
		manager.setDeptName("회계팀");
		manager.setSalary(2000000);
		//manager.printInfo(); // 재정의된 자식메서드가 호출
		
		manager.setBonus(100000);
		manager.printInfo(); // 재정의된 자식 메서드가 호출
	}

}
