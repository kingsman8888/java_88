package ch03;

public class _02_Member {
	
	// 멤버변수가 private이면 메인에서 값 할당 불가
	// => 1. 생성자로 초기화, 2. setter 메서드로 초기화
	// 값 초기화 불가
	// 멤버변수
	String name;  //private로 앞에 접근하면 메인에서 오류난다.
	String brithDay;
	int age;
	String address;
	
	//생성자
	public _02_Member() {}
	
	// 멤버메서드 - 멤버변수의 값 출력
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + brithDay);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	

}
