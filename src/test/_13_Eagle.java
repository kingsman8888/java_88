package test;
	
public class _13_Eagle extends _13_Animal{

	//디폴트생성자
	public _13_Eagle(){}
	
	//멤버메서드
	public void flying(){
	System.out.println("비행하다");
	}
	@Override
	public void move(){
	System.out.println("독수리가 하늘을 납니다.");
	}
}