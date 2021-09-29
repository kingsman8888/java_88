package test;

public class _16_Main {
	public static void main(String[] args) {
		
		System.out.println(" ---ai--- ");
		
		_16_Car aicar = new _16_Car();
		
		aicar.AstartCar();
		aicar.Adrive();
		aicar.Astop();
		aicar.AturnOff();
		
		System.out.println("----manual----");
		
		_16_Car manual =new _16_Car();
		
		manual.MstartCar();
		manual.Mdrive();
		manual.Mstop();
		manual.MturnOff();
		
	}

}

