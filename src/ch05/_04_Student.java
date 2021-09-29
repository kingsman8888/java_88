package ch05;

public class _04_Student {

	// 멤버면수 
	
	private String name;
	private String age;
	private String email;
	
	// 디폴트 생성자
	public _04_Student() {}
	//매개변수 생성자
	public _04_Student(String name,String age,String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	//멤버메서드(setter,getter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail(String email) {
		return email;
	}
	
	//멤버메서드(showInfo)
	public void showInfo() {
		System.out.println(" 이름 : " + name + ", 나이 : " + age + ", email : " + email);
	}
}
