package ch10;

/*
 *  T의 자료형이 정해지는 순가은 제네릭 클래스의 인스턴스 생성되는 순간이다.
 *  따라서 static은 T의 자료형이 결정되는 시점보다 빠르기 때문
 *  static 변수의 자료형이나 static 메서드 내부의 자료형으로 T으로 사용할 수 없다.
 *   */

public class _09_GenericPrint<T> {  //<_09_Powder>
	
	private T material; // T자료형 변수 // private _09_Powder material; 
	
	public void setMeterial(T material) { // _09_Powder material
		this.material = material;
	}

	public T getMeterial() {  //_09_Powder getMeterial(); 
		return material;
	}
	
	@Override
	public String toString() {  // _09_Powder material; 
		return material.toString();
	}
}
