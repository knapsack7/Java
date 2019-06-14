import java.util.*;
class ReverseQueue{
	public static Queue reverseQueue(Queue q){
		Stack<Integer> stk=new Stack<Integer>();
		while(!q.isEmpty()){
			stk.push((Integer)q.poll());
		}
		while(!stk.isEmpty()){
			q.offer((Integer)stk.pop());
		}
		return q;		
	}

	public static void main(String[] args){
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(2);
		q.add(4);
		q.add(7);
		System.out.println(q);
		q=reverseQueue(q);
		System.out.println(q);
	}
}
