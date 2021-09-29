package test;

public class _13_Tiger extends _13_Animal{   // extedns 오타

	// 디폴트생성자
	public _13_Tiger(){}
	
	// 멤버메서드
	public void hunting(){
	System.out.println("사냥하다");
	}
	@Override
	public void move(){
	System.out.println("호랑이가 네발로 뜁니다.");   //println 오타
	}

}