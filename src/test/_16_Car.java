package test;

public class _16_Car implements _16_AiCar, _16_ManualCar  {
	
	@Override
	public void AstartCar(){
	System.out.println(" 사람이 시동을 켭니다. ");
	}
	@Override	
	public void Adrive(){
	System.out.println(" 자동차 스스로 자율 주행을 시작합니다. ");
	}
	@Override
	public void Astop(){
	System.out.println(" 자동차 스스로 자율로 자동차를 세웁니다. ");
	}
	@Override
	public void AturnOff(){
	System.out.println(" 사람이 시동을 끕니다. ");
	}

	@Override
	public void MstartCar(){
	System.out.println(" 사람이 시동을 켭니다. ");
	}
	@Override	
	public void Mdrive(){
	System.out.println(" 사람이 직접 우회전 방향지시등을 킵니다. ");
	System.out.println(" 사람이 직접 핸들을 오른쪽으로 돌립니다. ");
	}
	@Override
	public void Mstop(){
	System.out.println(" 사람이 직접 브레이크를 밟습니다. ");
	}
	@Override
	public void MturnOff(){
	System.out.println(" 사람이 시동을 끕니다. ");
	}
}