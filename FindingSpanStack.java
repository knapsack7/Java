/*Time Complexity=O(n)*/
import java.util.*;
public class FindingSpanStack{
	public static int[] spanStack(int[] inputArray){
		int[] spans=new int[inputArray.length];
		Stack<Integer> stk=new Stack<Integer>();
		for(int i=0;i<inputArray.length;i++){
			if(stk.isEmpty()){
				stk.push(i);
				spans[i]=0;
				continue;
			}
			int temp=inputArray[i];
			while(!stk.isEmpty()&&(temp>=inputArray[(Integer)stk.peek()]))
				stk.pop();
			if(!stk.isEmpty())
				spans[i]=i-(Integer)stk.peek()-1;
			else
				spans[i]=i;
			stk.push(i);
		}	
		return spans;
	}
	public static void main(String[] args){
		int[] arr={100,30,10,20,25,40,26,35,45};
		arr=spanStack(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
