import java.util.*;
public class InterLeavingQueue{
	static Queue<Integer> q=null;
	public static Queue<Integer> interleavingQueue(){
		Deque<Integer> temp1=new LinkedList<Integer>();
		Deque<Integer> temp2=new LinkedList<Integer>();
		if(q.size()%2==1)
			throw new IllegalArgumentException("No. of Queue elements must be EVEN");
		int i=1,limit=q.size()/2;
		while(i<=limit){
			temp1.add(q.remove());
			i++;
		}
		while(!q.isEmpty()){
			temp2.add(q.remove());	
		}
		
		while(!temp1.isEmpty()&&!temp2.isEmpty()){
			q.add(temp2.removeLast());
			q.add(temp1.removeLast());	
		}
		return q;
	}
	
	public static void main(String[] args){
		q=new LinkedList<Integer>();
		for(int i=20;i>=11;i--)
			q.add(i);
		System.out.println(q);
		System.out.println(interleavingQueue());
	}
}
