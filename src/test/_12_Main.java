package test;  // 패키지 빼먹음

public class _12_Main{  //class 빼먹음
	public static void main(String[] agrs){
	
	_12_ShinhanBank shinhan = new _12_ShinhanBank();
	
		shinhan.setBankName("신한은행");
		shinhan.setAccountNumber("110-343-1223");
		shinhan.setRate(2.1);
		shinhan.executeLoan();
		shinhan.setEvent("금리인하");
		shinhan.printInfo();
	
	_12_WooriBank woori = new _12_WooriBank();
	
		woori.setBankName("우리은행");
		woori.setAccountNumber("1002-050-447307");
		woori.setRate(4.9);
		woori.makeWooriProduct();
		woori.setVipMember(" VIP ");
		woori.printInfo();
		
	}
}

/*
 * 2) 오버라이딩 개념 
자식클래스에서 부모클래스를 (오버라이드)재정의한다.
멤버변수,멤버메서드,매개변수,반황형 까지 모두 동일해야한다.

3) 상속의 문법개념
상속은 extends로 연장.확장하다의 뜻으로
상위클래스는 보편적인 일반적인 기능을 갖고 있고 
하위클래스는 상위클래스의 기능을 공통적으로 갖고있으나 좀더 세밀하고 
추가적인 기능을 가지고 있기때문에 유지보수, 추가기능 추가시 관리가 용이하다.
*/
