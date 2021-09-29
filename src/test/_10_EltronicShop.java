package test;
public class _10_EltronicShop{

	private String brandName;
	private int buyer;
	private int money;

	// 매개변수 생성자
	public _10_EltronicShop(String brandName){
		this.brandName = brandName;
	}
	
	public void buy(int money){
		this.money +=money;
		buyer ++;
	}

	public void printShopInfo(){
	System.out.println("브랜드명 : " + brandName + ", 고객수 : " + buyer + ", 상가수입 : " + money);
	}
}