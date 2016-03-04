package top.wuhaojie.tree;

public interface TTree<E> {
	boolean isEmpty();

	E getRoot();

	E getParent(E child);

	int getChildCount(E parent);

	/**
	 * ��ȡ��һ���ֵܽڵ�
	 * 
	 * @param element
	 * @return
	 */
	E getNextSibling(E element);

	/**
	 * ������
	 */
	void traverse();

	void insert(E parent, E element);

	void remove(E parent);

	void clear();
}
