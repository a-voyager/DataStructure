package top.wuhaojie.tree;

/**
 * 完全二叉树
 * 
 * @author wuhaojie
 *
 * @param <E>
 */
public class CompleteBinaryTree<E> extends BinaryTree<E> {

	public CompleteBinaryTree() {
		super();
	}

	public CompleteBinaryTree(E[] levelorder) {
		this.root = create(levelorder, 0);
	}

	private BinaryNode<E> create(E[] levelorder, int i) {
		BinaryNode<E> p = null;
		if (i < levelorder.length) {
			p = new BinaryNode<E>(levelorder[i]);
			p.left = create(levelorder, 2 * i + 1);
			p.right = create(levelorder, 2 * i + 2);
		}
		return p;
	}

	public static void main(String[] args) {
		String[] levelorder = { "A", "B", "C", "D", "E", "F", "G", "H" };
		CompleteBinaryTree<String> cbtree = new CompleteBinaryTree<String>(
				levelorder);
		cbtree.preOrder();
		cbtree.inOrder();
		cbtree.postOrder();
		System.out.println("\n结点个数： " + cbtree.count());
		System.out.println("高度: " + cbtree.height());
	}

}
