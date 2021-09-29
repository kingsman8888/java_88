package ch10;
//page 428

import java.util.TreeSet;
public class _15_TreeSetTest {
	/*
	 * TreeSet
	 * - 자료의 중복을 허용하지 않으면서 출력결과 값을 정렬한다. (재정의를 해아한다.)
	 * - String 클래스안에 정렬방식이 이미 구현되어 있음 
	 * - 자료사이의 계층 구조를 나타내는 자료구조이다.
	 * - 각 자료가 들어가는 공간을 노드라고 한다.
	 * - 무보가 가지는 자식 노드의 수가 2개 이하
	 * - 왼쪽 위치하는 자식 노드는 부모 노드보다 항상 작은 값을 가진다.
	 * - 오른쪽 자식 노드는 부모 노드보다 항상 큰 값을 가진다.
	 */
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		// 결과값은 정렬되서 출력된다. 자바는 정렬을 구현하기 위해 이진(binary tree) 트리를 사용한다.
		}
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		for (int num : tree) {
			System.out.print(num + " ");
		}
		System.out.println("");
		
	}
}
