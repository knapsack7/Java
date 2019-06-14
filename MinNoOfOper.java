import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MinNoOfOper{
     static int[] arr;
     public static int minNoOperations(){
    	 int result=0,i,len=arr.length,count_zeroes=0;
    	 while(true){
    		 count_zeroes=0;
    		 for(i=0;i<len;i++){
    			 if((arr[i]&1)==1)
    				 break;
    			 else if(arr[i]==0)
    				 count_zeroes++;
    		 }
    		 if(count_zeroes==len){
    			 return result; 
    		 }
    		 if(i==len){
    			 for(int k=0;k<len;k++)
    				 arr[k]/=2;
    			 result++;
    		 }
    		 for(;i<len;i++){
    				 if((arr[i]&1)==1){
    					 --arr[i];
    				 result++;
    				 }
    		 }
    	 }
     }
     public static void main(String[] args) throws NumberFormatException,IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the Desired Array ");
     String[] s=br.readLine().split(" ");
     arr=new int[s.length];
     for(int i=0;i<s.length;i++)
    	 arr[i]=Integer.parseInt(s[i]);
     System.out.println("Minimum Number of Operations required to operate to convert to desired array is:\n"+minNoOperations());
    }
}
