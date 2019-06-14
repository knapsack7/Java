import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SnakeEating{
        public static void main(String[] args) throws NumberFormatException,IOException{
       	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int T=Integer.parseInt(br.readLine());    
         while(T-->0){
        	 String[] s=br.readLine().split(" ");
        	 int N=Integer.parseInt(s[0]);
        	 int Q=Integer.parseInt(s[1]);
        	 String[] s1=br.readLine().split(" ");
        	 int[] arr=new int[N];
        	 for(int i=0;i<N;i++)
        		 arr[i]=Integer.parseInt(s1[i]);
        	 Arrays.sort(arr);
        	 int add=0;
        	 while(Q-->0){
        		 int num=Integer.parseInt(br.readLine());
        		 for(int i=0;i<N;i++){
        			 if(arr[i]>=num){
        				 add=i-1;
        				 break;
        			 }
        		 }
        	int ans=N-add-1;
        	int tobeeated=num-arr[add];	 
        	}
         }
	}
}
