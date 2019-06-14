import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MinimumAbsolute{
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] ele=new int[n];
		for(int i=0;i<n;i++)
			ele[i]=Integer.parseInt(s[i]);
		Arrays.sort(ele);
		int diff=Integer.MAX_VALUE;
		   for (int i=0; i<n-1; i++)
		      if (ele[i+1]-ele[i]<diff)
		          diff=ele[i+1]-ele[i];
		System.out.println(diff);
	}
}