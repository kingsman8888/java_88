package test;

public class _13_Human extends _13_Animal{

	//디폴트생성자
	public _13_Human(){}
	//멤버메서드 
	public void thinking(){
	System.out.println("사람이 생각하다");
	}
	@Override
	public void move(){
	System.out.println("사람이 두발로 걷습니다.");
	}

}