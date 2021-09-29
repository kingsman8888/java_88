package test;

public class _15_AiCar extends _15_Car{
	
	@Override
	public void drive(){  // public 오타
	System.out.println(" 자동차 스스로 자율로 주행을 합니다. ");
	}
	@Override
	public void stop(){
	System.out.println(" 자동차 스스로 자율로 자동차를 세웁니다. ");
	}	
}