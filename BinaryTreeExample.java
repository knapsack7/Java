import java.util.*;
public class BinaryTreeExample{
	TreeNode root=null;
	BinaryTreeExample(){
		this.root=null;
	}
	BinaryTreeExample(TreeNode root){
		this.root=root;	
	}

	public void preOrderRecursive(TreeNode root){
		if(root==null)
			return;
		System.out.print(root.getData()+" ");
		preOrderRecursive(root.getLeft());
		preOrderRecursive(root.getRight());	
	}
	
	public void preOrderIterative(TreeNode root){
		if(root==null)
			return;
		Stack<TreeNode> stk=new Stack<TreeNode>();
		stk.push(root);
		while(!stk.isEmpty()){
			TreeNode temp=stk.pop();
			System.out.print(temp.getData()+" ");
			if(temp.getRight()!=null)
				stk.push(temp.getRight());
			if(temp.getLeft()!=null)
				stk.push(temp.getLeft());	
		}	
	}
	
	public void inOrderRecursive(TreeNode root){
		if(root==null)	
			return;
		inOrderRecursive(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrderRecursive(root.getRight());
	}
	
	public void inOrderIterative(TreeNode root){
		if(root==null)
			return;
		Stack<TreeNode> stk=new Stack<TreeNode>();
		stk.push(root);
		TreeNode temp=stk.peek();
		while(!stk.isEmpty()){
			if(temp.getLeft()!=null){
				stk.push(temp.getLeft());
				temp=temp.getLeft();
			}
			else{
				if(stk.isEmpty())
					break;
				temp=stk.pop();
				System.out.print(temp.getData()+" ");
				if(temp.getRight()!=null){
					stk.push(temp.getRight());
					temp=temp.getRight();			
				}
			}
		}	
	}

	public void postOrderRecursive(TreeNode root){
		if(root==null)	
			return;
		postOrderRecursive(root.getLeft());
		postOrderRecursive(root.getRight());
		System.out.print(root.getData()+" ");
	}
	
	public void postOrderIterative(TreeNode root){
		if(root==null)
			return;
		Stack<TreeNode> stk=new Stack<TreeNode>();
		stk.push(root);
		TreeNode prev=null;
		while(!stk.isEmpty()){
			TreeNode curr=stk.peek();
			if(prev==null||prev.getLeft()==curr||prev.getRight()==curr){
				if(curr.getLeft()!=null)
					stk.push(curr.getLeft());
				else if(curr.getRight()!=null)
					stk.push(curr.getRight());			
			}		
			else if(curr.getLeft()==prev){
				if(curr.getRight()!=null)
					stk.push(curr.getRight());
			}
			else{
				System.out.print(curr.getData()+" ");
				stk.pop();
			}
			prev=curr;
		}
	}

	public void levelOrderTraversal(TreeNode root){
		if(root==null)
			return;
		else{
			Queue<TreeNode> q=new LinkedList<TreeNode>();
			q.add(root);
			while(!q.isEmpty()){
				TreeNode temp=q.remove();
				System.out.print(temp.getData()+" ");
				if(temp.getLeft()!=null)
					q.add(temp.getLeft());	
				if(temp.getRight()!=null)
					q.add(temp.getRight());		
			}		
		}
		System.out.println();		
	}
	
	public int maxInBinaryTree(TreeNode root){
		int maxValue=Integer.MIN_VALUE;/*Note u can use LevelOrderTraversal to get max element*/
		if(root!=null){
			int leftValue=maxInBinaryTree(root.getLeft());
			int rightValue=maxInBinaryTree(root.getRight());
			if(leftValue>rightValue)
				maxValue=leftValue;
			else{
				maxValue=rightValue;
			}
			if(root.getData()>maxValue)
				maxValue=root.getData();
		}	
		return maxValue;
	}

	public void insertInBinaryTree(TreeNode root,int data){
		if(root==null){
			root=new TreeNode(data);
			return;
		}
		else{
			Queue<TreeNode> q=new LinkedList<TreeNode>();
			q.add(root);
			while(!q.isEmpty()){
				TreeNode temp=q.remove();
				if(temp.getLeft()!=null)
					q.add(temp.getLeft());
				else{
					temp.setLeft(new TreeNode(data));
					return;				
				}	
				if(temp.getRight()!=null)
					q.add(temp.getRight());
				else{
					temp.setRight(new TreeNode(data));
					return;				
				}		
			}		
		}		
	}
	
	public int size(TreeNode root){
		if(root==null)
			return 0;
		else{
			return (1+size(root.getLeft())+size(root.getRight()));		
		}
	}
	
	public void reverseLevelOrderTraversal(TreeNode root){
		if(root==null)
			return;
		TreeNode temp;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		Stack<TreeNode> stk=new Stack<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			temp=q.remove();
			stk.push(temp);
			if(temp.getLeft()!=null)
				q.add(temp.getLeft());
			if(temp.getRight()!=null)
				q.add(temp.getRight());		
		}
		while(!stk.isEmpty()){
			temp=stk.pop();
			System.out.print(temp.getData()+" ");
		}
		System.out.println();
	}
	
	public int maxDepthRecursive(TreeNode root){
		if(root==null)
			return 0;
		int leftDepth=maxDepthRecursive(root.getLeft());
		int rightDepth=maxDepthRecursive(root.getRight());
		return ((leftDepth>rightDepth)?leftDepth+1:rightDepth+1);
	}
	
