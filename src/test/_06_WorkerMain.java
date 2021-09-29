package test;

public class _06_WorkerMain {  // class옆 띄어쓰기 않함

public static void main(String[] agrs){
	
	// 인스턴스생성
	_06_Worker park = new _06_Worker();
	
	// setter를 이용한 값 설정
	park.setSabun(202101); // set메서드명에 클래스명을 넣음
	park.setName("박찬호"); // set메서드명에 클래스명을 넣음
	park.setAge(45); // set메서드명에 클래스명을 넣음
	
	// 출력
	park.showInfo();
	
	System.out.println("===============");
	// 매개변수 생성자를 이용한 값 설정
	_06_Worker kim = new _06_Worker(202102, "김병현", 40);

	// 출력
	kim.showInfo();  // 참조변수를 위 park를 넣음
	}
} // 블럭 빼먹음