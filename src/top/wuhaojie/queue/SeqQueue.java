package top.wuhaojie.queue;

public class SeqQueue<E> implements QQueue<E> {

	private Object value[];
	private int front, rear;

	public SeqQueue(int capacity) {
		this.value = new Object[Math.abs(capacity)];
		this.front = this.rear = 0;
	}

	public SeqQueue() {
		this(10);
	}

	@Override
	public boolean isEmpty() {
		return this.front == this.rear;
	}

	@Override
	public boolean enqueue(E element) {
		if (element == null)
			return false;
		if (this.front == (this.rear + 1) % this.value.length) {
			Object[] temp = this.value;
			this.value = new Object[temp.length * 2];
			int i = this.front, j = 0;
			while (i != this.rear) {
				this.value[j] = temp[i];
				i = (i + 1) % temp.length;
				j++;
			}
			this.front = 0;
			this.rear = j;
		}
		this.value[this.rear] = element;
		this.rear = (this.rear + 1) % this.value.length;
		return true;
	}

	@Override
	public E dequeue() {
		if (!isEmpty()) {
			E temp = (E) this.value[this.front];
			this.front = (this.front + 1) % this.value.length;
			return temp;
		}
		return null;
	}

}
