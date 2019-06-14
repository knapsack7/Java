import java.util.*;
public class MaximumHistogramArea{
	public static int maximumArea(int[] arr){
		Stack<Integer> stk=new Stack<Integer>();
		int i=0,top=0,maxArea=0;
		if(arr==null||arr.length==0)	
			return 0;
		while(i<arr.length){
			if(stk.isEmpty()||arr[i]>=arr[stk.peek()]){
				stk.push(i++);
			}
			else{
				top=stk.pop();
				maxArea=Math.max(maxArea,arr[top]*(stk.isEmpty()?i:i-stk.peek()-1));			
			}
		}
		while(!stk.isEmpty()){
				top=stk.pop();
				maxArea=Math.max(maxArea,arr[top]*(stk.isEmpty()?i:i-stk.peek()-1));
		}
		return maxArea;
	}
	public static void main(String[] args){
		int[] ar={2,1,2};
		System.out.println("Maximum Area "+maximumArea(ar));
	}
}
