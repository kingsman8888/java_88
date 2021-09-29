package ch04;

public class _03_StudentMain {
	public static void main(String[] agrs) {
		
		
		// 인스턴스 생성 (힙메모리 등록)
		// 방법1. 디폴트 생성자, setter로 값을 설정 
		System.out.println("===방법1. 디폴트 생성자, setter로 값 설정 ===");
		
		_03_Student park = new _03_Student();  
		
		// 값설정은 setter로 
		park.setStudentID("200101");
		park.setStudentName("홍길동");
		park.setScore(90);
		
		park.printInfo();
		
		// 방법2. 매개변수생성자로 값 설정
		System.out.println("===방법2. 매개변수 생성자 값 설정 ===");
		
		_03_Student park1 = new _03_Student("200101","홍길동",90);
		
		park1.printInfo();
//		System.out.println("학번 : " + park1.getStudentID());
//		System.out.println("이름 : " + park1.getStudentName());
//		System.out.println("점수 : " + park1.getScore());
		
		System.out.println(park1);
		park1.printInfo();
		
		
	}

}
