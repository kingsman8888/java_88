package ch10;

public class _07_IDFormaTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUser(String userID) throws _07_IDFormatException {
		if (userID == null) {
			throw new _07_IDFormatException("아이디는 null 일수가 없습니다.");  // 강제로 예외발생
		}
		else if (userID.length() < 8 || userID.length()>20) {
			throw new _07_IDFormatException("아이디는 8자 이상 20자 이하로 입력하세요.");  // 강제로 예외발생
		}
		this.userID = userID; // 초기화
	}

}
