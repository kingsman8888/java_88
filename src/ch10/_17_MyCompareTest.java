package ch10;

import java.util.Set;
import java.util.TreeSet;

public class _17_MyCompareTest {
	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>(new _17_MyCompare());
		// TreeSet의 생성자의 매개변수로 정렬방식을 지정
		// _17_MyCompare 재정의한 compare()메서드 방식에 따라 내림차순으로 정렬방식 변경된다.

		set.add("aaa");
		set.add("ccc");
		set.add("bbb");

		System.out.println(set);

	}

}
