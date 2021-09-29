package ch09;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayList {


	public static void main(String[] args) {
		/*
		8. 검색 : list.indexOf(검색할 값);  // 중요
	 *     리스트에서 검색할 값과 똑같은 값을 갇는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
	 *     검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
	 *     
	 *     list.lastIndexOf(검색할 값);
	 *     => 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번재 데이터를 찾아서 그 이치의 인덱스를 리턴한다.
	 *     검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
	*/
		
		List<String> list = new ArrayList<String>();
		
		list.add("H"); // 0번째  
		list.add("O");  
		list.add("N");  
		list.add("G");  
		list.add("K");  
		list.add("I");  
		list.add("L");  
		list.add("D");  
		list.add("O");  
		list.add("N");  
		list.add("G");  // 10번째  
		
		//일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		System.out.println("G문자의 인덱스 : " + list.indexOf("G")); // 3
		System.out.println("N문자의 인덱스 : " + list.indexOf("N")); // 2
		 
		
		System.out.println("G문자의 마지막 인덱스 : " + list.lastIndexOf("G")); 
		System.out.println("N문자의 마지막 인덱스 : " + list.lastIndexOf("N"));
		
		System.out.println("Z문자의 인덱스 : " + list.indexOf("Z"));
		
		System.out.println("");
		System.out.println("전체 리스트 출력"); 
		for (String listAll : list) {
			System.out.print(listAll);
		}
		
		System.out.println("");
		System.out.println("-----------");
		list.clear();
		System.out.println("리스트 삭제후");
		System.out.println("list : " + list);  //list : []

		
	}
	
}
