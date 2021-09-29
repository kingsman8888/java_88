package ch04;

public class _07_SingleToneMain {
	public static void main(String[] agrs) {
		
		// 인스턴스 생성 : // default 생성자가 private으로 접근불가
        //_07_Company instance =  new _07_Company();
		
		
		//setter값을 통해 값 전달, 출력(단 싱글톤 패턴을 이용해 접근)
		
		_07_Company instance1 = _07_Company.getInstance();
		_07_Company instance2 = _07_Company.getInstance();
		
		
		instance1.setCompanyName("현대자동차");
		instance1.setAddress("서울시 강남구");
		instance1.setTelno("02-555-5555");
		
		instance1.printInfo();
		
		System.out.println("==========");
		
		instance2.setCompanyName("현대백화점");
		instance2.setAddress("서울시 송파구");
		instance2.setTelno("02-444-5646");
		instance2.printInfo();
		
		System.out.println(instance1);
		System.out.println(instance1 == instance2);  // true
		
	}

}
