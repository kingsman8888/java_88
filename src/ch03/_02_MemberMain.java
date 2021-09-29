package ch03;

public class _02_MemberMain {
	
	public static void main(String[] agrs) {
		
		
		_02_Member kim = new _02_Member(); // new 오는 클래스명 선택시 생성자 선택
		
		kim.name = "김병현";
		kim.brithDay = "19860227";
		kim.age = 36;
		kim.address = "서울특별시 광진구";
		
		kim.showInfo();
	}

}
