package ch10;

import java.util.Scanner;

public class _08_Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			readeMemberInfo();
		} catch (_08_InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (_08_InvalideAgeException e) {
			System.out.println(e.getMessage());
		} finally {
			input.close();
		}
	}

	static String readName() throws _08_InvalidNameException {
		System.out.print("이름 입력 :");
		String name = input.next();
		if (name.length() < 2) {
			_08_InvalidNameException nn = new _08_InvalidNameException("*** 이름은 2글자 이상 입력 ***");
			nn.setWrongName(name);
			nn.showWrongName();
			throw nn;
		} else {
			return name;
		}
	}
	static int readAge() throws _08_InvalideAgeException {
		System.out.print("나이입력 : ");
		int age = input.nextInt();
		if (age <= 0) {
			_08_InvalideAgeException aa = new _08_InvalideAgeException("*** 나이는 0세 이상 입력 ***");
			aa.setWrongAge(age);
			aa.showWrongAge();
			throw aa;
		} else {
			return age;
		}
	}
	static _08_MemberInfo readeMemberInfo() throws _08_InvalidNameException, _08_InvalideAgeException {
		_08_MemberInfo mem = new _08_MemberInfo();
		mem.setName(readName());
		mem.setAge(readAge());
		System.out.println("===== 정상 =====");
		mem.showMemberInfo();
		return mem;
	}
}
