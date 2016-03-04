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
		System.out.println("\n �ȸ�����:\t");
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
		System.out.println("\n �и�����:\t");
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
		System.out.println("\n �������:\t");
		postOrder(root);
	}

	private void postOrder(BinaryNode<E> p) {
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p.data + " ");
		}
	}

}
