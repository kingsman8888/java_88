package ch13;

//ch09 06 복사  //기존 출력 방식 삭제 메서드 호출 
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
		memberHashMap.removeMember(1004);

		memberHashMap.showAllMember();
		
		//기존 메서드를 직접 만들어서 호출해서 사용했다.
		
		System.out.println("===== 스트림을 이용한 방법 =====");
		_06_Member iu = new _06_Member(1004,"아이유");
		memberHashMap.create(iu);  //매개변수로 주소값전달
		// key값을 동일하게 넣으면 중복될수 없기때문에 마지막 값으로 덮어쓴다.
		
		//한사람의 정보 조회 - 이름으로 조회
		System.out.println("아이유 => " + memberHashMap.selectByName("아이유"));
		
		System.out.println("아이유 => " + memberHashMap.selectByID(1004));
		
		//예외체크해서 중복이 되었다고고객에게 알려야한다.
		// _06_MeberHashMap 51행
		
		//KEY중복시 예외처리 예외발생 (덮어써지지 않도록)
		/*
		Exception in thread "main" ch13._06_MemberIdDupExeption: 이미 존재하는 회원입니다.
		at ch13._06_MeberHashMap.lambda$0(_06_MeberHashMap.java:53)
		at java.util.Optional.ifPresent(Unknown Source)
		at ch13._06_MeberHashMap.create(_06_MeberHashMap.java:52)
		at ch13._06_Main.main(_06_Main.java:30)	
		 * 
		 */
		
		
	}

}
