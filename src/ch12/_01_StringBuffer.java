package ch12;

public class _01_StringBuffer {
	
	public static void main(String[] args) {
		
		/*
		 * StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
		 * - 추가 : append()
		 * - 삽입 : insert(시작위치, 문자열) : 특정위치에 원하는 문자열을 삽입합니다.
		 * - subString(시작위치, 끝위치) : 시작위치에서 끝 위치 -1까지의 문자열을 추출한다. 공백포함
		 * 							   인덱스는 0부터시작하며, 끝위치보다 작아야한다.
		 * - toString() : 메서드를 이용해서 String으로 변경한다.
		 */

		StringBuffer sb = new StringBuffer();
		
		// - 추가 : append()
		
		sb.append("즐겁게 ");
		sb.append("플젝하고");
		sb.append("좋은회사");
		sb.append("입사하자");
		
		System.out.println("sb : " + sb);  // sb :  즐겁게  신나게  재미있게 플젝하고 좋은회사 입사하자
		System.out.println(sb.toString()); //  즐겁게  신나게  재미있게 플젝하고 좋은회사 입사하자
		
		// - 삽입 : insert(시작위치, 문자열) : 특정위치에 원하는 문자열을 삽입합니다.
		sb.insert(8, "진짜진짜"); 
		System.out.println("sb.toString()" + sb.toString());
		//- subString(시작위치, 끝위치) : 시작위치에서 끝 위치 -1까지의 문자열을 추출한다. 공백포함
		//	    				   인덱스는 0부터시작하며, 끝위치보다 작아야한다.
		
		System.out.println(sb.substring(4, 7));
		
	}

}
