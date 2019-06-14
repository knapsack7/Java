import java.util.Arrays;
import java.util.Scanner;

public class MARRAYS {
    public static long calcQuality(long[] arr){
    	long temp1=0,temp2=0,sum=0,k=1;
    	for(int i=0;k<arr.length/2;i=i+2){
    		temp1=Math.abs(arr[i]-arr[i+3]);
    		temp2=Math.abs(arr[i+1]-arr[i+2]);
    		sum=sum+(temp1>temp2?temp1:temp2)*k;
    		k++;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] arr;
		long[] maxmin=null;
		while (T-- > 0) {
			int N = sc.nextInt();
			maxmin = new long[2 * N];
			int maxIng=0, k = 0;
			while (N-- > 0) {
				maxIng = sc.nextInt();
				arr = new long[maxIng];
				for (int i = 0; i < maxIng; i++)
					arr[i] = sc.nextInt();
				Arrays.sort(arr);
				maxmin[k++] = arr[0];
				maxmin[k++] = arr[arr.length - 1];
			}
//			for(int i:maxmin)
//				System.out.print(i+" ");
			System.out.println(calcQuality(maxmin));
			
		}
		sc.close();
	}
}
