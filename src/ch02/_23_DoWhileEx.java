package ch02;

import java.util.Scanner;

public class _23_DoWhileEx {

	public static void main(String[] agrs) {
		
		// 월을 입력 
		// 월입력[1~12] : 입력월 출력
		// 범위를 초과(12보다 크거나, 1보자 작으면 ) => ~월은 잘못된 월입니다. 다시 입력하세요!!
		
		
		
		int month=0;
		System.out.print("월을 입력하세요[1~12] : ");
		Scanner input=new Scanner(System.in);
		
		do {
			month = input.nextInt();
			if ((month >=13)||(month<1)) {
				System.out.print(month + "월은 잘못된 월입니다. 다시 입력하세요 : "); // continue의 의미
			} else {
				System.out.println(month + "월 입니다.");
				break;// 맞으면 블럭 탈출 
			}
		} while(true);  // 그리고 내려와서 다시 올라가서 
		input.close();
	}
}
