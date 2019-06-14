import java.util.*;

public class BuyMaximumStocks{
    static long buyMaximumProducts(int n, long k, int[] a) {
    long maxStocks=0;
    int cheapitem=0;
    while(k>cheapitem){
      cheapitem=Integer.MAX_VALUE;
      int loc=0;
      for(int i=0;i<n;i++){
    	  if(a[i]<cheapitem){
    		  cheapitem=a[i];
    		  loc=i+1;
    	  }
      }
      long maxstock=k/a[loc-1]<=loc?k/a[loc-1]:loc;
      maxStocks+=maxstock;
      k=k-maxstock*a[loc-1];
      a[loc-1]=Integer.MAX_VALUE;
     }
    return maxStocks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
