package ch08;

public class _09_Main {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// throws forName 메서드에서 발생하는 예외를 처리함. 이름과 일치하는 클래스가 없는 경우 발생
		_09_Person person = new _09_Person();
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName()); // Object의 getClass() 메서드 사용하기
		
		Class pClass2 = _09_Person.class; // 직접 class 파일 대입하기
		System.out.println(pClass1.getName());
		
		Class pClass3 = Class.forName("ch08._09_Person"); // 클래스 이름으로 가져오기 (패키지명.클래스명)
		// forName - static 메서드 (클래스를 생성하지 않고 바로사용)
		System.out.println(pClass1.getName());
	}
}
