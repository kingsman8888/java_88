package test;

public class _13_Main{
public static void main(String[] agrs){

	_13_Main animal = new _13_Main();

	animal.moveAni(new _13_Animal());
	animal.moveAni(new _13_Human());
	animal.moveAni(new _13_Eagle());
	animal.moveAni(new _13_Tiger());

}

	public void moveAni(_13_Animal animal){
		animal.move(); // ()넣지않음
	if (animal instanceof _13_Human){
		_13_Human human = (_13_Human)animal;
	human.thinking();
	}
	
	if ( animal instanceof _13_Eagle){
		_13_Eagle eagle = (_13_Eagle)animal; //animal 오타
		eagle.flying(); // ()넣지않음
	}
	if ( animal instanceof _13_Tiger){   // 오타 _13_Tiger
		_13_Tiger tiger = (_13_Tiger)animal;
		tiger.hunting(); // ()넣지않음
	}
	}
}  // 블럭 않넣음 