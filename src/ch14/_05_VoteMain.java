package ch14;

public class _05_VoteMain {
	
	public static void main(String[] args) {
		
		//객체 5개, 스레드 5개
		//각각 영향을 받지 않고, 각자 일을한다. 
		
		
		Thread loc1 = new Thread(new _05_VoteThread(),"인천");
		Thread loc2 = new Thread(new _05_VoteThread(),"울산");
		Thread loc3 = new Thread(new _05_VoteThread(),"광주");
		Thread loc4 = new Thread(new _05_VoteThread(),"서울");
		Thread loc5 = new Thread(new _05_VoteThread(),"제주");
		
		loc1.start();
		loc2.start();
		loc3.start();
		loc4.start();
		loc5.start();
		//순서를 기다리지 않고 발생된다.
	}

}
