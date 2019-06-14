import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EqualizeTheArray{
	public static int minDeletions(int[] a) {
    	int max=1;
    	Map<Integer,Integer>nums=new HashMap<>();
    	for(int i:a){
    	   if(!nums.containsKey(i))
    	     nums.put(i,1);
    	   else{
    	        nums.put(i,nums.get(i)+1);
    	        if(max<nums.get(i))
    	        max=nums.get(i);
    	        }
    	}
    	System.out.println(max);
    	return a.length - max;
    	}
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	int[] num=new int[n];
    	for(int i=0;i<n;i++)
    		num[i]=scan.nextInt();
    	int ans=minDeletions(num);
    	System.out.println(ans);
    	scan.close();
    }
    
}
