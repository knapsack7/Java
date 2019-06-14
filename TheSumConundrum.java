import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TheSumConundrum{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		String[] s=br.readLine().split(" ");
		for(int i=0;i<s.length;i++)
		  arr[i]=Integer.parseInt(s[i]);	
		int len=s.length;
		Arrays.sort(arr);
		int shubhsum=0,cnt=0;
		for(int i=0;i<len;i++)
			if(arr[i]>0){
				shubhsum+=arr[i];
				arr[i]=0;
				cnt++;
			}
		if(cnt!=num){
		int m=0,n=0;
		if(cnt!=0){
			m=num-cnt-1;
			n=m-1;
		}
		else{
			n=num-1;
			m=n-1;
		}
		while(n>=0){
			shubhsum+=arr[n];
			n-=2;
		}
		}
		System.out.println(shubhsum);
	}
}