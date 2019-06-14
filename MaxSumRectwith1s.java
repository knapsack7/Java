import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class MaxSumRectwith1s{
	public int maxArea(int[] input){
		Deque<Integer> stack=new LinkedList<Integer>();
		int maxArea=0;
		int area;
		int i;
		for(i=0;i<input.length;){
			if(stack.isEmpty()||input[stack.peekFirst()]<=input[i]){
				stack.offerFirst(i++);
			}else{
				int top=stack.pollFirst();
				if(stack.isEmpty()){
					area=input[top]*1;
				}else{
					area=input[top]*(i-stack.peekFirst()-1);
				}
				if(area>maxArea){
					maxArea=area;
				}
			}
		}
		while(!stack.isEmpty()){
			int top=stack.pollFirst();
			if(stack.isEmpty()){
				area=input[top]*i;
			}else{
				area=input[top]*(i-stack.peekFirst()-1);
			}
			if(area>maxArea){
				maxArea=area;
			}
		}
		return maxArea;
	}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    MaxHistogramArea mh=new MaxHistogramArea();
    int dimen=0;
    System.out.println("Enter dimension for 2-D matrix\n");
    dimen=sc.nextInt();
    int[] input=new int[dimen];
    System.out.println("Enter elements for 2-D matrix\n");
    for(int i=0;i<dimen;i++)
    	for(int j=0;j<dimen;j++)
    		input[j]=input[j]+sc.nextInt();
    int maxarea=mh.maxArea(input);
    System.out.println(maxarea);
	sc.close();
	}
}
