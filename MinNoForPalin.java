import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MinNoForPalin{
     static int[] arr;
     public static int minNoOperations(){
    	 int result=0;
    	 for(int i=0,j=arr.length-1;i<=j;){
    		 if(arr[i]==arr[j]){
    			 i++;
    			 j--;
    		 }
    		 else if(arr[i]<=arr[j]){
    			 arr[i+1]+=arr[i];
    			 i++;
    			 result++;
    		 }
    		 else {
    			 arr[j-1]+=arr[j];
    			 --j;
    			 result++;
    		 }
    	 }
    	return result;
     }
     public static void main(String[] args) throws NumberFormatException,IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the Array ");
     String[] s=br.readLine().split(" ");
     arr=new int[s.length];
     for(int i=0;i<s.length;i++)
    	 arr[i]=Integer.parseInt(s[i]);
     System.out.println("Minimum Number of Operations required to operate to given array to convert to palindrome is:\n"+minNoOperations());
    }
}
