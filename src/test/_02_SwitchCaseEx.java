package test;

import java.util.Scanner; // import.java  .을 붙임

public class _02_SwitchCaseEx {

	public static void main(String[] agrs) {

		int score = 0;
		char grade = ' ';

		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = input.nextInt();

		if (score > 100) {
			System.out.println("잘못된 점수입니다. 다시 입력하세요"); // S를 소문자로 작성
		} else {
			switch (score) {
			case 100:
			case 90:
				grade = 'A';
				break;
			case 80:
				grade = 'B';
				break;
			case 70:
				grade = 'C';
				break;
			case 60:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
		}

		System.out.println(" score : " + score + " grade : " + grade); // S를 소문자로 작성
		input.close();

	}

}