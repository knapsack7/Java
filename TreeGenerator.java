public class TreeGenerator extends Node {
	TreeGenerator(int data) {
		super(data);
	}

	static int height(Node root) {
		if (root == null) {
			return -1;
		} else {
			return 1 + Math.max(height(root.left), height(root.right));
		}
	}

	public static Node addNode(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			root.data = data;
			root.left = root.right = null;
			return root;
		} else if (data < root.data)
			root.left = addNode(root.left, data);
		else
			root.right = addNode(root.right, data);
		return root;
	}

	public static void main(String[] args) {
		Node root = null;
		int[] nodes = { 20, 8, 22, 4, 12, 10, 14 };
		for (int i = 0; i < nodes.length; i++)
			root = addNode(root, nodes[i]);
		System.out.println(height(root));
	}

}
