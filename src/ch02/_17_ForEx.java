package ch02;

public class _17_ForEx {  // [면접에서 제일 많이 나온다]

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {  // 단이 바뀔때마다 타이틀 출력 
			System.out.println("----" + dan + "단" + "----");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}
	}
}
