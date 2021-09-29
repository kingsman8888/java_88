package test;  // pakage 오타 

public abstract class _15_Car{
	// 추상메서드
	public abstract  void drive();   //public 오타 
	public abstract  void stop();

	public void startCar(){
	System.out.println("시동을 켭니다."); // ; 세미콜론 빼먹음 
	}
	
	public void turnOff(){
	System.out.println("시동을 끕니다."); // ; 세미콜론 빼먹음
	}

	final public void run(){
	startCar();
	drive();
	turnOff();
	stop();
	}	
}