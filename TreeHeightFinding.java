import java.util.*;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class TreeHeightFinding {
//	static int height(Node root) {
//		if (root == null) {
//			return -1;
//		} else {
//			return 1 + Math.max(height(root.left), height(root.right));
//		}
	static String leftTopView(Node root){
		if(root!=null){
			return root.data+" "+leftTopView(root.left);
		}
		return " ";
	}
	static String rightTopView(Node root){
		if(root!=null){
			return root.data+" "+rightTopView(root.right);
		}
		return " ";
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
		String leftheight = leftTopView(root);
		String rightheight = rightTopView(root);
		System.out.println(leftheight.length()>rightheight.length()?leftheight:rightheight);
	}
}