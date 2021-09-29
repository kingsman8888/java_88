package test;

public class _04_WhileEx {

	public static void main(String[] agrs) {

		int dan = 2;

		while (dan <= 9) {
			System.out.println("********" + dan + "단" + "********");
			// System의 s를 소문자로 작성
			int i = 1;
			while (i <= 9) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				i++;
			}

			dan++; // 증감연산에서 + 하나만 붙임.
		}
		System.out.println("=============");

	}

}