package test;

import java.util.ArrayList;
import java.util.List;

	public class _18_BookArrayList{ 

	public List<_18_Book> list;  

	
	public _18_BookArrayList(){  // 클래스명 오타
		list = new ArrayList<_18_Book>(); // ArrayList 오타
	}
	public void addBook(_18_Book book){
		list.add(book);  // ; 세미콜론 넣지 않음
	}
	// 해당 책정보 삭제
	public boolean removeBook(int bookNo){   //103번 책 삭제
		for (int i=0; i<list.size(); i++){
			_18_Book book = list.get(i);  
			int num = book.getBookNo();
			if ( num == bookNo){
			list.remove(i);
			return true;   //리턴을 for문에 블럭 않에 넣음
			}			
		}
		
		System.out.println(" 입력하신 책번호 " + bookNo + "가 없습니다."); // 매개변수값을 않넣음
		return false;
	}

	//책정보 조회
	public void showAllBook(){
		for ( _18_Book book : list){
			System.out.println(book);
		}
	}
}