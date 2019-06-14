package Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MigratoryBirds {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] arr=new int[6];
		for(int i=0;i<n;i++){
			arr[Integer.parseInt(s[i])]++;
		}
	    int max=arr[0],add=0;
	    for(int i=0;i<6;i++)
	    	System.out.print(arr[i]+" ");
	    for(int i=5;i>=1;i--){
			if(arr[i]>=max){
	    		max=arr[i];
	    		add=i;
			}
	    }
	    System.out.println(add);
	}
}
