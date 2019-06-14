import java.util.Scanner;


public class MaxIncreasingSubArray {
     /**
	 *Counting the maximum number of of increasing SubArrays in a given array  
	 */
	public static int maxIncreasingSubArrays(int[] arr,int N){
		int count=0,len=1;
		for(int i=0;i<N-1;i++){
			len=1;
			while(i<N-1&&arr[i]<arr[i+1]){
				len++;
				i++;
			}
			count+=(len*(len-1))/2;
		}
		return count;
	}
	public static void main(String[] args) {
      	Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
        System.out.println(maxIncreasingSubArrays(arr,N));
        sc.close();
    }

}
