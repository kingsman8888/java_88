package test;

import java.util.Iterator;  // 오타

	public class _18_Main{   //오타
	public static void main(String[] args){

	_18_Book aa1 = new _18_Book (101, "부서진여름", "이정명");
	_18_Book aa2 = new _18_Book (102, "아버지에게 갔었어", "신경숙");
	_18_Book aa3 = new _18_Book (103, "칼의노래", "김훈");

	_18_BookArrayList arrlist = new _18_BookArrayList();
	
	arrlist.addBook(aa1);
	arrlist.addBook(aa2);
	arrlist.addBook(aa3);
	
	
	arrlist.removeBook(aa3.getBookNo());  // 접근을 클래스명으로 함

	arrlist.showAllBook();
	
	_18_Book aa4 = new _18_Book (104, "뿌리깊은 나", "이정명");
	arrlist.addBook(aa4);
	
	
	System.out.println("========");
	Iterator<_18_Book> iter = arrlist.list.iterator(); // 접근을 잘못함

		while(iter.hasNext()){

		 _18_Book book = iter.next();
		 System.out.println(book );

		}
	}
}
