import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr,int num){
    int mid=0,first=0,last=arr.length-1;
    while(first<=last){
    	mid=(first+last)/2;
        if(arr[mid]==num)
        	return mid+1;
        if(arr[mid]>num)
    			last=mid-1;
    	else
    			first=mid+1;
    }
    return -1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
    Arrays.sort(arr);
    int num=sc.nextInt();
    int loc=binarySearch(arr,num);
    if(loc==-1)
    	System.out.println("Entered number does not exist.");
    else
    	System.out.println("Pos "+loc);
    sc.close();
    }
}
