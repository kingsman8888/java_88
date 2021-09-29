package ch08;
// 368 page
public class _05_ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		// clone()을 하면 멤버변수는 동일하고, 주소값 다름
		_05_Circle circle = new _05_Circle(10,20,30);
		System.out.println("circle : " + circle); //circle.toString()
		//원점은 x = 10, y = 20이고, 반지름은 30입니다.
		
		_05_Circle copyCircle = (_05_Circle)circle.clone();  // 복제메세드로서 반환형이 Object
		System.out.println("copyCircle : " + copyCircle); // copyCircle.toString()
	
		System.out.println
		("identityHashCode(circle) : " + System.identityHashCode(circle));
		System.out.println
		("identityHashCode(copyCircle) : " + System.identityHashCode(copyCircle));
 }
}