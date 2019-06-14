import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayRotation{
	public static void main(String[] args)  throws NumberFormatException,IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s[]=br.readLine().split(" ");
			String s1[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int k=Integer.parseInt(s[1]);
			int q=Integer.parseInt(s[2]);
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(s1[i]);}
			int j=1,temp;
			k=k%n;
			while(j<=k){
				temp = arr[0];
				arr[0]=arr[n-1];
				for(int i=0;i<n-1;i++){
					     int temp1=arr[i+1];
					     arr[i+1]=temp;
					     temp=temp1;}
			j++;}
           while(q-->0){
        	   System.out.println(arr[Integer.parseInt(br.readLine())]);
           }
}
}
