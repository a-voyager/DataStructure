package top.wuhaojie.tree;

public interface BinaryTTree<E> {

	boolean isEmpty();

	int count();

	int height();

	BinaryNode<E> getRoot();

	BinaryNode<E> getParent(BinaryNode<E> node);

	void preOrder();

	void inOrder();

	void postOrder();

	void levelOrder();

	BinaryNode<E> search(E element);

	void insert(BinaryNode<E> p, E element, boolean leftChild);

	void remove(BinaryNode<E> p, boolean leftChild);

	void clear();

}
