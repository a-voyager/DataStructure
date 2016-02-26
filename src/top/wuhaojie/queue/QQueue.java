package top.wuhaojie.queue;

public interface QQueue<E> {

	boolean isEmpty();

	boolean enqueue(E element);

	E dequeue();

}
