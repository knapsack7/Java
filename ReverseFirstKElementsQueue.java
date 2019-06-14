import java.util.*;
public class ReverseFirstKElementsQueue{
	static Queue<Integer> q=null;
	public static void reverseFirstKElements(int k){
		if(k>q.size()||q==null)
			throw new IllegalArgumentException("Wrong Parameters");
		else if(k<q.size()){
			Stack<Integer> stk=new Stack<Integer>();
			for(int i=0;i<k;i++)
				stk.push(q.remove());
			while(!stk.isEmpty())
				q.add(stk.pop());
			for(int i=0;i<q.size()-k;i++)
				q.add(q.remove());		
		}	
	} 

	public static void main(String[] args){
		int num=10;
	q=new LinkedList<Integer>();
	for(int i=0;i<9;i++){
			q.add(num);
			num+=10;	
	}
	System.out.println(q);
	reverseFirstKElements(4);
	System.out.println(q);	
	}
}
