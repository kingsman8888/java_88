package test;

import java.util.Scanner; //import.java 사이에 .을 넣음

public class _03_WhileEx { // 블럭 닫기 않넣음 }
	public static void main(String[] agrs) {

		int dan = 0;

		Scanner input = new Scanner(System.in);
		System.out.print(" 단을 입력하세요 :  ");

		dan = input.nextInt(); // nextInt에서 n을 대문자로 작성
		int i = 1;
		System.out.println("********" + dan + "단" + "********");
		// system의 S를 소문자로 작성
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			// system의 S를 소문자로 작성 / ln않넣어서 우측으로 결과값 출력
			i++;
		} // 블럭을 반대로 넣음 {
		System.out.println("=============");
		input.close();

	}

}