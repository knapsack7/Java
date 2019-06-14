import java.util.*;
class RemoveAllAdjacentDuplicates{
	static Stack<Integer> stk;
	public static void removeAdjacentDuplicates(int[] arr){
		stk=new Stack<Integer>();
		int i=0;
		while(i<arr.length){
			if(!stk.isEmpty()&&arr[i]==stk.peek()){
				while(i<arr.length&&arr[i]==stk.peek())
					i++;
				stk.pop();
			}
			else{
				stk.push(arr[i]);
				i++;
			}
		}
		print();
	}
	public static void print(){
		if(stk.isEmpty())
			return;
		else{
			int temp=stk.pop();
			print();
			System.out.print(temp+" ");
		}
	}
	public static void main(String[] args){
		int[] arr={1,9,6,8,8,8,0,1,1,0,6,5};
		removeAdjacentDuplicates(arr);
	}
}
