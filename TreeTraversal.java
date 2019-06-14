import java.util.ArrayDeque;
import java.util.Scanner;

class TreeTraversal extends Node {
	TreeTraversal(int data) {
		super(data);
	}
	static void levelOrder(Node root) {
	    ArrayDeque<Node> deque = new ArrayDeque<Node>();
	    if (root != null) {
	        deque.add(root);
	    }
	    while (!deque.isEmpty()) {
	        Node n = deque.remove();
	        System.out.print(n.data + " ");
	        if (n.left != null) {
	            deque.add(n.left);
	        }
	        if (n.right != null) {
	            deque.add(n.right);
	        }
	    }
	}
	static void preOrder(Node root){
		if(root!=null){
		  System.out.print(root.data+" ");
			   preOrder(root.left);
	    preOrder(root.right);
	    }
	}
	static void inOrder(Node root){
		if(root!=null){
	    inOrder(root.left);
	    System.out.print(root.data+" ");
	    inOrder(root.right);
	    }
	}

	static void postOrder(Node root){
		if(root!=null){
	    postOrder(root.left);
	    inOrder(root.right);
	    System.out.print(root.data+" ");
	    }
	}
	
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			if (data <= root.data) {
				root.left= insert(root.left, data);
			} else {
				root.right= insert(root.right, data);
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
		System.out.println("LevelOrder Traversal Is: ");
		levelOrder(root);
		System.out.println();
		System.out.println("InOrder Traversal Is: ");
		inOrder(root);
		System.out.println();
		System.out.println("PreOrder Traversal Is: ");
		preOrder(root);
		System.out.println();
		System.out.println("PostOrder Traversal Is: ");
		postOrder(root);
	}
}