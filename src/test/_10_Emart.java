package test;
public class _10_Emart{
	private String foodName;
	private int buyer;
	private int money;

	public _10_Emart(String foodName){
		this.foodName = foodName;
	}

	public void buy(int money){
		this.money += money;
		buyer++;
	}
	public void printEmartInfo(){
		System.out.println("음식이름 : " + foodName + ", 고객수 : " + buyer + ", 수입 : " + money );
	} // println 오타 
}