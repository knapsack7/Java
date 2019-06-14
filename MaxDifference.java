import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Max difference b/w two numbers such that bigger number is present at higher index than smaller number*/
public class MaxDifference {
	    static int[] arr;
	    public static int maxDiff(){
	    	int maxDiff=arr[1]-arr[0];
	    	int smallest=arr[0];
	    	for(int i=1;i<arr.length;i++){
	    	   if(arr[i]-smallest>maxDiff)
	    		   maxDiff=arr[i]-smallest;
	    	   if(arr[i]<smallest)
	    		   smallest=arr[i];
	    	}
	    	return maxDiff;
	    }
	    public static void main(String[] args) throws NumberFormatException,IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the Array ");
	    String[] s=br.readLine().split(" ");
	    arr=new int[s.length];
	    for(int i=0;i<s.length;i++)
	   	arr[i]=Integer.parseInt(s[i]);
	    System.out.println("Answer : "+maxDiff());
	    }
}
