package top.wuhaojie.tree;

public class Ancestors {
	public static void main(String[] args) {
		String[] preorder = { "A", "B", "D", null, "G", null, null, null, "C",
				"E", null, null, "F", "H" };
		BinaryTree<String> bitree = new BinaryTree<String>(preorder);
		bitree.preOrder();
		String value = "H";
		BinaryNode<String> find = bitree.search(value);
		if (find == null)
			System.out.println("\n not found " + value);
		else {
			BinaryNode<String> parent = bitree.getParent(find);
			System.out.print("\n" + find.data + "的祖先节点是 ");
			while (parent != null) {
				System.out.print(parent.data + " ");
				parent = bitree.getParent(parent);
			}
			System.out.println();
		}
	}
}
