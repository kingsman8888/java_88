package ch06;

public class _04_Main {
	public static void main(String[] args) {
		
		//자식의 매개변수 생성자 호출  //자식이 힙메모리 생성전에 부모가 먼저 등록된다.
		// 1. 자식의 매개변수 생성자 호출
		_04_Sawon sawon1 = new _04_Sawon(); //부모디폴트, 자식 디폴트 생성자 호출
		
		System.out.println("------ sawon -----");
		_04_Sawon sawon2 = new _04_Sawon("S001","박찬호","야구부",1000000,10000); //자식 매개변수 생성자 호출
		
		sawon2.printInfo();  //호출하면 자식것만 호출됨 
		
		System.out.println("------ manager -----");
		_04_Manager manager = new _04_Manager("A001","추신수","농구부",2000000,100000);
		
		manager.printInfo();
		
	}
}
