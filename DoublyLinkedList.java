class DLLNode{
	private int data;
	private DLLNode prev;
	private DLLNode next;

	public DLLNode(int data){
		this.data=data;
		prev=null;
		next=null;
	}
	
	public DLLNode(int data,DLLNode prev,DLLNode next){
		this.data=data;
		this.prev=prev;
		this.next=next;
	}
	
	public int getData(){
		return data;
	}
		
	public void setData(int data){
		this.data=data;
	}
	
	public DLLNode getPrev(){
		return this.prev;
	}
		
	public DLLNode getNext(){
		return this.next;
	}
	
	public void setPrev(DLLNode where){
		prev=where;
	}
		
	public void setNext(DLLNode where){
		next=where;
	}
}

public class DoublyLinkedList{
	private DLLNode head;
	private DLLNode tail;
	private int length;
	public DoublyLinkedList(){
		head=new DLLNode(Integer.MIN_VALUE,null,null);
		tail=new DLLNode(Integer.MIN_VALUE,head,null);
		head.setNext(tail);
		length=0;
	}
	
	public int get(int position){
		return Integer.MIN_VALUE;
	}
	
	public int getPosition(int data){
		DLLNode temp=head;
		int pos=0;
		while(temp!=null){
			if(temp!=null){
				return pos;
			}
			pos+=1;
			temp=temp.getNext();
		}
		return Integer.MIN_VALUE;
	}
	
	public int length(){
		return length;
	}
	
	public void insert(int newValue){
		DLLNode newNode=new DLLNode(newValue,head,head.getNext());
		newNode.getNext().setPrev(newNode);
		head.setNext(newNode);
		length+=1;
	}

	public void insert(int data,int position){
		if(position<0){
			position=0;
		}
		if(position>0){
			position=length;
		}
		if(head==null){
			head=new DLLNode(data);
			tail=head;
		}
		else if(position==0){
			DLLNode temp=new DLLNode(data);
			temp.setNext(head);
			head=temp;
		}
		else{
			DLLNode temp=head;
			for(int i=1;i<position;i+=1){
				temp=temp.getNext();
			}
			DLLNode newNode=new DLLNode(data);
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);
			newNode.getPrev().setNext(newNode);
			temp.setNext(newNode);
		}
		length+=1;
	}

	public void insertTail(int newValue){
		DLLNode newNode=new DLLNode(newValue,tail,null);
		tail.setNext(newNode);
		newNode.getPrev().setNext(newNode);	
		length+=1;
	}

	public void remove(int position){
		if(position<0){
			position=0;
		}
		if(position>=length){
			position=length-1;
		}
		if(head==null){
			return;
		}
		if(position==0){
			head=head.getNext();
			if(head==null)
				tail=null;
		}
		else{
			DLLNode temp=head;
			for(int i=1;i<position;i++){
				temp=temp.getNext();
			}
			temp.getNext().setPrev(temp.getPrev());
			temp.getPrev().setNext(temp.getNext());
		}
		length-=1;
	}

	public synchronized void removeMatched(DLLNode node){
		if(head==null)
			return;
		if(node.equals(head)){
			head=head.getNext();
			if(head==null)
				tail=null;
			return;
		}
		DLLNode p=head;
		while(p!=null){
			if(node.equals(p)){
				p.getPrev().setNext(p.getNext());
				p.getNext().setPrev(p.getPrev());
				return;
			}
		}
	}
		
	public int removeHead(){
		if(length==0){
			return Integer.MIN_VALUE;
		}
		DLLNode save=head.getNext();
		head.setNext(save.getNext());
		save.getNext().setPrev(head);
		length-=1;
		return save.getData();
	}
	
	public int removeTail(){
		if(length==0)
			return Integer.MIN_VALUE;
		DLLNode save=tail.getPrev();
		head.setPrev(save.getPrev());
		save.getPrev().setNext(tail);
		length-=1;
		return save.getData();
	}

	public String toString(){
		String result="[]";
		if(length==0)
			return result;
		result="["+head.getNext().getData();
		DLLNode temp=head.getNext().getNext();
		while(temp!=tail){
			result+=","+temp.getData();
			temp=temp.getNext();
		}
		return result+"]";
	} 

	public void clearList(){
		head=null;
		tail=null;
		length=0;
	} 

	public static void main(String[] args){
		DoublyLinkedList dll=new DoublyLinkedList();
		for(int i=1;i<=5;i++){
			dll.insert(i*7,i);
		}
		dll.insert(3);
		System.out.println(dll);
		dll.getPosition(14);
		System.out.println(dll);
		dll.get(21);
		dll.insertTail(111);
		System.out.println(dll);
		dll.remove(3);
		System.out.println(dll);
		dll.removeHead();
		System.out.println(dll);
		dll.removeTail();
		System.out.println(dll);
	}
}
