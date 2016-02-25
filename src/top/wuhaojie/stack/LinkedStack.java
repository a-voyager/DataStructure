package top.wuhaojie.stack;

public class LinkedStack<E> implements SStack<E> {

	private Node<E> top;

	public LinkedStack() {
		this.top = null;
	}

	@Override
	public boolean isEmpty() {
		return this.top == null;
	}

	@Override
	public boolean push(E element) {
		if (element == null)
			return false;
		this.top = new Node(element, this.top);
		return true;
	}

	@Override
	public E pop() {
		if (!isEmpty()) {
			E temp = this.top.data;
			this.top = this.top.next;
			return temp;
		}
		return null;
	}

	@Override
	public E get() {
		if (!isEmpty())
			return this.top.data;
		return null;
	}

	public static void main(String[] args) {
		LinkedStack<String> linkedStack = new LinkedStack<>();
		for (int i = 0; i < 10; i++) {
			linkedStack.push("item " + i);
		}
		while (!linkedStack.isEmpty()) {
			String pop = linkedStack.pop();
			System.out.println(pop);
		}
	}

}
