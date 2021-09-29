package ch09;

public class _06_Main {
	
	public static void main(String[] args) {
		
		_06_MeberHashMap memberHashMap = new _06_MeberHashMap();
		
		_06_Member lee = new _06_Member(1001, "이지원");
		_06_Member son = new _06_Member(1002, "손민국");
		_06_Member park = new _06_Member(1003, "박서훤");
		_06_Member hong = new _06_Member(1004, "홍길동");
		
		
		memberHashMap.addMember(lee);
		memberHashMap.addMember(son);
		memberHashMap.addMember(park);
		memberHashMap.addMember(hong);
		
		
		memberHashMap.showAllMember();
		System.out.println("==삭제후===");
		memberHashMap.removeMember(1002);
		
		memberHashMap.showAllMember();
	}

}
