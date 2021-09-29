package ch12;

import java.util.ArrayList;

public class _03_Main {
	public static void main(String[] args) {
		
		// 매개변수 생성자를 통해 값 전달 
		
		_03_Enum c = new _03_Enum(Animal.CAT,"앵두"); 
		_03_Enum d = new _03_Enum(Animal.DOG,"댕댕"); 
		_03_Enum f = new _03_Enum(Animal.FISH,"시리");
		
		
		// 리스트에 담는다.
		ArrayList<_03_Enum> arr = new ArrayList<>();
		
		arr.add(c);
		arr.add(d);
		arr.add(f);
		
		//향상된 for문으로 출력 포이치문
		for (_03_Enum ani : arr) {
			System.out.println(ani.getKind() + ani.getName());
		}
		
		
		
		
	}
}
