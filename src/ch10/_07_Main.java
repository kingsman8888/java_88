package ch10;

public class _07_Main {
	
	public static void main (String[] args) {
		
		_07_IDFormaTest test = new _07_IDFormaTest();
		
		String userID = null;
		
		try {
			test.setUser(userID);
		} catch (_07_IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		
		try {
			test.setUser(userID);
		} catch (_07_IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
