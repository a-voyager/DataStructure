package top.wuhaojie.tree;

public class Traverse {

	public static BinaryTree<String> create() {
		BinaryNode<String> child_f, child_d, child_c, child_a;
		child_d = new BinaryNode<String>("D", null, new BinaryNode<String>("G"));
		child_f = new BinaryNode<String>("F", new BinaryNode<String>("H"), null);
		child_c = new BinaryNode<String>("C", new BinaryNode<String>("E"),
				child_f);
		child_a = new BinaryNode<String>("A", new BinaryNode<String>("B",
				child_d, null), child_c);
		return new BinaryTree<String>(child_a);
	}

	public static void main(String[] args) {
		BinaryTree<String> bitree = create();
		bitree.preOrder();
		bitree.inOrder();
		bitree.postOrder();
	}

}
