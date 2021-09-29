package ch13;

public class _05_TravelCostomer {
	
	private String name;
	private int age;
	private int price;
	
	public _05_TravelCostomer() {}
	
	public _05_TravelCostomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age + " 금액 : " + price;
	}

}
