package ch05;

public class _03_BookMain {
	public static void main(String[] args) {
		
		// 자료형[] 배열명 = new 자료형[개수]
		// 배열명에 주소값이 들어감 (아래 생성했을때의 주소값)
		_03_Book[] library  = new _03_Book[5];// 배열의 자료형 클래스타입
		
		// 1. 매개변수 생성자를 통해 값 설정  -> Book 클래스 2번
		library[0] = new _03_Book("데미안","헤르만 허세"); // 각각의 매개변수를 0번째 인덱스에 줘라.
		// 원래는 => _03_Book book = new _03_Book(주소값) // 클래스자리에 대신 배열이 들어왔다.
		// library[1] = book(아래와 같은뜻) 주소값을 주기때문에 library는 참조변수 뜻 
		// new _03_Book 생성하면 주소값 100을 -> library[0] 넣는다.
		// 힙메모리에 각 메모리생성 주소값 생성 // 배열에 각위치에 
		library[1] = new _03_Book("달러구트 꿈 백화점","팩토리나인"); // 매개변수 생성자 호출
		// library[0] 생성하면서 새로운 주소값 200 -> library[2]
		library[2] = new _03_Book("태백산맥","조정래"); // library[3] 배열주소값 
		library[3] = new _03_Book("질서너머","조던 피터슨");
		library[4] = new _03_Book("공간의 미래","유현준");
		
				
		library[0].showBookInfo();
		System.out.println("");
		
		for (int i = 0; i<5; i++) {
			library[i].showBookInfo();
		}
		for (int i = 0; i<5; i++) {
			System.out.println(i + ": " + library[i]);
		}
		
		//set?
		
	}
	

}
