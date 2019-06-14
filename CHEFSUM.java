import java.util.Scanner;
public class CHEFSUM {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     while(T-->0){
    	 int max=Integer.MAX_VALUE;
    	 int index=0;
    	 int n=sc.nextInt();
    	 int[] arr=new int[n];
    	 for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
         for(int i=0;i<n;i++){
        	 if(arr[i]<max){
        		 max=arr[i];
        		 index=i;
        	 }
         }
         System.out.println(index+1);
     }
     sc.close();
     }
}
