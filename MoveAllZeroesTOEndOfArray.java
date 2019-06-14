import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MoveAllZeroesTOEndOfArray {
	static int[] arr;
    public static void pushZeroesToEnd(){
   	  int count=0;
   	  for(int i=0;i<arr.length;i++){
   		  if(arr[i]!=0){
   			  arr[count++]=arr[i];
   		  }
   	  }
   	  while(count<arr.length)
   		  arr[count++]=0;
    }
    public static void main(String[] args) throws NumberFormatException,IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the Array ");
    String[] s=br.readLine().split(" ");
    arr=new int[s.length];
    for(int i=0;i<s.length;i++)
   	arr[i]=Integer.parseInt(s[i]);
    System.out.println("Array after operation ");
    pushZeroesToEnd();
    for(int i:arr)
    	System.out.print(i+" ");
    }
}
 