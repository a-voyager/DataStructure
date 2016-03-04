package top.wuhaojie.tree;

public interface TTree<E> {
	boolean isEmpty();

	E getRoot();

	E getParent(E child);

	int getChildCount(E parent);

	/**
	 * 获取下一个兄弟节点
	 * 
	 * @param element
	 * @return
	 */
	E getNextSibling(E element);

	/**
	 * 遍历树
	 */
	void traverse();

	void insert(E parent, E element);

	void remove(E parent);

	void clear();
}
