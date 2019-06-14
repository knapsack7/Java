import java.util.*;
class ReverseStack{
	static Stack<Integer> stk=null;
	public static void reverseStack(){
		if(stk.isEmpty())
			return;
		int temp=stk.pop();
		reverseStack();
		insertAtBottom(temp);	
	}

	public static void insertAtBottom(int data){
		if(stk.isEmpty()){
			stk.push(data);
			return;
		}
		int temp=stk.pop();
		insertAtBottom(data);
		stk.push(temp);
	}
	
	public static void main(String[] args){
		stk=new Stack<Integer>();
		for(int i=1;i<6;i++){
			stk.push(i);
		}
		System.out.println("Initial Stack : "+stk);
		reverseStack();
		System.out.println("Reverse Stack : "+stk);
	}
}
