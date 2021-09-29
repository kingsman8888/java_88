package ch06;

public class _01_Main {
	public static void main(String[] args) {
		
		//dog 자식 클래스 정보 출력 
		
		_01_Dog bark = new _01_Dog();
		
		
		bark.setKind("강아지");
		bark.setLegs(4);
		bark.printInfo();
		
		bark.eat();
		bark.play();
		bark.sleep();
		
		bark.bark(); // 내꺼 
		System.out.println(bark.getKind());
		
		System.out.println("======");
		_01_Cat cry = new _01_Cat();
		cry.cry();
		cry.setKind("고양이");
		cry.setLegs(4);
		cry.printInfo();
		
		cry.eat();
		cry.play();
		cry.sleep();
		
		System.out.println("======");
		
		
	
	}

}
