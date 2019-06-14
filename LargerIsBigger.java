
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LargerIsBigger{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n-->0){
		String str=br.readLine();
		char[] arr=str.toCharArray();
		int len=arr.length;
        int loc1=0;
        for(int i=1;i<len;i++){
        	if(arr[i-1]<arr[i]){
        		loc1=i;
        	}
        }
        char ch=' ';
        int loc2=0;
        if(loc1==0)
        	System.out.print("no answer");
        else{
        for(int j=loc1;j<len;j++)
        	if(arr[j]>arr[loc1-1]){
        		ch=arr[j];
        		loc2=j;
        	}
       arr[loc2]=arr[loc1-1];
       arr[loc1-1]=ch;
       for(int i=loc1,j=len-1;i<(loc1+len-1)/2+1;i++,j--){
    	   ch=arr[i];
    	   arr[i]=arr[j];
    	   arr[j]=ch;
    	  }
       for(char k:arr)
    	   System.out.print(k);
        }
      System.out.println();  
	}
	}
}

