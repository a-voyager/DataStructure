package top.wuhaojie.stack;

public interface SStack<E> {
	boolean isEmpty();

	boolean push(E element);

	E pop();

	E get();
}
