package ch04;

// 객체간 협력 175 page
public class _08_Student {

	//멤버변수
	private String studentName;
	private int grade;
	private int money;
	
	// 디폴트 생성자
	public _08_Student() {}
	
	//매개변수 생성자
	public _08_Student(String studentName,int grade,int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	//멤버메서드                      //메인에서 인스턴스를 생성했기 때문에 주소값만 받으면되다.
	//매개변수를 통해서 주소값은 전달. 
	public void takeBus(_08_Bus bus) { // 매개변수를 통해서 이값(주소값)을 넘기겠다.
		// 메인에서 만들었기 때문에 또 생성하면 않되고 주소값만 전달 받는다.
//		_08_Bus bus= new _08_Bus(); <== 출력을 메인에서 하려면 메인으로 넘겨 생성
		bus.take(1000); // 위에 참조변수로 넘어온것
		this.money -= 1000;
	}
	
	public void takeSubway(_08_Subway line) {
		line.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(_08_Taxi mobum) {
		mobum.takeTaxi(7000);
		this.money -=7000;
	}
	
	//출력 
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "원 입니다.");
	}
	
}
