package ch12;

public class _05_SpreadArgs {

	// public void callArgs(String str1, String str2, String str3, String str4) {
	// System.out.println(str1 + " "+ str2 + " " + str3 + " " + str4);
	// }

	/*
	 * 스프레드 매개변수 길이 상관없이 동적으로 작동시킬때 1. 용도 : 메서드 호출시 매개변수 인자의 수가 일치하지 않도록 호출이 가능하도록
	 * 한다. args는 인자의 수를 동적으로 처리할 수 있도록 유연성을 제공한다.
	 * 
	 * 2. 방법 : 메서드 인자(데이터Type ...str)로 지정하나, 스프레드 매개변수는 1개밖에 사용할수 없다. 컴파일시 매개변수 인자로
	 * 넘어온 갯수만큼 배열이 생성된다.
	 * 
	 * 
	 */ // ... 컴파일시점에 값을 결정하여 출력 갯수를 결정 at.end랑 비슷
	public void callArgs(String... str) { // String[] str
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for (String re : str) {
			System.out.print(re);

		}
		System.out.println("");
	}

	public void callArgs2(String name, int... score) { // int[] score
		System.out.print(name + " ");
		for (int sc : score) {
			System.out.print(sc + " ");
		}
	}
}