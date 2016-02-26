package top.wuhaojie.queue;

import top.wuhaojie.stack.Node;

public class LinkedQueue<E> implements QQueue<E> {

	private Node<E> front, rear;

	public LinkedQueue() {
		this.front = this.rear = null;
	}

	@Override
	public boolean isEmpty() {
		return this.front == null && this.rear == null;
	}

	@Override
	public boolean enqueue(E element) {
		if (element == null)
			return false;
		Node<E> q = new Node(element);
		if (!isEmpty())
			this.rear.next = q;
		else
			this.front = q;
		this.rear = q;
		return true;
	}

	@Override
	public E dequeue() {
		if (!isEmpty()) {
			E temp = this.front.data;
			this.front = this.front.next;
			if (this.front == null)
				this.rear = null;
			return temp;
		}
		return null;
	}

}
