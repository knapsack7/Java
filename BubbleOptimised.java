import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BubbleOptimised{
	public static int[] bubblesort(int[] arr){
		boolean isswapp=true;
		int temp;
		for(int ite=arr.length-1;ite>=0&& isswapp;ite--){
			isswapp=false;
			for(int i=0;i<=ite-1;i++){
				if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				isswapp=true;
				}
			}
			System.out.println("ite-"+ite);
		 }
		 return arr;
	}
    public static void main(String[] args) throws NumberFormatException,IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int len=0;
    	System.out.println("Enter Array Length:");
    	len=Integer.parseInt(br.readLine());
    	System.out.println("Enter Array elements:");
    	String[] s=br.readLine().split(" ");
    	int[] A=new int[len];
    	for(int i=0;i<s.length;i++)
    		A[i]=Integer.parseInt(s[i]);
    	A=bubblesort(A);
    	for(int i:A)
    		System.out.print(i+" ");
    	}
}
