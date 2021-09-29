package ch10;

import java.util.Comparator;

//437page Comparator 재정의

public class _17_MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {  // 내림차순으로 정렬
		
		return (s1.compareTo(s2)) * -1;
	}
}
