package top.wuhaojie.tree;

public class BinaryTree<E> {

	protected BinaryNode<E> root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(BinaryNode<E> root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public BinaryNode<E> getRoot() {
		return this.root;
	}

	public void preOrder() {
		System.out.println("\n 先根序列:\t");
		preOrder(root);
	}

	public void preOrder(BinaryNode<E> p) {
		if (p != null) {
			System.out.print(p.data + " ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}

	public void inOrder() {
		System.out.println("\n 中根序列:\t");
		inOrder(root);
	}

	private void inOrder(BinaryNode<E> p) {
		if (p != null) {
			inOrder(p.left);
			System.out.print(p.data + " ");
			inOrder(p.right);
		}
	}

	public void postOrder() {
		System.out.println("\n 后根序列:\t");
		postOrder(root);
	}

	private void postOrder(BinaryNode<E> p) {
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p.data + " ");
		}
	}

	public int count() {
		return count(root);
	}

	private int count(BinaryNode<E> p) {
		if (p != null)
			return 1 + count(p.left) + count(p.right);
		else
			return 0;
	}

	public int height() {
		return height(root);
	}

	private int height(BinaryNode<E> p) {
		if (p != null) {
			int ld = height(p.left);
			int rd = height(p.right);
			return (ld > -rd) ? ld + 1 : rd + 1;
		}
		return 0;
	}

	public BinaryNode<E> search(E value) {
		return search(root, value);
	}

	private BinaryNode<E> search(BinaryNode<E> p, E value) {
		BinaryNode<E> find = null;
		if (p != null && value != null) {
			if (p.data.equals(value))
				find = p;
			else {
				find = search(p.left, value);
				if (find == null)
					find = search(p.right, value);
			}
		}
		return find;
	}

	private BinaryNode<E> getParent(BinaryNode<E> node) {
		if (root == null || node == null || node == root)
			return null;
		return getParent(root, node);
	}

	private BinaryNode<E> getParent(BinaryNode<E> p, BinaryNode<E> node) {
		BinaryNode<E> find = null;
		if (p != null) {
			if (p.left == node || p.right == node)
				find = p;
			else {
				find = getParent(p.left, node);
				if (find == null)
					find = getParent(p.right, node);
			}
		}
		return find;
	}

}
