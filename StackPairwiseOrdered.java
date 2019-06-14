import java.util.*;
public class StackPairwiseOrdered{
	static Stack<Integer> stk=null;
	public static boolean checkStackPairwiseOrdered(){
		Queue<Integer> q=new LinkedList<Integer>();
		boolean stackOrdered=true;
		while(!stk.isEmpty())
			q.add(stk.pop());
		while(!q.isEmpty())
			stk.push(q.remove());
		while(!stk.isEmpty()){
			int n=stk.pop();
			q.add(n);
			if(!stk.isEmpty()){
				int m=stk.pop();
				q.add(m);
				if(Math.abs(m-n)!=1)
					stackOrdered=false;
			}
		}
		while(!q.isEmpty()){
			stk.push(q.remove());
		}
		return stackOrdered;
	} 
	
	public static void main(String[] args){
		stk=new Stack<Integer>();
		stk.push(4);
		stk.push(3);	
		stk.push(-2);
		stk.push(-3);
		stk.push(11);
		stk.push(10);
		stk.push(5);
		stk.push(6);
		stk.push(20);
		System.out.println(checkStackPairwiseOrdered());
	}
}
