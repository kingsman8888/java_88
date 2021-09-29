package test;

public class _14_Main{
	public static void main(String[] args){
	

		System.out.println("==1. 다형성을 적용한 출력");
		_14_Employee emp1 = new _14_Manager("Ma2015098", "추신수", "전산부", 1000000, 50000);
		emp1.printInfo();
		if (emp1 instanceof _14_Manager) {
			_14_Manager manager = (_14_Manager) emp1;
			manager.receiveBonus(); // 메서드명 오타
		}
		_14_Employee emp2 = new _14_Sawon("Sa2019055", "이대호", "기획부", 1000000, 25000);
		emp2.printInfo();
		if (emp2 instanceof _14_Sawon) {
			_14_Sawon sawon = (_14_Sawon) emp2;
			sawon.receiveSudang();
		}

		System.out.println("==2. 매개변수를 통한 다형성 적용한 출력");
		System.out.println("----매니저----");
		printInfo(new _14_Manager("Ma2015098", "추신수", "전산실", 2000000, 50000));
		System.out.println("----사원----");
		printInfo(new _14_Sawon("Sa2019055", "이대호", "영업부", 1000000, 25000));
	}

	public static void printInfo(_14_Employee emp) {
		emp.printInfo();
		if (emp instanceof _14_Manager) {
			_14_Manager manager1 = (_14_Manager) emp;
			manager1.receiveBonus(); // 메서드명 오타
		} else if (emp instanceof _14_Sawon) { // else 오타 instanceof 오타
			_14_Sawon sawon1 = (_14_Sawon) emp;
			sawon1.receiveSudang();
		}

	}
}