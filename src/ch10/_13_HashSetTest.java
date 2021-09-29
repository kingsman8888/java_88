package ch10;

import java.util.HashSet;

//423page HashSetTest 인터페이스 
public class _13_HashSetTest {

	/*
	 * 집합자료 구조를 구현하며 순서와 상관없이 중복을 허용하지 않는다.
	 */

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		// 매개변수 생성자로 값 설정 , 자료형 String
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("장보고"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));

		System.out.println(hashSet); // [장보고, 박현정, 강감찬, 임정순]
		// 순서가 지켜지지 않으며 중복 허용하지 않는다. 중복은 무시된다.
	}

}
