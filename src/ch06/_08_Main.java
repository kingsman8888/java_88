package ch06;

public class _08_Main {
	public static void main(String[] args) {
		// 1. 자식의 매개변수 생성자 호출  =>전체 멤버변수 초기화
		// 다형성 : 부모클래스 참조변수 = new 자식클래스(); 매개변수를 통한 다형성을 적용  
		
		// static 이미 메모리 생성되어 바로 사용가능 인스턴스 생성 않해도 된다.
		printInfo(new _08_Manager("2015101","박찬호","야구부",2000000,100000));
		// call by reference => 메서드 호출시 호출 대상 부모매개변수에 주소값 전달
		printInfo(new _08_Sawon("201001","현주엽","농구부",1000000,50000));
	}
	
	public static void printInfo(_08_Employee employee) {
		//부모메서드, 자식메서드 출력 다형성 적용 
		employee.printInfo();   //오버라이드에 의해 자식메서드 호출
		if ( employee instanceof _08_Manager) {  //다운 캐스팅 
			_08_Manager manager = (_08_Manager)employee; //자식 클래스에만 있는 메서드 호출
			manager.calBonus();
		}
		if (employee instanceof _08_Sawon) { //다운 캐스팅 
			_08_Sawon sawon = (_08_Sawon)employee;
			sawon.calSudang(); //자식 클래스에만 있는 메서드 호출
		}
		
		
		
		
	
	}
}
