package ch02;

import java.util.Scanner;

public class _06_IfEx {
	public static void main(String[] args) {
		
		/*
		 * 입장료
		 * 
		 * age : 나이 입력받는다.`
		 * charge : 요금
		 * grade : 단계
		 * 
		 * 1~8세 : grade가 "미취학아동", charge : 1000
		 * ~13세 : grade가 "초등학생, charge : 2000
		 * ~19세 : grade가 "청소년, charge : 3000
		 * ~64세 : grade가 "일반인, ADULT_CHARGE : 4000선언 => charge = 대입  // 상수선언
		 * 65세 이상 : grade가 "경로우대", ADULT_CHARG 20% 할인 => charge 에 대입
		 * 
		 * 출력형식 => 나이 : 5세이며, grade : 미취학아동, 입장료 : 1000원
		 */
		
		
		
		
		
		
		System.out.print("나이를 입력하세요 : ");
		Scanner input=new Scanner(System.in);
		
		int age = input.nextInt();
		int charge = 0;
		final int ADULT_CHARG = 4000;
		String grade = "";
		
		if(age <=0) {
			System.out.println(" 나이를 다시 입력하세요");
		}else {
			if (age <=1) {
				charge = 1000;
				System.out.println(" 미취학아동, ");
			}else if (age <=13){
				charge = 2000;
				grade = "초등학생";
			}else if (age <=19){
				charge = 3000;
				grade = "청소년";
			}else if (age <=64) {
				charge = ADULT_CHARG;
				grade = "일반인";
			}else {
				charge = (int) (ADULT_CHARG * 0.8f);  // 명시적 형변환 : 작은 타입 = 큰타입;
													  // int = int * float = (int(float * float)
				grade = "경로우대";
			}
		}
			System.out.print("나이 " + age + "세이며, " + " grade : "+ grade + " " +  " 입장료 : " + charge);
			input.close();
		
	}

}
