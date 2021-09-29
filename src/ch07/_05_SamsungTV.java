package ch07;
// 자식클래스 
public class _05_SamsungTV implements _05_TV {

	// 브랜드를 켜다 끄다 
	
	@Override
	public void trunOn() {
		System.out.println(_05_TV.BRAND + " TV를 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println(BRAND + " TV를 끄다");
	}
    
	
	
}
