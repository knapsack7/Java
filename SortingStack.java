import java.util.*;
class SortingStack{
	static Stack<Integer> stk=null;
	public static void arrangeStack(){
		if(stk.isEmpty())
			return;
		int temp=stk.pop();
		arrangeStack();
		sort(temp);	
	}

	public static void sort(int num){
		if(stk.isEmpty()){
			stk.push(num);
			return;
		}
		else{
			int temp;
			if(num<stk.peek()){
				temp=stk.pop();
				sort(num);
				stk.push(temp);
			}
			else{
				stk.push(num);
			}		
		}
	}
	
	public static void main(String[] args){
		stk=new Stack<Integer>();
		stk.push(6);
		stk.push(5);
		stk.push(4);
		stk.push(3);
		stk.push(2);
		stk.push(1);
		System.out.println("Initial Stack : "+stk);
		arrangeStack();
		System.out.println("Final Stack : "+stk);
	}
}
