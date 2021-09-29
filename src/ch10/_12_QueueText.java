package ch10;

//420page ArrayList로 큐 구현하기
public class _12_QueueText {

	public static void main(String[] args) {

		_12_MyQueue queue = new _12_MyQueue();

		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");

		System.out.println(queue.dQueue());
		System.out.println(queue.dQueue());
		System.out.println(queue.dQueue());

	}

}
