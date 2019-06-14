import java.util.Map;
import java.util.HashMap;
class LinkedList{
	public LinkedList(){
		length=0;
	}
        ListNode head;
	private int length=0;
	public synchronized ListNode getHead(){
		return head;
	}
	public synchronized void insertAtBegin(ListNode node){
		node.setNext(head);
		head=node;
		length++;
	}
	public synchronized void insertAtEnd(ListNode node){
		if(head==null){
			head=node;
		}
		else{
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			p.setNext(node);
		}
		length++;
	}
	public void insert(int data,int position){
		if(position<0){
			position=0;
		}
		if(position>length){
			position=length;
		}	
		if(head==null){
			head=new ListNode(data);
		}
		else if(position==0){
			ListNode temp=new ListNode(data);
			temp.setNext(head);
			head=temp;
		}
		else{
			ListNode temp=head;
			for(int i=1;i<position;i++){
				temp=temp.getNext();
			}
			ListNode newNode=new ListNode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length+=1;
	}
	public synchronized ListNode removeFromBegin(){
		ListNode node=head;
		if(node!=null){
			head=node.getNext();
			node.setNext(null);
		}
		return node;
	}
	public synchronized ListNode removeFromEnd(){
		if(head==null)
			return null;
		ListNode p=head,q=null,next=head.getNext();
		if(next==null){
			head=null;
			return p;
		}
		while((next=p.getNext())!=null){
			q=p;
			p=next;
		}
		q.setNext(null);
		return p;
	}
	public synchronized void removeMatched(ListNode node){
		if(head==null)
			return;
		if(node.equals(head)){
			head=head.getNext();
			return ;
		}
		ListNode p=head,q=null;
		while((q=p.getNext())!=null){
			if(node.equals(q)){
				p.setNext(q.getNext());
				return ;
			}
			p=q;
		}
	}
	public void remove(int position){
		if(position<0){
			position=0;
		}
		if(position>=length){
			position=length-1;
		}
		if(head==null)
			return;
		if(position==0){
			head=head.getNext();
		}
		else{
			ListNode temp=head;
			for(int i=1;i<position;i+=1){
				temp=temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());	
		}
		length-=1;
	}	
	public String toString(){
		String result="[";
		if(head==null){
			return result+"]";
		}
		result=result+head.getData();
		ListNode temp=head.getNext();
		while(temp!=null){
			result=result+","+temp.getData();
			temp=temp.getNext();
		}	
		return result+"]";
	}
	public int length(){
		return length;
	} 
	public int getPosition(int data){
		ListNode temp=head;
		int pos=0;
		while(temp!=null){
			if(temp.getData()==data){
				return pos;
			}
			pos+=1;
			temp=temp.getNext();
		}
		return Integer.MIN_VALUE;
	}
	
	public int middle(){
		ListNode ptr1=head,ptr2=head;
		int i=0;
		while(ptr1.getNext()!=null){
			if(i==0){
				ptr1=ptr1.getNext();
				i=1;
			}
			else if(i==1){
				ptr1=ptr1.getNext();
				ptr2=ptr2.getNext();
				i=0;
			}
		}
		return ptr2.getData();
	}
	
	public String isEvenOrOdd(){
		ListNode temp=head;
		while(temp!=null && temp.getNext()!=null){
			temp=temp.getNext().getNext();
		}
		if(temp==null)
			return "Even length List";
		else
			return "odd length List";
	}

	public void exchangeAdjacentNodes(){
		ListNode temp=head;
		ListNode next;
		while(temp!=null&&temp.getNext()!=null){
			next=temp.getNext();
			int data=temp.getData();
			temp.setData(next.getData());
			next.setData(data);
			temp=temp.getNext().getNext();
		}		
	}
	
	public void reverseList(){
		ListNode prev=null;
		ListNode curr=head;
		ListNode next=head.getNext();
		while(next!=null){
			curr.setNext(prev);
			prev=curr;
			curr=next;
			next=next.getNext();
		}
		curr.setNext(prev);
		head=curr;
	}

	public void rotate(int n){
		n=n%length;
		if(head==null||n==0){
			return ;
		}
		ListNode headtemp=head;
		ListNode temp=head,prev=head,curr=head;
		int count=1;
		while(curr.getNext()!=null){
			if(count==n)
				prev=curr;		
			if(count==n+1){
				temp=curr;
			}
			curr=curr.getNext();
				count++;
		}		
		head=temp;
		prev.setNext(null);
		curr.setNext(headtemp);
	}

	/*Give a linkedlist and a value k.partition it such that all nodes less than K comes b4 nodes greater than or equal to K.
	You should preserve the original relative order of the nodes in each of the two partitions.*/
	
	public void partition(int K){
		ListNode root=new ListNode(0);
		ListNode pivot=new ListNode(K);
		ListNode rootNext=root;
		ListNode pivotNext=pivot;
		ListNode curr=head;
		while(curr!=null){
			ListNode next=curr.getNext();
			if(curr.getData()>=K){
				pivotNext.setNext(curr);
				pivotNext=curr;
				pivotNext.setNext(null);
			}
			else{
				rootNext.setNext(curr);
				rootNext=curr;
			}
			curr=next;
		}
		rootNext.setNext(pivot.getNext());
		head=root.getNext();
	}

	public ListNode reverseKNodes(ListNode head,int k){
		ListNode curr=head;
		ListNode next=null;
		ListNode prev=null;
		int count=k;
		while(curr!=null&&count>0){
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
			count--;
		}
		if(next!=null){
			head.setNext(reverseKNodes(next,k));
		}
		return prev;
	}

	public void removeDuplicates(){
		Map<Integer,Boolean> mapper=new HashMap<Integer,Boolean>();
		ListNode curr=head,next;
		mapper.put(head.getData(),true);
		while(curr.getNext()!=null){
			next=curr.getNext();
			if(mapper.get(next.getData())!=null){
				curr.setNext(next.getNext());
			}else{
				mapper.put(next.getData(),true);
				curr=curr.getNext();
			}
		}
	}

	public void clearList(){
		head=null;
		length=0;
	}
	public static void main(String[] args){
		LinkedList l1=new LinkedList();
		for(int i=0;i<7;i++)
			l1.insert(5*i,i);
		l1.insert(17,0);
		System.out.println(l1.getHead());
		l1.insertAtBegin(new ListNode(11));
		l1.insertAtEnd(new ListNode(17));
		l1.remove(2);
		ListNode duplicate=new ListNode(17);
		l1.insertAtEnd(duplicate);
		l1.removeMatched(duplicate);
		System.out.println(l1.getPosition(15));
		System.out.println(l1);
		System.out.println(l1.middle());
		System.out.println("LinkedList is "+l1.isEvenOrOdd());
		l1.exchangeAdjacentNodes();
		System.out.println(l1);
		l1.reverseList();
		System.out.println(l1);
		l1.head=l1.reverseKNodes(l1.head,3);
		System.out.println(l1);
		l1.rotate(2);
		System.out.println(l1);
		l1.partition(15);
		System.out.println(l1);	
		l1.removeDuplicates();
		System.out.println(l1);
	}
}
class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data){
		this.data=data;
	}
	public void setData(int data){
		this.data=data;
	}
	public int getData(){
		return this.data;
	}
	public void setNext(ListNode next){
		this.next=next;
	}
	public ListNode getNext(){
		return this.next;
	}
}
