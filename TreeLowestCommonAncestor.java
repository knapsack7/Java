public class TreeLowestCommonAncestor extends TreeGenerator {

	/**
	 * finding Lowest common Ancestor of two existing nodes in binary search
	 * tree
	 */
	TreeLowestCommonAncestor(int data) {
		super(data);
	}

	public static Node lca(Node root, int v1, int v2) {
		while (root != null) {
			if (root.data < v1 && root.data < v2)
				root = root.right;
			else if (root.data > v1 && root.data > v2)
				root = root.left;
			else
				break;
		}
		return root;
	}

	public static void main(String[] args) {
		Node root = null;
		int[] nodes = { 20, 8, 22, 4, 12, 10, 14 };
		for (int i = 0; i < nodes.length; i++)
			root = addNode(root, nodes[i]);
		Node temp = lca(root, 10, 22);
		System.out.println("Lowest Common Ancestor : " + temp.data);

	}

}