        public int maxDepthLevelOrder(TreeNode root){
    		if(root == null)
        		return 0;
    		int maxDepth = 1;
    		Queue<TreeNode> q = new LinkedList<TreeNode>();
    		q.offer(root);
    		q.offer(null);
    		while(!q.isEmpty()){
        		TreeNode tmp = q.poll();
        		if(tmp != null){
            			if(tmp.getLeft() != null)
                			q.offer(tmp.getLeft());
            			if(tmp.right != null)
                			q.offer(tmp.right);
        		}else{
            			if(!q.isEmpty()){
                			++maxDepth;
                			q.offer(null);
            			}
        		}
		}
    		return maxDepth;
	}
	
	public int minDepthLevelOrder(TreeNode root){
    		if(root == null)
        		return 0;
    		int minDepth = 1;
    		Queue<TreeNode> q = new LinkedList<TreeNode>();
    		q.offer(root);
    		q.offer(null);
    		while(!q.isEmpty()){
        		TreeNode tmp = q.poll();
        		if(tmp != null){
            			if(tmp.getLeft()==null&&tmp.getRight()==null)
					return minDepth;				
				if(tmp.getLeft() != null)
                			q.offer(tmp.getLeft());
            			if(tmp.right != null)
                			q.offer(tmp.right);
        		}else{
            			if(!q.isEmpty()){
                			++minDepth;
                			q.offer(null);
            			}
        		}
		}
    		return minDepth;
	}
	
	public TreeNode deepestNodeLevelOrder(TreeNode root){
		if(root==null)
			return null;
		else{
			Queue<TreeNode> q=new LinkedList<TreeNode>();
			q.add(root);
			TreeNode temp=null;
			while(!q.isEmpty()){
				temp=q.remove();
				if(temp.getLeft()!=null)
					q.add(temp.getLeft());	
				if(temp.getRight()!=null)
					q.add(temp.getRight());		
			}		
			return temp;
		}		
	}
        
	public static void deleteLink(TreeNode root,int data,int size){
		TreeNode[] arr=new TreeNode[size];
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.offer(root);
		TreeNode temp=null;
		int i=0;
		while(!q.isEmpty()){
			temp=q.poll();
			arr[i++]=temp;
			if(temp.getLeft()!=null)
				q.offer(temp.getLeft());
			if(temp.getRight()!=null)
				q.offer(temp.getRight());
		}
		int loc=size-1;
		int par_loc=0;
		if(loc%2==0){
			par_loc=loc/2-1;
			arr[par_loc].setRight(null);
		}
		else{
			par_loc=loc/2;
			arr[par_loc].setLeft(null);
		}
	}
	
	public void deleteNodeBinaryTree(TreeNode root,int data,TreeNode deepest,int size){
		/*Deletes if tree has 2 or more elements*/
		if(root==null)
			return;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.offer(root);
		TreeNode temp=null;
		while(!q.isEmpty()){
			temp=q.poll();
			if(temp.getData()==data){
				temp.setData(deepest.getData());
				deepest.setData(data);
				deleteLink(root,data,size);
				return;
			}
			if(temp.getLeft()!=null)
				q.offer(temp.getLeft());
			if(temp.getRight()!=null)
				q.offer(temp.getRight());
		}
	} 	

	public static void main(String[] args){
		BinaryTreeExample tree=new BinaryTreeExample(new TreeNode(1));	
		tree.root.setLeft(new TreeNode(2));
		tree.root.setRight(new TreeNode(3));
		tree.root.getLeft().setLeft(new TreeNode(4));
		tree.root.getLeft().setRight(new TreeNode(5));
		tree.root.getRight().setLeft(new TreeNode(6));
		tree.root.getRight().setRight(new TreeNode(7));
		tree.preOrderRecursive(tree.root);
		System.out.println();
		tree.preOrderIterative(tree.root);
		System.out.println();
		tree.inOrderRecursive(tree.root);
		System.out.println();
		tree.inOrderIterative(tree.root);
		System.out.println();
		tree.postOrderRecursive(tree.root);
		System.out.println();
		tree.postOrderIterative(tree.root);
		System.out.println();
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		System.out.println("MAX Value in the tree : "+tree.maxInBinaryTree(tree.root));
		tree.insertInBinaryTree(tree.root,8);
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Size of Tree is : "+tree.size(tree.root));
		tree.reverseLevelOrderTraversal(tree.root);
		System.out.println(tree.maxDepthRecursive(tree.root));
		System.out.println("Max Depth : "+tree.maxDepthLevelOrder(tree.root));
		System.out.println("Min Depth : "+tree.minDepthLevelOrder(tree.root));
		TreeNode deepest=tree.deepestNodeLevelOrder(tree.root);
		System.out.println("Deepest Node is : "+deepest.getData());
		System.out.println("Before deletion tree is : ");
		tree.levelOrderTraversal(tree.root);
		tree.deleteNodeBinaryTree(tree.root,2,deepest,tree.size(tree.root));
		System.out.println("After deletion tree is : ");
		tree.levelOrderTraversal(tree.root);
	}
}

class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}

	public int getData(){
	return this.data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public void setLeft(TreeNode left){
		this.left=left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public void setRight(TreeNode right){
		this.right=right;
	}
	
}
