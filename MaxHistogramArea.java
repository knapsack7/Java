import java.util.Deque;
import java.util.LinkedList;
public class MaxHistogramArea {
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
    MaxHistogramArea mh=new MaxHistogramArea();
    int[] input={2,1,2,5,4,0,1,1,1,1};
    int maxarea=mh.maxArea(input);
    System.out.println(maxarea);
	}

}
