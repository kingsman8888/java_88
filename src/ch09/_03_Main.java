package ch09;

import java.util.ArrayList;
import java.util.List;

public class _03_Main {
	public static void main(String[] args) {
		
		
		//ArrayList 생성후 book 정보를 추가 (5권)
		//출력
		
		
		List<_03_Book> list = new ArrayList<_03_Book>();
		
		list.add(new _03_Book("아몬드","손원평"));
		list.add(new _03_Book("소년이온다","한강"));
		list.add(new _03_Book("딜러구트 꿈 백화점","이미예"));
		
		for (_03_Book book1 : list) {
			System.out.println(book1);
		}
		
		System.out.println("=====");
		for(int i=0; i<list.size(); i++) {
			_03_Book book = list.get(i);
			System.out.println(book);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
