package test;

public class _15_Main{
	public static void main(String[] args){  // String 오타
	
	System.out.println(" ---_15_AiCar --- ");
	_15_Car ai = new _15_AiCar ();
	ai.run();
	

	System.out.println(" ---_15_ManualCar  --- ");
	_15_Car  manual = new _15_ManualCar ();
	manual.run();
	}	
}