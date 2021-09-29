package test;  // package 오타

public class _15_ManualCar extends  _15_Car{
	
	@Override
	public void drive(){
	System.out.println(" 사람이 직접 우회전 방향지시등을 킵니다. ");
	System.out.println(" 사람이 직접 핸들을 오른쪽으로 돌립니다. ");
	}
	@Override
	public void stop(){
	System.out.println(" 사람이 직접 브레이크를 밟습니다. ");
	}
}

//<인터페이스>
//1. 정의, 문법
//기능을 구현하는 작업명세서 이다. 설계 후 자식클래스에서 구현을 한다.
//모든 메서드가 추상메서드로 되어있고 변수는 static 변수로 되어있다.
//class 상속시  class 클래스명 implements 인터페이스명
//불완전 메서드(추상메서드)인터페이스 생성을 할수가 없다.
//public interface 인터페이스명{
//	public abstract(생략가능) 반환형 추상메서드
//
//2. 구현
//	@Override
//	public 반환형 추상메서드 
//	인터페이스에 정의된 메서드를 구현한다. 
