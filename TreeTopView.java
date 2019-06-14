import java.util.Scanner;

class TreeTopView extends Node{//Node class from TreeHeightFinding class
	TreeTopView(int data) {
		super(data);
	}
	static void topView(Node root) {
	    if (root != null) {
	        printLeft(root.left);
	        System.out.print(root.data + " ");
	        printRight(root.right);
	    }
	}

	static void printLeft(Node n) {
	    if (n != null) {
	        printLeft(n.left);
	        System.out.print(n.data + " ");
	    }
	}

	static void printRight(Node n) {
	    if (n != null) {
	        System.out.print(n.data + " ");
	        printRight(n.right);
	    }
	}
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		topView(root);
	}
}