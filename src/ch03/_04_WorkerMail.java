package ch03;

public class _04_WorkerMail {
	public static void main(String[] agrs) {
		
		// 인스턴스 생성  - 메인클래스에서 다른 클래스를 접근하기 위해 힙메모리 올린다.
		_04_Worker park = new _04_Worker();
		
		
		System.out.println("===============");
		// 초기값설정  setter는 값을 받아서 멤버변수에 설정
		park.setSabun("1001");
		park.setName("박명수");
		park.setSalary(1000000);
		
		//출력
		// park.prinInfo(); 
		
		System.out.println("===============");
		// 참조변수.멤버메서드
		// get은 멤버변수의 값을 전달해준다/
		System.out.println("사번 : " + park.getSabun());
		System.out.println("이름 : " + park.getName());
		System.out.println("급여 : " + park.getsalary());
		
		
		
		
		
		
	}
}
