package test;

public class _17_Main {
	
	public static void main(String[] args) {
		
	_17_SubBookInfo showinfo = new _17_SubBookInfo("A1535","자라투스트라는 이렇게 말했다.","니체","","");
		
	showinfo.checkOut("박찬호", "2021-05-28");
	//System.out.println("===동일한 책 대출시===");
	//showinfo.checkOut("박찬호", "2021-05-28");
	
	System.out.println("===========");
	showinfo.checkIn();
	
	}
}