package ch04;

public class _08_StudentMain {
	public static void main(String[] agrs) {
		
		_08_Student kim = new _08_Student("김병현", 2,5000); 
		
		_08_Bus bus= new _08_Bus(100); // = _08_Bus bus(takeBus)
		
		kim.takeBus(bus); //김병현이 버스를 이용하겠다. //위 new값의 주소를 넘기겠다. bus
		// 위에서 또 new 클래스해서 넘기면 또 생성되니 주소값만 넘긴다.
		kim.takeBus(bus); // 버스한번 더 탈대 
		
		
		bus.showInfo();// <==출력하기위해 위 bus 인스턴스를 생성한다.
		
		System.out.println("==========================");
			
		_08_Subway line = new _08_Subway(2);
		
		kim.takeSubway(line); // subway의 take를 
		
		
		line.showInfo();
		kim.showInfo();
		
		System.out.println("==========================");
		_08_Student park = new _08_Student("박철수",5,15000);
		
		_08_Taxi mobum = new _08_Taxi("모범택시", "김철수");
		
		park.takeTaxi(mobum);
		
		park.showInfo();
		mobum.showInfo();
		
		
	}

}
