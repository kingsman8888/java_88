package ch13;
//470page

interface _02_PrintString {
	void showString(String str);
}
  // 자식클래스를 오른쪽에 구현 System.out.println(ss);
public class _02_TestLamda {
	public static void main(String[] args) {
		_02_PrintString lamdaStr = ss -> System.out.println(ss);
		lamdaStr.showString("Hello lamda 1"); // 5행 호출
		showMyString(lamdaStr); // 메서드의 매개변수로 람다식을 대입한 변수(lamdaStr) 전달
	}

	// 매개변수를 인터페이스 형으로 받음 (자료형을 인터페이스형으로) 주소값 전달 call by reference
	public static void showMyString(_02_PrintString pr) {
		pr.showString("Hello lamda 2");
	}
}
