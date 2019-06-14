/*Given an array A[0...n-1] containing n positive integers,a subArray A[i....j] is Bitonic if there is a k with i<=k<=j such that
 * A[i]<=A[i+1].....<=A[k]>=A[k+1]>=...A[j-1]>=A[j]  
 */
public class MaxLengthBitonicSubArray {
    public static int maxLength(int[] arr,int len){
    	int[] inc=new int[len];
    	int[] dec=new int[len];
    	inc[0]=1;
    	dec[len-1]=1;
    	for(int i=1;i<len;i++)
    		inc[i]=arr[i]>arr[i-1]?inc[i-1]+1:1;
    	for(int i=len-2;i>=0;i--)
        	dec[i]=arr[i]>arr[i+1]?dec[i+1]+1:1;
        int max=inc[0]+dec[0]-1;
        for(int i=1;i<len;i++)
        	if(inc[i]+dec[i]>max)
        		max=inc[i]+dec[i]-1;
        return max;
    }
    public static void main(String[] args) {
		int[] arr={12,4,78,90,45,23};
		System.out.println(maxLength(arr,arr.length));
	}
}
