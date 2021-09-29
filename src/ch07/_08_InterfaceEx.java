package ch07;

public class _08_InterfaceEx {
	public static void main(String[] args) {
		//하나의 클래스에 여러개 클래스가 있을때는 메인클래스에 public 넣는다.
	
		M1 m1 = new M1();
		m1.methodM1(new M2());  //call by reference
		
	
	}
}

class M1{  //인스턴스 생성해서 힙메모리에 등록 후 넘긴 주소값으로 메서드 접근
	public void methodM1(M2 m2) {   // M2 mm2 = new M2();
		System.out.println("M1 클래스 - method1");
		m2.methodM2(new M3());  //힙메모리를 생성하면서 주소값을 넘겨준다
	}
}

class M2{
	public void methodM2(M3 m3) {   // M3 mm3 = new M3();
		System.out.println("M2 클래스 - methodM2");
		m3.methodM2();
	}
}

class M3{
	public void methodM2() {
		System.out.println("M3 클래스 - methodM3");
	}
}

	
	