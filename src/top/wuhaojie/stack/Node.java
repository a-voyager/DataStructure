package top.wuhaojie.stack;

public class Node<E> {
	public E data;
	public Node<E> next;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	public Node(E data) {
		this(data, null);
	}

	public Node() {
		this(null, null);
	}
}
