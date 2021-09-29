package ch08;

class Book { // toString
	// class Book extends Object가 생략됨 -  Object 모든 클래스의 최상위 클래스
	// Object를 상속 받았기 때문에 호출시 Object 메서드를 사용할 수 있다. 예)toStirng()메서드
	
	/*
	    * 모든 클래스의 최상위 클래스 Object
	    * toString() 메서드가 재정의 않되어있다.
	    * 컴파일과정에서 Extends Object가 자동으로 추가되고, Object의 toString() 메서드가 호출되었다.
	    * Object의 toString() : 패키지명.클래스명@해시코드값 => 주소값  예) ch08._01_Book@7852e922
	    * 재정의해서 객체 정보를 문자열로 반환해서 사용해야 원하는 정보를 출력할 수 있다.
	    */
	// 354 356page 
	
	//멤버변수
	private int bookNumber;
	private String bookTtile;
	
	//매개변수생성자
	public Book (int bookNumber, String bookTtile){
		this.bookNumber = bookNumber;
		this.bookTtile = bookTtile;
	}
	
	@Override
	public String toString() {    // Object의 toString()메서드 재정의 부모메서드와 동일해야한다. return 타입 String
		return "책번호 : " + bookNumber + ", 책이름 : " + bookTtile;
	}
}

public class _01_toStringEx {   //메인이 있는 class에 public을 넣는다.
	public static void main(String[] args) {
		Book book = new Book(200,"개미"); // 매개변수에 값을 넣음
		
		System.out.println(book);   // book - 인스턴스 정보 (클래스이름, 주소 값)
		//ch08.Book@15db9742
		System.out.println(book.toString()); // book - toString()메서드로 원형은 생성된 인스턴스 정보 (클래스이름, 주소값)를 보여줌
		//ch08.Book@15db9742 - Object의 toString이 호출되어 주소값 출력 (재정의 하지 않으면 주소값 출력)
		// Objcet클래스의 toString의 원형은 getClass().getName() + '@' + Integer.toHexString(hashCode()) 
		// 클래스 이름@ 해시코드값 (16진수)
		
		//Integer와 String클래스는 toString()메서드를 미리 재정의 해두었기 때문에 재정의된 메서드가 호출된다.
		String str = new String("test");
		System.out.println(str);  //test
		Integer num = new Integer(100);
		System.out.println(num); //100
	}
}
