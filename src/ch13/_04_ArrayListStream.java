package ch13;
// 477page

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _04_ArrayListStream {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();

		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> str1 = sList.stream(); // 스트림을 클래스를 반환하며 제네릭형을 사용헤 자료형을 명시 할 수있다.
		str1.forEach(s1 -> System.out.print(s1 + " ")); // 람다식 사용
		// 출력결과 Tomas Edward Jack

		System.out.println();
		// 스트림을 새로 생성.. 최종연산을 하면 스트림의 자료를 소모하면서 연산을 수행하기 때문에 더 이상 사용 불가
		Stream<String> str2 = sList.stream(); // 스트림을 새로생성
		str2.sorted().forEach(s2 -> System.out.print(s2 + " "));
		// sorted() 정렬 기능
		// 출력결과 Edward Jack Tomas

		System.out.println();
		sList.stream().sorted().forEach(s3 -> System.out.print(s3 + " "));

	}
}
