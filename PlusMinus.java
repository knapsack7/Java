import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PlusMinus{
public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]=br.readLine().split(" ");
		int nums[]=new int[n];
		double cnt1=0,cnt2=0,cnt3=0;
		for(int i=0;i<n;i++){
			nums[i]=Integer.parseInt(s[i]);
			if(nums[i]<0)
				cnt1++;
			else if(nums[i]>0)
			   cnt2++;
			else
				cnt3++;
			}
	System.out.printf("%.6f\n%.6f\n%.6f",cnt2/n,cnt1/n,cnt3/n);	
		}
}